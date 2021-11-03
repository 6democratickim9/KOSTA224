package org.kosta.myboard.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class WritePostController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session= request.getSession(false);
		if(session==null||session.getAttribute("mvo")==null)
			return "redirect:ListController.do";
		request.setAttribute("url", "board/write.jsp");
		return "layout.jsp";
	}

}
