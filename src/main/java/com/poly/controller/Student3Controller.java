package com.poly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.poly.bean.lab3.Student3;



@Controller
public class Student3Controller {

	@GetMapping("/student/form")
	public String form(Model model) {
		Student3 student = new Student3();
		student.setFullname("Nguyen Thi A");
		student.setCountry("VN");
		student.setGender(true);
		model.addAttribute("sv", student);
		return "student/form";
	}
	
	@PostMapping("/student/save")
	public String save(@ModelAttribute("sv") Student3 form) {
		return "student/success";
	}
}
