package com.main;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Employee;
import com.service.EmployeeService;

public class DemoTest {

	public static void main(String[] args) {
	ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
	EmployeeService es = (EmployeeService)ac.getBean("employeeService");
	Employee emp = (Employee)ac.getBean("employee");
	Scanner sc = new Scanner(System.in);
	String con = "";
	int id;
	String name;
	float salary;
	String result;
	do {
		System.out.println("1:Add, 2:Delete 3:Update 4:Retrive as Map");
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:System.out.println("Enter the id");
				id = sc.nextInt();
				System.out.println("Enter the name");
				name = sc.next();
				System.out.println("Enter the salary");
				salary = sc.nextFloat();
				emp.setId(id);
				emp.setName(name);
				emp.setSalary(salary);
				result = es.storeEmployee(emp);
				System.out.println(result);
				break;
		case 2: System.out.println("Enter the id");
				id = sc.nextInt();	
				result = es.deleteEmployee(id);
				System.out.println(result);
				break;
		case 3:System.out.println("Enter the id");
				id = sc.nextInt();
		
				System.out.println("Enter the salary");
				salary = sc.nextFloat();
				emp.setId(id);
				emp.setSalary(salary);
				result = es.updateEmployee(emp);
				System.out.println(result);
				break;
		case 4 :System.out.println("All Employee details ");
		        List<Map<String, Object>> ll = es.findAllEmployee();
		        Iterator<Map<String, Object>> li = ll.iterator();
		        while(li.hasNext()) {
		        	Map<String, Object> mm = li.next();
		        	System.out.println(mm);
		        }
		        break;
		default:System.out.println("wrong choice");
			break;
		}
		System.out.println("do you want to continue?(y/n)");
		con = sc.next();
	} while (con.equalsIgnoreCase("y"));
	System.out.println("Thank you!");
	}

}
