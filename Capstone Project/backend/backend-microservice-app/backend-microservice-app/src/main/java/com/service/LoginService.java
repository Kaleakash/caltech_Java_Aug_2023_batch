package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Login;
import com.repository.LoginRepository;

@Service
public class LoginService {

	@Autowired
	LoginRepository loginRepository;
	
	
	public String signIn(Login login) {
		Optional<Login> result = loginRepository.findById(login.getEmailid());
		
		if(result.isPresent()) {
			
			Login ll = result.get();
			if(ll.getPassword().equals(login.getPassword())) {
			
				if(ll.getTypeofuser().equals("admin")) {
					return "admin success";
				}else {
					return "customer success";
				}
				
			}else {
				return "Password is invalid";
			}
		
		}else {
			return "Emailid is invalid";
		}
		
	}
	
	
	
	public String signUp(Login login) {
		Optional<Login> result = loginRepository.findById(login.getEmailid());
		if(result.isPresent()) {
			return "Emailid id must be unique";
		}else if(login.getTypeofuser().equals("admin")){
			return "You can't create admin account";
		}else {
			loginRepository.save(login);
			return "Account created successfully";
		}
		
	}
}
