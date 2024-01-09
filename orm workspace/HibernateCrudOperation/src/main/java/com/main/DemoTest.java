package com.main;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.persistence.TypedQuery;

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
//		session.delete(emp);		// delete from employee where id = 100
//		tran.commit();
//		System.out.println("Record deleted");
//	}
	
	// Update Query 
//		Employee emp = session.find(Employee.class, 101);
//		if(emp==null) {
//			System.out.println("Record not present");
//		}else {
//			tran.begin();
//			
//			emp.setSalary(35000);
//			
//			session.update(emp);	// update employee set salary = 35000 where id=101
//			
//			tran.commit();
//			System.out.println("Record updated");
//		}
	// Retrieve single record using primary key 
	
//	Employee emp = session.find(Employee.class, 101);
//	if(emp==null) {
//		System.out.println("Record not present");
//	}else {
//		System.out.println(emp);  // it will call toString method to display the record 
//	}
	Scanner sc = new Scanner(System.in);
	
	// Retrieve more than one record 
	// DAO layer code 
	//TypedQuery<Employee> qry = session.createQuery("select emp from Employee emp");
	// Static value 
	//TypedQuery<Employee> qry = session.createQuery("select emp from Employee emp where emp.id=101");
	//dynamic value usign label parameter 
	System.out.println("Enter the id");
	int id = sc.nextInt();
	TypedQuery<Employee> qry = session.createQuery("select emp from Employee emp where emp.id=:empid");
	qry.setParameter("empid", id);
	List<Employee> listOfEmp = qry.getResultList();  // directly converted to list of object 
	
	// View layer code 
	System.out.println("Number of records "+listOfEmp.size());
	Iterator<Employee> li = listOfEmp.iterator();
	while(li.hasNext()) {
		Employee e = li.next();
		System.out.println(e);
	}
	}
}
