package com.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	
	@GetMapping({"/","/index","/home"})
	public String defaultUrl()
	{
		return "Home Page";
	}
	
	@GetMapping("/hey")
	public String heyKomal()
	{
		return "Hi Komal, Welcome to Springboot Application";
	}
	
	@GetMapping("/hi")
	public String heyHarendra()
	{
		return "Hi Harendra, Welcome to Springboot Application";
	}

}
