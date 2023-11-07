package com;
import java.sql.*;
public class DemoTest {

	
	// create table employee(id int primary key,name varchar(20), salary float);
	// select * from employee;
	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Drivr Loaded successfully");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/info","root","root@123");
		System.out.println("Database connected...");	
		Statement stmt = con.createStatement();
		
		// insert Query code 
//		int res = stmt.executeUpdate("insert into employee values(3,'Mohan',39000)");
//		if(res>0) {
//		System.out.println("Record inserted successfully");
//		}
	
//		// Delete Query code 
//		int res = stmt.executeUpdate("delete from employee where id=3");
//		if(res>0) {
//			System.out.println("Record deleted successfully");
//		}else {
//			System.out.println("No record present");
//		}
		
		// update Query code 
//				int res = stmt.executeUpdate("update employee set salary = 55000 where id =2");
//				if(res>0) {
//					System.out.println("Record updated successfully");
//				}else {
//					System.out.println("No record present");
//				}
		// Retrieve records 
		ResultSet rs = stmt.executeQuery("select * from employee");
		while(rs.next()) {
	//System.out.println("id is "+rs.getInt(1)+" Name is  "+rs.getString(2)+" Salary is "+rs.getFloat(3));
System.out.println("id is "+rs.getInt("id")+" Name is  "+rs.getString("name")+" Salary is "+rs.getFloat("salary"));
		}
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
