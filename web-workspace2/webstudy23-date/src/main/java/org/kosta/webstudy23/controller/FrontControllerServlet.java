package org.kosta.webstudy23.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * get the controller from URI that the client requested
 * get returned the Controller from HandlerMapping
 * run the Controller
 * After Controller runs, use the path and move to view for responding in redirect or forward.
 */
@WebServlet("*.do")
public class FrontControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doDispatch(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try{
			String uri=request.getRequestURI();
			String command=uri.substring(request.getContextPath().length()+1, uri.length()-3);
			Controller controller=HandlerMapping.getInstance().create(command);
			String path=controller.execute(request, response);
			if(path.startsWith("redirect:")) {
				response.sendRedirect(path.substring(9));
			}
		}catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("error.jsp");// TODO: handle exception
		}
		
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doDispatch(request,response);
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		request.setCharacterEncoding("utf-8");//request body의 data 인코딩- 한글처리
		doDispatch(request, response);
	}

}
