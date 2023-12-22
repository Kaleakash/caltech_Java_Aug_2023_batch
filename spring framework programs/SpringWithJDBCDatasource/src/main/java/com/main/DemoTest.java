package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Employee;
import com.service.EmployeeService;

public class DemoTest {

	public static void main(String[] args) {
	// load xml file 
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml"); // load the xml file 
		
		EmployeeService es = (EmployeeService)ac.getBean("employeeService");
		
		Employee emp1 = (Employee)ac.getBean("employee");
		emp1.setId(101);
		emp1.setName("LOkesh");
		emp1.setSalary(38000);
		
//		Employee emp2 = (Employee)ac.getBean("employee");
//		
//		emp2.setId(102);
//		emp2.setName("Steven");
//		emp2.setSalary(42000);
		
		String result 	= es.storeEmployee(emp1);
		System.out.println(result);
		
		// other operation you need to call like delete, update and retrieve 
	}

}
