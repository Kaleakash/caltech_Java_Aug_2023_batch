package com.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.bean.Employee;

@Repository					// @Repository is dao layer specific annotation  
public class EmployeeDao {

	@Autowired
	DataSource ds;				// byType consider. it check in beans.xml file 
	
	public int storeEmployee(Employee emp) {
		try {
		Connection con  = ds.getConnection();	
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
	
	public int deleteEmployee(int id) {
		try {
		Connection con  = ds.getConnection();	
		PreparedStatement pstmt = con.prepareStatement("delete from employee where id = ?");
		pstmt.setInt(1, id);
		return pstmt.executeUpdate();
		} catch (Exception e) {
		System.err.println(e);
		return 0;
		}
	}
	
	public int updateEmployee(Employee emp) {
		try {
		Connection con  = ds.getConnection();	
		PreparedStatement pstmt = con.prepareStatement("update employee set salary = ? where id =?");
		pstmt.setInt(2, emp.getId());
		pstmt.setFloat(1, emp.getSalary());
		return pstmt.executeUpdate();
		} catch (Exception e) {
		System.err.println(e);
		return 0;
		}
	}
	
	public List<Employee> findEmployee() {
		List<Employee> listOfEmp = new ArrayList<>();
		try {
		Connection con  = ds.getConnection();	
		PreparedStatement pstmt = con.prepareStatement("select * from employee");
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			Employee emp = new Employee(rs.getInt(1),rs.getString(2),rs.getFloat(3));
			listOfEmp.add(emp);
		}
		} catch (Exception e) {
		System.err.println(e);
		}
		return listOfEmp;
	}
}
