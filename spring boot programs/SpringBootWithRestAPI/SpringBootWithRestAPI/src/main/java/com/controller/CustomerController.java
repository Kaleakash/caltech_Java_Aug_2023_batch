package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Customer;

@RestController
public class CustomerController {

	// http://localhost:8080/customer 
	
	@RequestMapping(value = "customer",produces = MediaType.APPLICATION_JSON_VALUE)
	public Customer getCustomerInfo() {
		Customer c1 = new Customer(100, "John", 26);
		return c1;
	}
	// http://localhost:8080/customers
	
	@RequestMapping(value = "customers",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Customer> findAllCustomer() {
		List<Customer> listOfCustomer = new ArrayList<>();
		Customer c1 = new Customer(100, "John", 26);
		Customer c2 = new Customer(101, "Lena", 27);
		Customer c3 = new Customer(102, "Lex", 28);
		listOfCustomer.add(c1);
		listOfCustomer.add(c2);
		listOfCustomer.add(c3);
		return listOfCustomer;
	}
}
