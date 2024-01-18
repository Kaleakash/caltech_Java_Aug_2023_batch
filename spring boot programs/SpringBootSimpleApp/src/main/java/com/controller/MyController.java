package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

	// http://localhost:9191/displayPage 
	
	@RequestMapping(value = "displayPage",method = RequestMethod.GET)
	public String openPage() {
		System.out.println("I Came here");
		return "display";	// view resolver check the page with name display
							//inside web page folder. 
	}
}
