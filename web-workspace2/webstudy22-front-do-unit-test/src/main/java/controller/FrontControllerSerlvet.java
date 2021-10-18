package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FrontControllerSerlvet
 */
@WebServlet("*.do")
public class FrontControllerSerlvet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getRequestURI());
		System.out.println(request.getContextPath());
		//contextPath와 .do를 제외한 컨트롤러 명만 추출
		String uri = request.getRequestURI();
		String contextPath=request.getContextPath();
		System.out.println(uri.substring(contextPath.length()+1,uri.length()-3));
		System.out.println("*************");
		String str1="/kosta/RegController.do";
		String context="/kosta";
		System.out.println(str1.substring(6));
		System.out.println(str1.substring(6)+1);
		System.out.println(context.length());
		System.out.println(str1.substring(context.length()+1));
		System.out.println(str1.length());
		System.out.println(str1.substring(0,23-3));
		System.out.println(str1.substring(context.length()+1,str1.length()-3));
		String str2="/a/b.do";
		String context2="/a";
		System.out.println();
		
	
	}

}
