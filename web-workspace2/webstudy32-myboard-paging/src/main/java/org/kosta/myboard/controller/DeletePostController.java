package org.kosta.myboard.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.myboard.model.BoardDAO;

public class DeletePostController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		if(request.getMethod().equals("POST")==false)
			throw new ServletException("deleting post is only accepted in post method");
		String no = request.getParameter("no");
		BoardDAO.getInstance().deletePostByNo(no);
		
		return "redirect:ListController.do";
	}

}
