package com.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.Session;

import com.bean.Employee;

public class DemoTest {

	public static void main(String[] args) {
	// using persistence unit name part of persistence.xml file we get database details and mapping file details 	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPACrudOperation");	// SessionFactory 
	EntityManager manager = emf.createEntityManager();	// like Session
	EntityTransaction tran = manager.getTransaction();		// like Transaction 
	
	// insert Query 
//	Employee emp = new Employee();
//	emp.setId(104);
//	emp.setName("Ajay");
//	emp.setSalary(38000);
//	
//	tran.begin();
//		manager.persist(emp);    // like save 
//	tran.commit();
//	System.out.println("Record inserted successfully");
	
//	// Delete Query 
//	Employee emp = manager.find(Employee.class, 101);
//	if(emp==null) {
//		System.out.println("Record not present");
//	}else {
//		tran.begin();
//				manager.remove(emp);     // like delete 
//		tran.commit();
//		System.out.println("Record deleted successfully");
//	}
	
	// Update Query 
		Employee emp = manager.find(Employee.class, 102);
		if(emp==null) {
			System.out.println("Record not present");
		}else {
			tran.begin();
				emp.setSalary(45000);
				manager.merge(emp);			// like update 
			tran.commit();
			System.out.println("Record updated successfully");
		}
		
	}

}
