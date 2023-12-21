package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Address;
import com.bean.Employee;
import com.config.MyConfiguration;

public class DemoTest {

	public static void main(String[] args) {
	
//		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
//		Employee emp1  = (Employee)ac.getBean("employee");
//		System.out.println(emp1);  // it will call toString method 
//		Address add = (Address)ac.getBean("address");
//		System.out.println(add);
		
		AnnotationConfigApplicationContext  ac = new AnnotationConfigApplicationContext(MyConfiguration.class);  // loading config class 
		Employee emp1  = (Employee)ac.getBean("employee");
		System.out.println(emp1);  // it will call toString method 
		Address add = (Address)ac.getBean("address");
		System.out.println(add);
	}

}
