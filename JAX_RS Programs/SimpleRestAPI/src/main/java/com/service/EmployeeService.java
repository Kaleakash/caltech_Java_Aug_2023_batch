package com.service;

import java.util.Iterator;
import java.util.List;

import com.bean.Employee;
import com.dao.EmployeeDao;

public class EmployeeService {
	
	EmployeeDao ed = new EmployeeDao();
	
	public String storeEmployee(Employee emp) {
		
		if(emp.getSalary()<=20000) {
			return "Salary must be > 20000";
		}else if(ed.storeEmployee(emp)>0) {
			return "Employee record stored successfully";
		}else {
			return "Employee record didn't store";
		}
	}
	
	public List<Employee> findAllEmployee() {
		List<Employee> listOfEmp = ed.findAllEmployee();
		Iterator<Employee> li = listOfEmp.iterator();
		while(li.hasNext()) {
			Employee emp = li.next();
			emp.setSalary(emp.getSalary()+5000);
		}
		return listOfEmp;
	}
	
	public String updateEmployeeSalary(Employee emp) {
			if(ed.updateEmployeeSalary(emp)>0) {
				return "Updated salary successfully";
			}else {
				return "Salary didn't update";
			}
	}
	
	public String deleteEmployeeInfo(int id) {
		if(ed.deleteEmployee(id)>0) {
			return "Employee record deleted successfully";
		}else {
			return "Record didnt' delete";
		}
}
	
}

