package com.xworkz.mobile.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")

public class MobileController {
	public MobileController() {
		System.out.println("MobileController object is created");
	}
	
	@RequestMapping(value="/mobile.do")
	public String submit(@RequestParam String name,@RequestParam String brand,@RequestParam String Ram,
			@RequestParam String price, Model model ) {
		
		
		System.out.println("invoked submit()");
		System.out.println(name + " " + brand + " " + Ram + " " + price );
		model.addAttribute("display", "Thank u for purchasing  " + name);
		//		return"/WEB-INF/display.jsp";
				return "mobile.jsp";
		
	}

}
