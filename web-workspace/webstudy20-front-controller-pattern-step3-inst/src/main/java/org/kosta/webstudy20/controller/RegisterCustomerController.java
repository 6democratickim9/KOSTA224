package org.kosta.webstudy20.controller;

import javax.servlet.http.HttpServletRequest;

public class RegisterCustomerController implements Controller{
	public String execute(HttepServletRequest request, HttpServletResponse response)throws Exception{
		String customerInfo=request.getParameter("customerInfo");
		MockDAO.getInstance().registerCustomer(custromerInfo);
		return "redirect:register-info.jsp";
	}
}