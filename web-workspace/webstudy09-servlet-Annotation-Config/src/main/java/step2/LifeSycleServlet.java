package step2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeSycleServlet
 */
//실행 시에 url 패턴을 지정해주는 어노테이션
//어노테이션이 무엇이냐고 질문이 오면 컴파일 시 영향을 주는 의미있는 주석이라고 대답하자!
//웹어플리케이션 실행시점에 미리 해당 서블릿을 초기화하도록 web.xml에서 load-on-startup 설정을 어노테이션 방식으로 설정해본다
@WebServlet(urlPatterns="/LifeSycleServlet",loadOnStartup=1)
public class LifeSycleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * making servlet object can be run once
     */
    public LifeSycleServlet() {
        super();
        // TODO Auto-generated constructor stub
        System.out.println("make LifeCylceServlet object");
    }
    public void init() throws ServletException{
    	System.out.println("run init()");
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("Annotation 설정 기반 서블릿 테스트"+getServletConfig().getServletName());
		out.close();
	}
	/*
	 * destroy 는 서비스 종료 직전 (was 종료 직전)에 한 번 호출
	 */
	
	public void destroy()
	{
		System.out.println("run destroy()");
	
	}
	
}
