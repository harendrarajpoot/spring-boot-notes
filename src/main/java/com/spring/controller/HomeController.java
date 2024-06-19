package com.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entities.Employee;

@RestController
@RequestMapping("/api/")
public class HomeController {
	List<Employee> al = new ArrayList<>();// instance variable . we can access value as global
	
	@GetMapping({"/","/index","/home"})
	public String defaultUrl()
	{
		return "Home Page";
	}
	
		
	// if you want save data then we can use @postMapping
	// we have created rest api as a post api to create new resource.
	@PostMapping("/save")
	public String saveData( @RequestBody Employee emp)
	{// @requestBody Annotation is used to convert json data in to object
		
		al.add(emp);
		
		return "data has been successfully...";// 
	}
	
	// if you want to fetch data then we can use @Getmapping
	// we have created rest api to get data from server 
	@GetMapping("/getdata")
	public List<Employee> getData()
	{
		System.out.println("calling getAPI...."+al);// agr 
	
		/*for (Employee employee : al) {
			
			System.out.println(employee.getEmail());
			System.out.println(employee.getEmpid());
			System.out.println(employee.getFname());
			System.out.println(employee.getLname());
			System.out.println(employee.getMobile());
			
		}
		*/
		return al;
		
	}
	
	// if you want to delete data we can use @DeleteMapping 
	// we have created rest api to delete from arraylist
	@DeleteMapping("/delete")
	public String deleteData()
	{
		System.out.println("Calling Delete API...");
		
		al.remove(0);
		return "data has been deleted successfully...";
		
		
	}
	
	// if you wnt to update exits data then we can use @PutMapping 
	//we have created rest api to update data from arraylist
	@PutMapping("/update")
	public String updateData( @RequestBody Employee emp)
	{
		System.out.println(" Calling Update API...");
		
		al.set(0, emp);
		
		return "data udpated successfully...";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@GetMapping("/hey")
	public String heyKomal()
	{
		return "Hi Komal, Welcome to Springboot Application";
	}
	
	@GetMapping("/hi")
	//@RequestMapping(value="/hi",method=RequestMethod.GET)
	
	public String heyHarendra()
	{
		return "Hi Harendra, Welcome to Springboot Application";
	}
	
	

}
