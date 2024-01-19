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
		System.out.println("I Came Here");	// model is like ModelAndView class reference 
		model.addAttribute("ll", login);   // store login object in model scope. 
		return "login";
	}
	
	@RequestMapping(value = "/checkLogin",method = RequestMethod.POST)
	public String signIn(Model model,Login login) {  // DI for Model API part of spring boot
		System.out.println(login.getEmailid()+" "+login.getPassword());
		model.addAttribute("ll", login);   // store login object in model scope. 
		String result = loginService.signIn(login);
		return result;
	}
}
