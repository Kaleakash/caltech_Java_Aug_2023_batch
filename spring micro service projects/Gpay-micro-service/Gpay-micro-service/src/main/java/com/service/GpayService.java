package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bean.Gpay;
import com.repository.GpayRepository;

@Service
public class GpayService {

	@Autowired
	GpayRepository gpayRepository;
	
	@Autowired
	RestTemplate restTemplate;				// get the object from method with @bean class. 
	
	public String createAccount(Gpay gpay) {
		gpayRepository.save(gpay);
		return "Account created";
	}
	
	public String findGpayDetails(int gpayid) {
		Optional<Gpay> op = gpayRepository.findById(gpayid);
		if(op.isPresent()) {
			Gpay gp = op.get();
			return "Your emailid is "+gp.getEmailid();
		}else {
			return "Gpay account not exists";
		}
	}
	
	public String findAccountBalance(int gpayid) {
		Optional<Gpay> op = gpayRepository.findById(gpayid);
		if(op.isPresent()) {
			Gpay gp = op.get();
			// we are calling account micro service with help of gpay micro service. 
			//return restTemplate.getForObject("http://198.45.67.12:8282/account/findBalanceByEmailid/"+gp.getEmailid(), String.class);
			//return restTemplate.getForObject("http://localhost:8282/account/findBalanceByEmailid/"+gp.getEmailid(), String.class);
			return restTemplate.getForObject("http://ACCOUNT-SERVICE/account/findBalanceByEmailid/"+gp.getEmailid(), String.class);
			//return "Your emailid is "+gp.getEmailid();
		}else {
			return "Gpay account not exists";
		}
	}
}







