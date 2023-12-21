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
		//Employee e1 = (Employee)obj.getBean("emp1");	// pull the object from a container 
		//e1.display();
		
		//Employee e2 = (Employee)obj.getBean("emp2");	// pull the object from a container 
		//e2.display();
		
		//Employee e3 = (Employee)obj.getBean("emp1");	// pull the object from a container 
		//e3.display();
		
		//Employee e4 = (Employee)obj.getBean("emp2");	// pull the object from a container 
		//e4.display();
		
		Employee emp5 = (Employee)obj.getBean("emp1");
		emp5.display();
		
		Employee emp6 = (Employee)obj.getBean("emp2");
		emp6.display();
		
		Employee emp7 = (Employee)obj.getBean("emp3");
		emp7.display();
		
		Employee emp8 = (Employee)obj.getBean("emp4");
		emp8.display();
		
		
	}

}
