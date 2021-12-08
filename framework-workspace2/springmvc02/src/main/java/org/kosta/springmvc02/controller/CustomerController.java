package org.kosta.springmvc02.controller;

import org.kosta.springmvc02.model.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {
	private CustomerMapper customerMapper;
	@Autowired
	public CustomerController() {
		super();
		// TODO Auto-generated constructor stub
	}

	@RequestMapping("getTotalCustomerCount.do")
	public String getTotalCustomerCount(Model model) {
		model.addAttribute("totalCount",customerMapper.getTotalCustomerCount());
		return "customer-count";
	}
}