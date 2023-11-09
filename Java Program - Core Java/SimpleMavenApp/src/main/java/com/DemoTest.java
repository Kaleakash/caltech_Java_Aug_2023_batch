package com;
import java.sql.*;
public class DemoTest {

	public static void main(String[] args) {
		try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("Driver loaded...");
Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/info","root","root@123");
System.out.println("Database connected successfully");

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
