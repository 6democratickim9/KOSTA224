package org.kosta.myproject.controller;

import org.kosta.myproject.model.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
	private DepartmentMapper departmentMapper;
	
	@Autowired
	public EmployeeController(DepartmentMapper departmentmapper) {
		super();
		this.departmentMapper = departmentmapper;
	}


	@GetMapping("employeeAjaxTestView")
	public String employeeAjaxTestView(Model model) {
		model.addAttribute("deptList",departmentMapper.getDepartmentList());
		return "employee/list";
	}

}
