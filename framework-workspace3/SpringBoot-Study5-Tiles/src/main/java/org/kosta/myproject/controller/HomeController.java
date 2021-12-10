package org.kosta.myproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home() {
		// db, model 과 연동 
		// tiles-config.xml 에 정의된 definition name인 home.tiles를 이용해
		// view를 제공 
		return "home.tiles";
	}
	//
}







