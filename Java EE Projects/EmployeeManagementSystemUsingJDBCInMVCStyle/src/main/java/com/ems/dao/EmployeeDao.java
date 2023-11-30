package com.ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ems.bean.Employee;
import com.ems.resource.DbResource;

public class EmployeeDao {

	public int storeEmployee(Employee emp) {
		try {
		Connection con  = DbResource.getDbConnection();
		PreparedStatement pstmt = con.prepareStatement("insert into employee values(?,?,?)");
		pstmt.setInt(1, emp.getId());
		pstmt.setString(2, emp.getName());
		pstmt.setFloat(3, emp.getSalary());
		return pstmt.executeUpdate();
		} catch (Exception e) {
			System.err.println(e);
			return 0;
		}
	}
	
	public List<Employee> findAllEmployee() {
		List<Employee> listEmployee  = new ArrayList<>();
		try {
		Connection con  = DbResource.getDbConnection();
		PreparedStatement pstmt = con.prepareStatement("select * from employee");
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			Employee emp = new Employee();
			emp.setId(rs.getInt("id"));
			emp.setName(rs.getString("name"));
			emp.setSalary(rs.getFloat("salary"));  // convert each record to object ie employee
			listEmployee.add(emp);
		}
		} catch (Exception e) {
			System.err.println(e);
		}
		return listEmployee;
	}
	
}
