package org.kosta.webstudy28.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.webstudy28.model.EmployeeDAO;

public class EmployeeListController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setAttribute("empList", EmployeeDAO.getInstance().getAllEmployeeList());
		return "list.jsp";
	}

}
