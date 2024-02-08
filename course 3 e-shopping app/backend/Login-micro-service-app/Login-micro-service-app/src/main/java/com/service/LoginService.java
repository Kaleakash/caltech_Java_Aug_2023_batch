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
	
	public String signUp(Login login) {
		Optional<Login> op = loginRepository.findById(login.getEmailid());
		if(op.isPresent()) {
			return "EmailId already present, Account didn't create";
		}else {
			//Login ll = op.get();
			if(login.getTypeofuser().equals("admin")) {
				return "You can't create admin account";
			}else {
				loginRepository.save(login);
				return "Account created successfully";
			}
		}
	}
	public String signIn(Login login) {
		Optional<Login> op = loginRepository.findById(login.getEmailid());
		if(op.isPresent()) {
			Login ll = op.get();
			if(ll.getPassword().equals(login.getPassword())) {
				if(ll.getTypeofuser().equals("admin")) {
					return "Admin login successfully";
				}else {
					return "Customer login successfully";
				}
			}else {
				return "Password is invalid";
			}
		}else {
			return "Emailid is wrong";
		}
	}
}
