package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

	@RequestMapping(value = "demo")
	public @ResponseBody String sayHello() {
		return "Welcome to Spring boot with Rest api";
	}
}
