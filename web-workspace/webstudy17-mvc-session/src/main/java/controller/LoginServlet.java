package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.MemberVO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String id = request.getParameter("memberId"); //set id and its parameter to memberId
	String password= request.getParameter("memberPass");
	String url=null;
	if(id.equals("java")&&password.equals("abcd")) {//if id and password matches
		HttpSession session=request.getSession();//HttpSession의 값을 담고 있는 session이라는 객체를 생성하고 이 객체 안에 resquest안의 getSession()의 값을 파라미터로 담는다
		session.setAttribute("mvo", new MemberVO(id,null,"아이유",null));//mvo 라는 이름으로 세션에 MemberVO의 값들을 저장
		url="login-ok.jsp";
	}else {
		url="login-fail.jsp";
	}
	response.sendRedirect(url);
	}

}
