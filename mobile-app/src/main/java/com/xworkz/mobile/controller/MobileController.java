package com.xworkz.mobile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xworkz.mobile.dto.MobileDTO;
import com.xworkz.mobile.service.MobileService;

@Controller

public class MobileController {
	@Autowired
	private MobileService mobileService;

	public MobileController() {
		System.out.println("MobileController object is created");
	}

	@RequestMapping(value = "/mobile.do", method = RequestMethod.POST)
	public String submit(@ModelAttribute MobileDTO mobiledto, Model model) {
		System.out.println("invoked submit()");
		System.out.println(mobiledto);
		boolean mobileDetails = mobileService.validateMobileDetails(mobiledto);
		if (mobileDetails) {
			model.addAttribute("display", "Thank u for purchasing data is saved");
		} else {
			model.addAttribute("display", "something went wrong");

		}
		return "display";
		// return "mobile.jsp";

	}

}
