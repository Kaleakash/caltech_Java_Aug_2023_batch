package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnotherController {

	// http://localhost:8181
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String sayHello() {
		return "Welcome to Spring micro service another project";
	}
}

