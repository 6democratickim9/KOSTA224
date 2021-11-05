package org.kosta.myboard.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.myboard.model.BoardDAO;
import org.kosta.myboard.model.PagingBean;
import org.kosta.myboard.model.PostVO;

public class ListController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int totalPostCount=BoardDAO.getInstance().getTotalPostCount();
		PagingBean pagingBean = new PagingBean(totalPostCount);
		ArrayList<PostVO> list=BoardDAO.getInstance().getPostingList(pagingBean);
		//template layout 페이지를 이용해 리스트 화면을 제공 
		request.setAttribute("list", list);
		request.setAttribute("", pagingBean);
		request.setAttribute("url", "board/list.jsp");
		return "layout.jsp";
	}
}
