package com.example.demo;

import javax.naming.spi.DirStateFactory.Result;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo.model.alien;

import ch.qos.logback.core.model.Model;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	
	@RequestMapping("/")
	public String home() {
       
		return "index";
	}
	@RequestMapping("add")
	public String add(@RequestParam("num1") int i , @RequestParam("num2") int j, ModelMap m) {
				
		int num3 = i + j ;
		m.addAttribute("num3", num3);
		
		return "result";
		
	}
	
	@RequestMapping("addAlien")
	public String adaAlian(@ModelAttribute ("a1") alien a, ModelMap m) {
		
    
		
		return "result";
		
	}

}