package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Employee;

public class DemoTest {

	public static void main(String[] args) {
	Configuration con = new Configuration();
	con.configure("hibernate.cfg.xml");
	System.out.println("file loaded...");
	SessionFactory sf = con.buildSessionFactory();// like Connection 
	Session session = sf.openSession();		// LIke Statement or PreparedStatmenet 
	Transaction tran = session.getTransaction();
	
	// Insert Query 
//	Employee emp = new Employee();
//	emp.setId(102);
//	emp.setName("Steven");
//	emp.setSalary(34000);
//	
//	
//	
//			tran.begin();
//			
//			session.save(emp);
//			
//			tran.commit();
//			System.out.println("Employee record stored...");
	
//	// Delete Query 
//	Employee emp = session.find(Employee.class, 100);
//	if(emp==null) {
//		System.out.println("Record not present");
//	}else {
//		tran.begin();
//		session.delete(emp);
//		tran.commit();
//		System.out.println("Record deleted");
//	}
	
	// Update Query 
		Employee emp = session.find(Employee.class, 101);
		if(emp==null) {
			System.out.println("Record not present");
		}else {
			tran.begin();
			
			emp.setSalary(35000);
			
			session.update(emp);
			
			tran.commit();
			System.out.println("Record updated");
		}
		
	}

}
