package com.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.bean.Employee;

public class DemoTest {

	public static void main(String[] args) {
	// using persistence unit name part of persistence.xml file we get database details and mapping file details 	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPACrudOperation");	
	EntityManager manager = emf.createEntityManager();	// like SessionFactory 
	EntityTransaction tran = manager.getTransaction();		// like Transaction 
	
	Employee emp = new Employee();
	emp.setId(104);
	emp.setName("Ajay");
	emp.setSalary(38000);
	
	tran.begin();
		manager.persist(emp);    // like save 
	tran.commit();
	System.out.println("Record inserted successfully");
	}

}
