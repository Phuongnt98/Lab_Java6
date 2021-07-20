package com.poly.controller;

import java.io.File;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.poly.bean.lab2.Student;

@Controller
public class HomeController {
	@RequestMapping("/home/index")
	public String index(Model model) throws Exception {
		model.addAttribute("message", "Welcome to THymeleaf");
		
		ObjectMapper mapper = new ObjectMapper();
		String path = "E:\\Mon java5\\Lab_java8\\src\\main\\resources\\student.json";
		Student student = mapper.readValue(new File(path), Student.class);
		model.addAttribute("sv", student);
		
		return "home/index";
	}
}
