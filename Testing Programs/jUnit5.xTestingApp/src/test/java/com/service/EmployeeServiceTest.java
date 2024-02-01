package com.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.bean.Employee;

class EmployeeServiceTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before all test method - only once");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After all test method - only once");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before each test method - again and again");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("after each test method - again and again");
	}

	@Test
	//@Disabled
	void testGetEmployee() {
		//fail("Not yet implemented");
		System.out.println("get employee test method");
			EmployeeService es = new EmployeeService();
		Employee emp= es.getEmployee();
		assertNotNull(emp);// give object not null 
		assertEquals(100, emp.getId());
		assertEquals("Steven", emp.getName());
		assertEquals(12000, emp.getSalary());
	}

	@Test
	//@Disabled
	void testFindAllEmployees() {
		//fail("Not yet implemented");
		System.out.println("get find all employee test method");
			EmployeeService es = new EmployeeService();
		List<Employee> listOfEmp = es.findAllEmployees();
		assertEquals(3, listOfEmp.size());
		Employee emp = listOfEmp.get(1);
		assertEquals(101, emp.getId());
		assertEquals("Lex", emp.getName());
		assertEquals(15000, emp.getSalary());
	}

	@Test
	void testUpdateSalary() {
		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("Raj");
		emp.setSalary(12000);
		System.out.println("get update salary test method");
			EmployeeService es = new EmployeeService();
		float updatedSalary = es.updateSalary(emp);
		assertEquals(emp.getSalary()+5000, updatedSalary);
	}

	@Test
	void testCheckLogin() {
			EmployeeService es = new EmployeeService();
			System.out.println("get check login test method");
		boolean res1 = es.checkLogin("akash@gmail.com", "123");
		boolean res2 = es.checkLogin("lax@gmail.com", "123");
		assertTrue(res1);
		assertFalse(res2);
	}

}
