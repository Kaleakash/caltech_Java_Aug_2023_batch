package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping(value = "/hi")	// by default get method consider 
	public ModelAndView sayHi() {
		
		System.out.println("I Cam in sayHi method");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("display1.jsp");
		return mav;
	}
	
	@RequestMapping(value = "/hello",method = RequestMethod.GET)	// by default get method consider 
	public ModelAndView sayHello() {
		
		System.out.println("I Cam in sayHello method");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("display2.jsp");
		return mav;
	}
}
