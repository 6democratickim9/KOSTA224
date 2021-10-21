package org.kosta.webstudy27.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.webstudy27.model.MockDAO;

public class FindCustomerByIdController implements Controller {

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
