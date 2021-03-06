package step4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ContextTest1
 */
public class ContextTest1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContextTest1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();//printwriter의 속성을 out에 할당하고 response의 getWriter
		String name=getServletConfig().getServletName();//servlet config에서 servletname으로 들어가 서블렛의 이름을 가져온다
		out.println("<h3>"+name+"에서 ServletContext를 테스트</h3>");
		String info=getServletConfig().getServletContext().getInitParameter("security");
		out.println("ServletContext로부터 정보를 받아옴"+info);
		out.close();
	}


}
