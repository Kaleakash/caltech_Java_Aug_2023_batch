package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.Login;
import com.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	LoginService loginService;
	// http://localhost:8080/
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String login(Model model,Login login) {  // DI for Model API part of spring boot
		System.out.println("Login Page open");	// model is like ModelAndView class reference 
			model.addAttribute("ll", login);   // store login object in model scope. 
		return "login";
	}
	
	@RequestMapping(value = "/checkLogin",method = RequestMethod.POST)
	public String signIn(Login login) {  // DI for Model API part of spring boot
		 
		return loginService.signIn(login);
	}
	
	
	@RequestMapping(value = "/signUpPage",method = RequestMethod.GET)
	public String signUpOpen(Model model,Login login) {  // DI for Model API part of spring boot
		System.out.println("SigUp Page Open");	// model is like ModelAndView class reference 
			model.addAttribute("ll", login);   // store login object in model scope. 
		return "signUp";
	}
	
	
	@RequestMapping(value = "/accountCreate",method = RequestMethod.POST)
	public String signUp(Model model,Login login) {  // DI for Model API part of spring boot
		System.out.println("Account Created...");	// model is like ModelAndView class reference 
			model.addAttribute("ll", login);   // store login object in model scope. 
			String result = loginService.signUp(login);
			model.addAttribute("msg", result);
		return "signUp";
	}
	
}
