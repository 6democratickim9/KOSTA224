package org.kosta.webstudy20.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.webstudy20.model.MockDAO;

public class DeleteCustomerController implements Controller {

	//receive the client id that client send
	//run the deleteCustomer method in MockDAO
	//redirect to delete-result.jsp
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String customerId=request.getParameter("customerId");
		MockDAO.getInstance().deleteCustomer(customerId);
		return "redirect:delete-result.jsp";
	}

}
