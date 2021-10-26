package org.kosta.webstudy27.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.kosta.webstudy27.model.MemberDAO;
import org.kosta.webstudy27.model.MemberVO;

public class LoginController implements Controller {
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id=request.getParameter("id");//index.jsp에서 id를 받아온다
		String password=request.getParameter("password");//index.jsp에서 password를 받아온다
		MemberVO vo=MemberDAO.getInstance().login(id, password);//MemberDAO 에 있는 login에서 
		String path=null;
		if(vo==null) {
			path="redirect:login-fail.jsp";
		}else {
			path="redirect:index.jsp";
			HttpSession session=request.getSession();//HttpSession이 존재하면 현재 HttpSession을 반환하고 존재하지 않으면 새로이 세션을 생성
			session.setAttribute("mvo", vo);//이름이 mvo인 속성의 값을 vo로 지정한다
		}
		return path;
	}
}
