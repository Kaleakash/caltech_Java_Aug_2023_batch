package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeTest {

	public static void main(String[] args) {
//	List listOfEmp = new ArrayList();
//	//1st way 
//	Employee emp1 = new Employee();
//	
//	emp1.setId(100);
//	emp1.setName("Ravi");
//	emp1.setSalary(14000);
//
//	listOfEmp.add(emp1);
//	listOfEmp.add(10);
//	listOfEmp.add(true);
//	
//	Object obj	= listOfEmp.get(1);
//		System.out.println(obj);	
//	Employee emp2 = (Employee)obj;	// type casting down level 
//	System.out.println("id "+emp2.getId());
//	System.out.println("name "+emp2.getName());
//	System.out.println("salary is "+emp2.getSalary());
		
	List<Employee> listOfEmp = new ArrayList<Employee>();
	
	System.out.println("Number of object "+listOfEmp.size());
	Employee emp1 = new Employee();
	emp1.setId(100);
	emp1.setName("Ravi");
	emp1.setSalary(14000);
	listOfEmp.add(emp1);
	
	Employee emp2 = new Employee(101, "Mahesh", 18000);
	listOfEmp.add(emp2);
	
	listOfEmp.add(new Employee(102, "Lokesh", 22000));
	
	System.out.println("Number of object "+listOfEmp.size());
	
	Employee ee  = listOfEmp.get(2);
	System.out.println("id "+ee.getId());
	System.out.println("name "+ee.getName());
	System.out.println("salary is "+ee.getSalary());
	listOfEmp.remove(1);			// remove using index position 
	System.out.println("After remove ");
	System.out.println("Number of object "+listOfEmp.size());
	// if we want to remove base upon id 
	Iterator<Employee> ii = listOfEmp.iterator();
	while(ii.hasNext()) {
		Employee e = ii.next();
		if(e.getId()==1000) {
			ii.remove();
		}
	}
	System.out.println("After removed using iterator by id");
	System.out.println("Number of object "+listOfEmp.size());
	System.out.println("All employee records in string format "+listOfEmp);
	System.out.println("Retrieve element one by one using iterator");
	Iterator<Employee> ii1 = listOfEmp.iterator();
	while(ii1.hasNext()) {
		Employee e = ii1.next();
		System.out.println("id is "+e.getId());
		System.out.println("name is "+e.getName());
		System.out.println("salary is "+e.getSalary());
	}
	}

}
