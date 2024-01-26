package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = "com")		// Enable @RestController 
@EnableDiscoveryClient
public class FirstMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstMicroServiceApplication.class, args);
		System.err.println("First micro service up on port number 8080");
	}

}
