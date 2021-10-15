package org.kosta.webstudy21.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FrontControllerServlet
 */
//get "command" that client send
//use the HandlerMapping and get return Controller object
//run Controller object
//실행 후 반환받는 view path를 이용해 forward 방식 또는 redirect 방식으로 클라이언트에게 응답한다
@WebServlet("/FrontControllerServlet")
public class FrontControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doDispatch(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		try {
			String command=request.getParameter("command");
			Controller controller=HandlerMapping.getInstance().create(command);
			String path=controller.execute(request, response);
			if(path.startsWith("redirect:")) {
				response.sendRedirect(path.substring(9));
			}else {
				request.getRequestDispatcher(path).forward(request, response);
			}
			
		}catch(MethodNotAllowedException me) {
			me.printStackTrace();
			response.sendRedirect("method-error.jsp");
		}
		catch(Exception e) {
			e.printStackTrace();
			response.sendRedirect("error.jsp");
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doDispatch(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		doDispatch(request,response);
	}

}
