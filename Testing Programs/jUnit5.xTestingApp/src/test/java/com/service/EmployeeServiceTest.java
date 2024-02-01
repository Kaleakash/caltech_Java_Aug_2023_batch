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
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@Disabled
	void testGetEmployee() {
		//fail("Not yet implemented");
		EmployeeService es = new EmployeeService();
		Employee emp= es.getEmployee();
		assertNotNull(emp);// give object not null 
		assertEquals(100, emp.getId());
		assertEquals("Steven", emp.getName());
		assertEquals(12000, emp.getSalary());
	}

	@Test
	void testFindAllEmployees() {
		//fail("Not yet implemented");
		EmployeeService es = new EmployeeService();
		List<Employee> listOfEmp = es.findAllEmployees();
		assertEquals(3, listOfEmp.size());
		Employee emp = listOfEmp.get(1);
		assertEquals(101, emp.getId());
		assertEquals("Lex", emp.getName());
		assertEquals(15000, emp.getSalary());
	}

	@Test
	@Disabled
	void testUpdateSalary() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testCheckLogin() {
		fail("Not yet implemented");
	}

}
