package com;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.entity.Login;
import com.repository.LoginRepository;
import com.service.LoginService;

import jakarta.annotation.PostConstruct;

@SpringBootApplication(scanBasePackages = "com")
@EntityScan(basePackages = "com.entity")
@EnableJpaRepositories(basePackages = "com.repository")
//@EnableDiscoveryClient
public class LoginMicroServiceAppApplication {

	@Autowired
	LoginRepository loginRepository;
	
	@PostConstruct				// this method call once all resources are ready
	public void initMethod() {
		Optional<Login> op = loginRepository.findById("admin@gmail.com");
		if(op.isPresent()) {
			System.err.println("Admin account present");
		}else {
			Login ll = new Login();
			ll.setEmailid("admin@gmail.com");
			ll.setPassword("admin@123");
			ll.setTypeofuser("admin");
			loginRepository.save(ll);
			System.err.println("Admin account created sucessfully");
		}
	}
	
	public static void main(String[] args) {
		SpringApplication.run(LoginMicroServiceAppApplication.class, args);
		System.err.println("login micro server up on port number 8181");
	}

}
