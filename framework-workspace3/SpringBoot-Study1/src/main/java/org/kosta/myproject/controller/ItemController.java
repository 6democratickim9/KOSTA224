package org.kosta.myproject.controller;

import org.kosta.myproject.model.mapper.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ItemController {
	private ItemMapper itemMapper;

	@Autowired
	public ItemController(ItemMapper itemMaper) {
		super();
		this.itemMapper = itemMaper;
	}
	@RequestMapping("getTotalItemCount")
	public String getTotalItemCount(Model model) {
		model.addAttribute("totalItemCount",itemMapper.getTotalItemCount());
		return "item-count";
	}
}
