package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")		// equal to component scan in xml file enable @controller, @ervice, @repository 
public class SpringBootWthThymeleafWithJdbcTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWthThymeleafWithJdbcTemplateApplication.class, args);
		System.out.println("spring boot up!");
	}

}
