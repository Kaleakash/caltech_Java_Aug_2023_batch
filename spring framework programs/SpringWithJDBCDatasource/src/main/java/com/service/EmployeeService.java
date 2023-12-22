package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Employee;
import com.dao.EmployeeDao;

@Service					//@Service is service layer specific annotation 
public class EmployeeService {

	@Autowired
	EmployeeDao employeeDao;		// like id 
	
	
	public String storeEmployee(Employee employee) {
		if(employeeDao.storeEmployee(employee)>0) {
			return "Employee record stored successfully";
		}else {
			return "Employee record didn't store";
		}
	}
	public String deleteEmployee(int id) {
		if(employeeDao.deleteEmployee(id)>0) {
			return "record deleted successfully";
		}else {
			return "record not present";
		}
	}
	
	public String updateEmployee(Employee employee) {
		if(employeeDao.updateEmployee(employee)>0) {
			return "Employee record updated successfully";
		}else {
			return "Record not present";
		}
	}
	
	public List<Employee> findAllEmployee() {
		return employeeDao.findEmployee();
	}
}
