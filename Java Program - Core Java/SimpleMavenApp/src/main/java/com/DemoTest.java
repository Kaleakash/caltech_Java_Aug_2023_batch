package com;
import java.sql.*;
public class DemoTest {

	public static void main(String[] args) {
		try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("Driver loaded...");
Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/info","root","root@123");
System.out.println("Database connected successfully");
PreparedStatement pstmt = con.prepareStatement("select * from employee");
ResultSet rs = pstmt.executeQuery();
while(rs.next()) {
	System.out.println("Id is "+rs.getInt(1)+" Name is "+rs.getString(2)+" Salary is "+rs.getFloat(3));
}
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
