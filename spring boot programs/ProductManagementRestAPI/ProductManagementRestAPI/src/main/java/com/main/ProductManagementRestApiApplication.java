package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com")  // Enable @RestController, @Service @Repository 
// by default it check all the class part of same package part sub package of same package. 
@EntityScan(basePackages = "com.bean")		// Enable @Entity annotation classes. 
@EnableJpaRepositories(basePackages = "com.repository")// enable spring data features. 
public class ProductManagementRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductManagementRestApiApplication.class, args);
		System.out.println("spring boot is up!");
	}

}
