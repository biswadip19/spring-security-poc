/**
 * 
 */
package com.mypoc.controller;

//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.logging.Logger;

/**
 * @author biswadipmukherjee
 *
 */
@Controller
public class WelcomeMvcController {

	public WelcomeMvcController(){
		System.out.println("WelcomeMvcController....");
	}
	
	@RequestMapping(path = "/loginPage",method = RequestMethod.GET)
	public String renderWelcomeMvcLoginPage() {
		System.out.println("Inside renderWelcomeMvcLoginPage");
		return "loginPage";
	}
	
	@RequestMapping(path = "/homePage",method = RequestMethod.GET)
	public String renderWelcomeMvc1Page(ModelMap model) {
		System.out.println("Inside renderWelcomeMvc1Page");
		//model.put("name", getLoggedinUserName());
		return "homepage";
	}

	/*
	private String getLoggedinUserName() {
		Object principal = SecurityContextHolder.getContext()
				.getAuthentication().getPrincipal();
		
		if (principal instanceof UserDetails) {
			return ((UserDetails) principal).getUsername();
		}
		
		return principal.toString();
	}
	*/

}

