package org.kosta.springmvc04.model.controller;

import org.kosta.springmvc04.model.mapper.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	private ItemMapper itemMapper;
	
	@Autowired
	public HomeController(ItemMapper itemMapper) {
		super();
		this.itemMapper = itemMapper;
	}
	
	@RequestMapping("home.do")
	public String home(Model model) {
		model.addAttribute("totalItemCount",itemMapper.getTotalItemCount());
		return "index";
	}
}
