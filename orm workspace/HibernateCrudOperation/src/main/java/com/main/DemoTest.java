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
	
	Employee emp = new Employee();
	emp.setId(102);
	emp.setName("Steven");
	emp.setSalary(34000);
	Transaction tran = session.getTransaction();
	
			tran.begin();
			
			session.save(emp);
			
			tran.commit();
			System.out.println("Employee record stored...");
			
	}

}
