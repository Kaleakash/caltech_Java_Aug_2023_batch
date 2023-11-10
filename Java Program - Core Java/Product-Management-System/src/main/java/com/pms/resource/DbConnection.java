package com.pms.resource;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	static Connection con;
	
	// constructor it will called only once when we create the object 
	// static block call only one once the class get loaded...
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/info","root","root@123");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static Connection getDbConnection() {
		try {
			return con;
		}catch(Exception e) {
			System.out.println("Resource layer "+e.toString());
			return null;
		}
		
	}
}
