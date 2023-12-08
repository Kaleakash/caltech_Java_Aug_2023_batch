package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;
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
	
	// http://localhost:8080/SimpleRestAPI/rest/employees/storeEmployeeByPathParam/3/Lex/14000
	
	@GET
	@Path("storeEmployeeByPathParam/{id}/{name}/{salary}")
	@Produces(MediaType.APPLICATION_JSON)
	public String storeEmployeeUsingPathParam(@PathParam("id") int id,@PathParam("name") String name,
			@PathParam("salary") float salary) {
		// we can call service layer 
		Employee emp = new Employee();
		emp.setId(id);
		emp.setName(name);
		emp.setSalary(salary);
		return es.storeEmployee(emp);
	}
	// http://localhost:8080/SimpleRestAPI/rest/employees/storeEmployee
	// data {"id":5,"name":"Neena","salary":28000}
	@POST
	@Path("storeEmployee")
	@Consumes(MediaType.APPLICATION_JSON)
	public String storeEmployee(Employee emp) {	// emp consume json data from post body method. 
//		System.out.println(" id "+emp.getId());
//		System.out.println("name "+emp.getName());
//		System.out.println("salary "+emp.getSalary());
		return es.storeEmployee(emp);
	}
	
	// http://localhost:8080/SimpleRestAPI/rest/employees/deleteEmployee/1
	@DELETE
	@Path("deleteEmployee/{id}")
	@Produces(MediaType.TEXT_PLAIN)
	public String deleteEmployeeRecord(@PathParam("id") int id) {
		return es.deleteEmployeeInfo(id);
	}
	
	
	// http://localhost:8080/SimpleRestAPI/rest/employees/updateEmployeeSalary
	// data {"id":5,"salary":28000}
	
	@PATCH
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("updateEmployeeSalary")
	public String updateSalary(Employee emp) {
		return es.updateEmployeeSalary(emp);
	}
}



