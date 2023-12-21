package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Employee;

public class DemoTest {

	public static void main(String[] args) {
	
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		Employee emp1  = (Employee)ac.getBean("employee");
		System.out.println(emp1);  // it will call toString method 
	}

}
