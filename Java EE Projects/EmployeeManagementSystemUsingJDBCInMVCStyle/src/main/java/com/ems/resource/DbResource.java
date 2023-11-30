package com.ems.resource;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbResource {
	static Connection con;
	//this block call only once to connect the database. 
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db_info", "root", "root@123");
		} catch (Exception e) {
			System.err.println("Db Connection error "+e.toString());
		}
	}
	
	public static Connection getDbConnection() {
		try {
			return con;
		} catch (Exception e) {
			System.err.println("Db Connection getting error "+e.toString());	
		}
		return null;
	}
}
