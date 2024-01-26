package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	// http://localhost:8080
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String sayHello() {
		return "Welcome to First simple micro web service";
	}
}
