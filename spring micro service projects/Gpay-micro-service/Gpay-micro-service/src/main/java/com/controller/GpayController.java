package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Gpay;
import com.service.GpayService;

@RestController
@RequestMapping("gpay")
public class GpayController {

	@Autowired
	GpayService gpayService;
	
	// http://localhost:8383/gpay/create 
	// method post 
	// {"emailid":"steven@gmail.com"}
	
	@PostMapping(value = "create",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String accountCreate(@RequestBody Gpay gpay) {
		return gpayService.createAccount(gpay);
	}
	
	// http://localhost:8383/gpay/findEmailid/1
	// method get 
	
	@GetMapping(value = "findEmailid/{gpayid}")
	public String findEmailiId(@PathVariable("gpayid") int gpayid) {
		return gpayService.findGpayDetails(gpayid);
	}
	
	
	// http://localhost:8383/gpay/findBalance/1
		// method get 
		
		@GetMapping(value = "findBalance/{gpayid}")
		public String findBalance(@PathVariable("gpayid") int gpayid) {
			return gpayService.findAccountBalance(gpayid);
		}
}
