package com.service;

import java.util.ArrayList;
import java.util.List;

import com.bean.Employee;

public class EmployeeService {

	public Employee getEmployee() {
		// we can all dao method and interact with database. 
		Employee emp1 = new Employee(100, "Steven", 12000);
		return emp1;
	}
	
	public List<Employee> findAllEmployees() {
		// we can all dao method and interact with database. 
		Employee emp1 = new Employee(100, "Steven", 12000);
		Employee emp2 = new Employee(101, "Lex", 15000);
		Employee emp3 = new Employee(102, "John", 18000);
		List<Employee> listOfEmp = new ArrayList<>();
		listOfEmp.add(emp1);
		listOfEmp.add(emp2);
		listOfEmp.add(emp3);
		return listOfEmp;
	}
	public float updateSalary(Employee emp) {
		// logic or condition ;
		return emp.getSalary()+5000;
	}
	
	
	public boolean checkLogin(String emailid,String password) {
		// we can check logic details from db 
		if(emailid.equals("akash@gmail.com") && password.equals("123")) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
