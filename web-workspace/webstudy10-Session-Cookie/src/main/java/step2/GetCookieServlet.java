package step2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetCookieServlet
 */
@WebServlet("/GetCookieServlet")
public class GetCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>home</title>");
		out.println("</head>");
		out.println("<body>");
		String name = getServletName();
		out.println("<h3>"+name+"</h3>");
		Cookie[] cookies = request.getCookies();
		if(cookies!=null) {
			boolean flag = false;

			//make the cookies array using for loop to show cookie's value which name is time
			for(int i =0;i<cookies.length;i++) {
				if(cookies[i].getName().equals("time")) {
					out.println("client로부터 받아온 time cookie value:"+cookies[i].getValue());
					flag=true;
					break;
				}
			}
			if(flag==true) {
				
			}
		}else {
			out.println("no cookie exists");
		}
			out.println("<br><br><a href = SetCookieServlet>go to SetCookieServlet</a>");

		
		out.println("</body>");
		out.println("</html>");
		out.close();
	
	}

}
