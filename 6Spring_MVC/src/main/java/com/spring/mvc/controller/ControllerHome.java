package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class ControllerHome {
	
	@RequestMapping("/home")
	public String home() {
		
		return "home";
	}
	@RequestMapping("/login")
	public String LoginPage() {
		
		return "login";
	}

}
