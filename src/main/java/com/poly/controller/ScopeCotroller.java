package com.poly.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ScopeCotroller {

	@Autowired
	HttpServletRequest request;
	
	@Autowired
	HttpSession session;
	
	@Autowired
	ServletContext servletContext;
	
	@RequestMapping("/scope")
	public String hello(Model model) {
		model.addAttribute("a", "i am in model");
		request.setAttribute("b", "i am in request");
		session.setAttribute("c", "i am in session");
		servletContext.setAttribute("d", "i am in application");
		return "scope";
	}
}
