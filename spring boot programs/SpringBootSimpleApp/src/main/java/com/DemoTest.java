package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1st parameter main class reference and 
		// 2nd command line arguments 
		SpringApplication.run(DemoTest.class, args);
		System.out.println("spring boot up!");
		
	}

}
