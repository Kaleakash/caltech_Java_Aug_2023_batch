package com.eshopping.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import com.eshopping.bean.Login;
import com.eshopping.service.LoginService;

@Path("login")
public class LoginController {
LoginService ls = new LoginService();
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("signin")
	public String signIn(Login login) {
		System.out.println(login.getEmail()+" "+login.getPassword()+" "+login.getTypeofuser());
		return ls.signIn(login);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("signup")
	public String signUp(Login login) {
		
		return ls.signUp(login);
	}
}
