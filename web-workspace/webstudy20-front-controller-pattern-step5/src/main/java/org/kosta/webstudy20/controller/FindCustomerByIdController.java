package org.kosta.webstudy20.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.webstudy20.model.MockDAO;

public class FindCustomerByIdController implements Controller {
	/**
	 *  index.jsp 의 검색 form에서 전송한 고객 아이디를 전달받아 MockDAO 와 연동한 후 
	 *  null 이면 findbyid-fail.jsp 를 리턴하고
	 *  null 이 아니면 findbyid-ok.jsp를 리턴하되 결과페이지에 고객정보가 제공되도록 request에 정보를 할당한다 
	 */
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id=request.getParameter("id");
		String customerInfo=MockDAO.getInstance().findCustomerById(id);
		String path=null;
		if(customerInfo==null) {
			path="findbyid-fail.jsp";
		}else {
			path="findbyid-ok.jsp";
			request.setAttribute("customerInfo", customerInfo);
		}
		return path;
	}
}









