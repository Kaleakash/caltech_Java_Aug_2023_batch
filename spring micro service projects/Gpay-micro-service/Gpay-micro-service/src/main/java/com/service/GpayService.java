package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Gpay;
import com.repository.GpayRepository;

@Service
public class GpayService {

	@Autowired
	GpayRepository gpayRepository;
	
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
}
