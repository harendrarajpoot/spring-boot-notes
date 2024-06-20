package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {
	
	@GetMapping("/home")
	public String home()
	{
		System.out.println("HOme Method-------");
		
		return "home";// return as a html page
	}
	
	@GetMapping("/about")
	public String about()
	{
		System.out.println("about Method-------");
		
		return "about";
	}
	
	@GetMapping("/login")
	public String login()
	{
		System.out.println("Login Method-------");
		
		return "login";
	}

	@PostMapping("/submitform")
	public String submitForm()
	{
		
		return "welcome";
		
	}
	
}
