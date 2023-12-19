package com.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.bean.Employee;

public class DemoTest {

	public static void main(String[] args) {
		
//		Employee emp  = new Employee();
//		emp.display();
		
		Resource res = new ClassPathResource("beans.xml");	// load the xml file
		BeanFactory obj = new XmlBeanFactory(res);   // get the reference of beanfactory 
		Employee e1 = (Employee)obj.getBean("emp1");	// pull the object from a container 
		e1.display();
		
	}

}
