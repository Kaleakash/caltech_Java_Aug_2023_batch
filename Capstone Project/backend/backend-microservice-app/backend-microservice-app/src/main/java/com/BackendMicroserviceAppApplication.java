package com;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.entity.Login;
import com.repository.LoginRepository;

import jakarta.annotation.PostConstruct;

@SpringBootApplication(scanBasePackages = "com")
@EntityScan(basePackages = "com.entity")
@EnableJpaRepositories(basePackages = "com.repository")
@EnableDiscoveryClient
public class BackendMicroserviceAppApplication {

	@Autowired
	LoginRepository loginRepository;
	
	@PostConstruct
	public void init() {
		Optional<Login> result = loginRepository.findById("admin@gmail.com");
		if(result.isPresent()) {
			System.out.println("Admin account already present");
		}else {
			Login ll = new Login();
			ll.setEmailid("admin@gmail.com");
			ll.setPassword("admin@123");
			ll.setTypeofuser("admin");
			loginRepository.save(ll);
			System.out.println("Admin account create..");
		}
	}
	
	public static void main(String[] args) {
		SpringApplication.run(BackendMicroserviceAppApplication.class, args);
		System.err.println("micro service up on port number 9090");
	}

}
