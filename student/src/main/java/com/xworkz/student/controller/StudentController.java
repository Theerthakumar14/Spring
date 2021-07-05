package com.xworkz.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xworkz.student.dto.StudentDTO;
@Controller
public class StudentController {

	public StudentController() {
		System.out.println("StudentController object is created");
	}
	
	@RequestMapping(value="/student.do", method=RequestMethod.GET)
	public String onSubmit(@ModelAttribute StudentDTO studentDTO ,Model model) {
		System.out.println("invoked submit");
		System.out.println(studentDTO);
		
		model.addAttribute("display", "Thanks for submitting the form");
		return "Student.jsp";
	}
	

}
