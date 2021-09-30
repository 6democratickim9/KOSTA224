package step4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.MemberVO;

/**
 * Servlet implementation class SessionThreeServlet
 */
@WebServlet("/SessionThreeServlet")
public class SessionThreeServlet extends HttpServlet {
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
		//getSession(): if session exsists, return exsisting session. if null, make and return new session
		HttpSession session = request.getSession(false);
		if(session!=null) {
			session.invalidate();
			out.println("session invalidated");
			
		}else {
			out.println("session doesn't exsists");
		}
		out.println("session id:"+session.getId()+"<br><br>");
		//session.setAttribute("nick", session);
		//session.setAttribute("mvo", new MemberVO("java","1234","IU","jongro"));
		//out.println("save members infos in session<br><br>");
		out.println("<a href=SessionOneServlet> go to SessionOneervlet</a>");
		out.println("<a href=SessionTwoServlet> go to SessionTwoServlet</a>");
		out.println("</body>");
		out.println("</html>");
	}

}
