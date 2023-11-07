package com;
import java.sql.*;
public class DemoTest {

	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Drivr Loaded successfully");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/info","root","root@123");
	System.out.println("Database connected...");
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
