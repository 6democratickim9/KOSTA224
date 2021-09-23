package step5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckboxServlet
 */
public class CheckboxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckboxServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
//		String gender=request.getParameter("gender");
//		out.println(gender);
		
		out.println("CheckboxServelet doGet 실행");
		out.println("<hr>");
		//checkbox는 동일한 name으로 다수의 value가 전송될 수 있으므로
		//request.getParameterValues(name) : String []을 이용해서 입력받는다
		String menu[] = request.getParameterValues("menu");
		for(int i=0; i<menu.length;i++) {
			out.println(menu[i] + " ");
		}
		out.println("주문 완료");
		out.close();	
		
	
	}


}
