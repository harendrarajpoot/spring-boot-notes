package com.spring.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String submitForm(HttpServletRequest request,Model model)
	
	{
		String uname=request.getParameter("username");// fetch value from html form input username field se 
		String pwd=request.getParameter("password");//  fetch value from html form input password field se 
		/*Map<String, String>map =new HashMap();
		
		map.put("uname", uname);
		map.put("pwd", pwd);*/
		model.addAttribute("uname", uname);// set value of username in model in key and value pair
		model.addAttribute("pwd", pwd);// set value of password in model in key and value pair
		
		System.out.println("Submit------------------------"+uname);
		System.out.println("Submit------------------------"+pwd);
		
		return "welcome";
		
	}
	
}
