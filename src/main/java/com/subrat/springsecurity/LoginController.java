package com.subrat.springsecurity;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	@RequestMapping(value="/welcome", method=RequestMethod.GET)
	public String printWelcome(ModelMap map, Principal principal){
		
		System.out.println("********Logincontroller is called******");
		String name=principal.getName();
		map.addAttribute("username",name);
		map.addAttribute("message", "Spring Security custom form Example");
		
		return"hello";
		
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login(ModelMap map){
		return "login";
	}

	@RequestMapping(value="/loginfailed", method=RequestMethod.GET)
	public String loginError(ModelMap map){
		map.addAttribute("error","true");
		return "login";
	}
	
	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public String logout(ModelMap map){
		return "login";
	}
	
	@RequestMapping(value="/*", method=RequestMethod.GET)
	public String home(ModelMap map){
		return "home";
	}
}
