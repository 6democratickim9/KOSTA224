package step1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BasicServlet extends HttpServlet{

	private static final long serialVersionUID = 5321989723167363912L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");//text기반의 html문서라는 것을 명시
		PrintWriter out = response.getWriter();
		out.println("<h3>BasicServlet doGet method 실행</h3>");
		out.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	resp.setContentType("text/html");
	}
	
	
}
