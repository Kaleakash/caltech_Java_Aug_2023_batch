package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Account;
import com.service.AccountService;

@RestController
@RequestMapping("account")			// account base path http://localhost:8383/account/*
public class AccountController {

	
	@Autowired
	AccountService accountService;
	
	// http://localhost:8282/account/createAccount 
	// method post 
	// data {"accno":123,"name":"Steven","amount":1000,"emailid":"steven@gmail.com"}
	
	@PostMapping(value = "createAccount",consumes = MediaType.APPLICATION_JSON_VALUE)
	//@RequestMapping(value = "createAccount",consumes = MediaType.APPLICATION_JSON_VALUE,method = RequestMethod.POST)
	public String createAccunt(@RequestBody Account account) {
		return accountService.createAccount(account);		
	}
	
	// http://localhost:8282/account/findBalance/123
	// method get 
	@GetMapping(value = "findBalance/{accno}")
	public String findBalance(@PathVariable("accno") int accno) {
		return accountService.findBalance(accno);
	}
	
	
	// http://localhost:8282/account/findBalanceByEmailid/steven@gmail.com
		// method get 
		@GetMapping(value = "findBalanceByEmailid/{emailid}")
		public String findBalanceUsingEmailId(@PathVariable("emailid") String emailid) {
			return accountService.findBalanceByEmailId(emailid);
		}
}




