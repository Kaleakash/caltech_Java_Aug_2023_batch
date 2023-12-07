package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.bean.Employee;
import com.service.EmployeeService;


// http://localhost:8080/SimpleRestAPI/rest/employees/*
	
@Path("employees")
public class EmployeeController {

	// http://localhost:8080/SimpleRestAPI/rest/employees/findAll
		
	@GET
	@Path("findAll")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> findAllEmployee() {
		List<Employee> listOfEmp = new ArrayList<>();
		Employee emp1 = new Employee(100, "Steven", 34000);
		Employee emp2 = new Employee(101, "Rajesh", 36000);
		Employee emp3 = new Employee(102, "Leena", 38000);
		listOfEmp.add(emp1);
		listOfEmp.add(emp2);
		listOfEmp.add(emp3);
		return listOfEmp;
	}
	
	EmployeeService es = new EmployeeService();
	
	// http://localhost:8080/SimpleRestAPI/rest/employees/findAllEmployeeFromDb
	
	@GET
	@Path("findAllEmployeeFromDb")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> findAllEmployeeFromDb() {
		return es.findAllEmployee();
	}
	
	// http://localhost:8080/SimpleRestAPI/rest/employees/findEmployeeByQuery?id=100

	@GET
	@Path("findEmployeeByQuery")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee findEmployeeUsingQueryParam(@QueryParam("id") int id) {
		// we can call service layer code. 
		return es.findEmployeeById(id);
	}
	
	
	// http://localhost:8080/SimpleRestAPI/rest/employees/findEmployeeByPath/100
	@GET
	@Path("findEmployeeByPath/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee findEmployeeUsingPathParam(@PathParam("id") int id) {
		// we can call service layer 
		return es.findEmployeeById(id);
	}
	
	
	
	
	
	
	
}



