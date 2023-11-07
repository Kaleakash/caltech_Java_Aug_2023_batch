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
	int res = stmt.executeUpdate("insert into employee values(2,'Lex',34000)");
	
	if(res>0) {
		System.out.println("Record inserted successfully");
	}
	
	
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
