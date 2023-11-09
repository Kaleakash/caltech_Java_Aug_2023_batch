package com.pms.dao;
import java.sql.*;
import com.pms.bean.*;
public class LoginDao {

	
	public String signIn(Login login) {
		try {
	Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/info","root","root@123");
PreparedStatement pstmt = con.prepareStatement("select * from login where emailid = ? and password = ?");
pstmt.setString(1,login.getEmailId());
pstmt.setString(2,login.getPassword());
ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
				if(login.getTypeOfUser().equals("admin")) {
					return "Admin Login successfully";
				}else {
					return "Customer login successfully";
				}
		}else {
			return "Failure try once again";
		}
		
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
	
	
	public String signUp(Login login) {
		try {
	Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/info","root","root@123");
PreparedStatement pstmt = con.prepareStatement("insert into login values(?,?,?)");
pstmt.setString(1,login.getEmailId());
pstmt.setString(2,login.getPassword());
pstmt.setString(3,login.getTypeOfUser());
int rs = pstmt.executeUpdate();	// return type int 
		if(rs>0) {
			return "Account created successfully";
		}
		} catch (Exception e) {
			System.out.println(e);
			return "Acount didn't create";
		}
		return null;
	}
}
