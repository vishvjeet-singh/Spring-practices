package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class homeController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	@GetMapping("/signin")
	public String login() {
		return "login";
	}
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	@GetMapping("/profile")
	public String profile() {
		return "profile";
	}
	
	@PostMapping("/saveUser")
	public String saveUser(@ModelAttribute User user ,HttpSession session) {
		
     User u =userService.saveUser(user);
     if (u!=null) {
session.setAttribute("msg", "Register Successfully");		
	}
     else {
    	 session.setAttribute("msg", "Error");		
	}
     
		return "redirect:/register";
		
	}


}
