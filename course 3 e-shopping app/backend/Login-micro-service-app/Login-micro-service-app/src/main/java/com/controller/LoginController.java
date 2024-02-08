package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Login;
import com.service.LoginService;

@RestController
@RequestMapping("login")
@CrossOrigin					// disable cors features so fronend technology can all 
public class LoginController {

	@Autowired
	LoginService loginService;
	
	// http://localhost:8181/login/signIn
	
	@PostMapping(value = "signIn",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String signIn(@RequestBody Login login) {
		return loginService.signIn(login);
	}
	
	// http://localhost:8181/login/signUp
	@PostMapping(value = "signUp",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String signUp(@RequestBody Login login) {
		return loginService.signUp(login);
	}
}
