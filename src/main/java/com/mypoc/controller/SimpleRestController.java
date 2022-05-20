package com.mypoc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mypoc.dto.Employee;


@RestController
public class SimpleRestController {
	
	@GetMapping(path = "/welcome")
	public String welcome() {
		System.out.println("Inside welcome Rest controller");
		return "Welcome Rest Controller Home!!";
	}
	
	@GetMapping(path = "/employee")
	public String employeeDate() {
		System.out.println("Inside welcome Rest controller");
		
		Employee employee = new Employee();
		employee.setEmpName("Biswadip");
		employee.setEmpNo("550376");
		employee.setAddress1("Khardah");
		String jsondata = null; 
		try {
			jsondata =  new ObjectMapper().writeValueAsString(employee);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		return jsondata;
	}

}
