package com.mypoc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mypoc.dto.Employee;

@Controller
public class OlderRestController {

	@RequestMapping(path = "/welcome1",method = RequestMethod.GET)
	public @ResponseBody String welcome1() {
		System.out.println("Inside welcome older version of rest controller");
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
