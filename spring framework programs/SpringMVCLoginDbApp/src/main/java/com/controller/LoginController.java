package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Login;
import com.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	LoginService loginService;
	
	@RequestMapping(value = "signIn",method = RequestMethod.POST)
	public ModelAndView signIn(HttpServletRequest req,Login login) {  // DI for request and login object. 
		
		String emailid= req.getParameter("emailid");
		String password = req.getParameter("password");
		
		login.setEmailid(emailid);
		login.setPassword(password);
		
		ModelAndView mav = new ModelAndView();
		
		String result = loginService.signIn(login);
		
		System.out.println(result);
		if(result.equals("success")) {
			mav.setViewName("Home.jsp");
		}else {
			mav.setViewName("failure.jsp");
		}
		return mav;
	}
	
	
	@RequestMapping(value = "signUp",method = RequestMethod.POST)
	public ModelAndView signUp(HttpServletRequest req,Login login) {  // DI for request and login object. 
		
		String emailid= req.getParameter("emailid");
		String password = req.getParameter("password");
		
		login.setEmailid(emailid);
		login.setPassword(password);
		
		ModelAndView mav = new ModelAndView();
		
		String result = loginService.signUp(login);
		
		System.out.println(result);
		mav.addObject("msg", result);    // model scope equal to req.setAttribute("msg",result);
		mav.setViewName("signUp.jsp");
		return mav;
	}
	
}
