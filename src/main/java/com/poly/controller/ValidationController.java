package com.poly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.poly.bean.lab3.Student3;

@Controller
public class ValidationController {

	@GetMapping("/validation/form")
	public String form(Model model) {
		Student3 student = new Student3();
		model.addAttribute("sv", student);
		return "validation/form";
	}
	
	@PostMapping("/validation/validate")
	public String save(Model model, @Validated @ModelAttribute("sv") Student3 form, Errors err) {
		if(err.hasErrors()) {
			model.addAttribute("message", "Vui long sua cac loi sau:");
			return "validation/form";
		}
		return "validation/success";
	}
}
