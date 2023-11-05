package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home1() {
		return "home";
		
	}
	
	@RequestMapping("/about")
	public String about1() {
		return "about";
		
	}

	
}
