package com.xworkz.mobile.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.mobile.dto.MobileDTO;
import com.xworkz.mobile.entity.MobileEntity;
import com.xworkz.mobile.service.MobileService;
import com.xworkz.mobile.service.MobileServiceImpl;

@Controller

public class MobileController {
	@Autowired
	private MobileService mobileService;

	public MobileController() {
		System.out.println("MobileController object is created");
	}

	@RequestMapping(value = "/getWelcomeFile.do", method = RequestMethod.GET)
	public String getWelcomeFile() {
		System.out.println("invoked getWelcomeFile");
		return "Mobile";
	}

	@RequestMapping(value = "/mobile.do", method = RequestMethod.POST)
	public String submit(@ModelAttribute MobileDTO mobiledto, Model model) {
		System.out.println("invoked submit()");
		System.out.println(mobiledto);
		Map<String, String> map = MobileServiceImpl.map;
		boolean mobileDetails = mobileService.validateMobileDetails(mobiledto);

		if (mobileDetails) {
			System.out.println("if block");
			model.addAttribute("display", "Thank u for purchasing data is saved");
			return "display";
		} else {
			System.out.println("else block");
			model.addAttribute("ErrorWarningMobileName", map.get("MobileName"));
			model.addAttribute("ErrorWarningMobileBrand", map.get("MobileBrand"));
			model.addAttribute("ErrorWarningMobileRam", map.get("MobileRam"));
			model.addAttribute("ErrorWarningMobilePrice", map.get("MobilePrice"));
			return "Mobile";
		}
	}

	@RequestMapping(value = "/searchMobile.do")
	public String getMobileInfo(@RequestParam String name, Model model) {
		System.out.println("Invoked getMobileInfo through controller");
		MobileDTO mobileInfo = this.mobileService.getMobileInfo(name);
		if (mobileInfo != null) {
			model.addAttribute("name", mobileInfo.getName());
			model.addAttribute("brand", mobileInfo.getBrand());
			model.addAttribute("ram", mobileInfo.getRam());
			model.addAttribute("price", mobileInfo.getPrice());
			return "Mobile";
		} else {
			model.addAttribute("errorMessage", "Mobile not found");
			return "Mobile";
		}
	}

	@RequestMapping(value = "/MobileDetails.do")
	public String viewAllMobileDetails(Model model) {
		System.out.println("invoked mobile Details through controller");
		List<MobileEntity> allMobileDetails = this.mobileService.validateAllMobileDetails();
		if (!allMobileDetails.isEmpty()) {
			model.addAttribute("mobilelist", allMobileDetails);
			return "Mobile";
		}else {
			model.addAttribute("errorMessage", "something went wrong");
			return "Mobile";
		}

		

	}

}
