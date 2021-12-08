package org.kosta.springmvc04.controller;

import org.kosta.springmvc04.model.domain.ItemDTO;
import org.kosta.springmvc04.model.mapper.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
		model.addAttribute("totalItemCount", itemMapper.getTotalItemCount());
		return "index";
	}
	@RequestMapping("findItemByNo.do")
	public String findItemByNo(int itemNo,Model model) {
		String viewName=null;
		ItemDTO item=itemMapper.findItemByNo(itemNo);
		if(item==null) {
			viewName="findbyno-fail";
		}else {
			viewName="findbyno-success";
			model.addAttribute("itemDTO", item);
		}
		return viewName;
	}
	@GetMapping("getAllItemList.do")
	public String getAllItemList(Model model) {
		model.addAttribute("itemList",itemMapper.getAllItemList());
		return "item-list";
	}
	@PostMapping("registerItem.do")
	public String registerItem(ItemDTO itemDTO) {
		itemMapper.registerItem(itemDTO);		
		return "redirect:registerItemResult.do?itemNo="+itemDTO.getItemNo();
	}
	@RequestMapping("registerItemResult.do")
	public String registerItemResult(int itemNo,Model model) {
		model.addAttribute("itemDTO", itemMapper.findItemByNo(itemNo));
		return "register-item-result";
	}
}



























