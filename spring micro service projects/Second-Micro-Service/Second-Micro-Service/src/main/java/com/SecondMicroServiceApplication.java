package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = "com")
@EnableDiscoveryClient
public class SecondMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondMicroServiceApplication.class, args);
		System.err.println("Second micro service running on port number 8181");
	}

}
