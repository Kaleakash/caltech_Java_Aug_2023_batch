package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = "com")
@EntityScan(basePackages = "com.entity")
@EnableJpaRepositories(basePackages = "com.repository")
@EnableDiscoveryClient
public class BookCabMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookCabMicroServiceApplication.class, args);
		System.err.println("Cab Book micro service upon on port number 8282");
	}

	@Bean
	@LoadBalanced		// we can call micro service by name rather than physical ip address and port. 
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
