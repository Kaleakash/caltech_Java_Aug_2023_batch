package com.eshopping.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.eshopping.bean.Login;
import com.eshopping.resource.DbResource;

public class LoginDao {

	
	public boolean signIn(Login login) {
		try {
		Connection con = DbResource.getDbConnection();
PreparedStatement pstmt = con.prepareStatement("select * from login where email=? and password =? and typeofuser=?");
		pstmt.setString(1, login.getEmail());
		pstmt.setString(2, login.getPassword());
		pstmt.setString(3, login.getTypeofuser());
		ResultSet rs = pstmt.executeQuery();
		
		if(rs.next()) {
			return true;
		}
		} catch (Exception e) {
			System.err.println(e);
		}
		return false;
	}
	
	public int signUp(Login login) {
		try {
		Connection con = DbResource.getDbConnection();
PreparedStatement pstmt = con.prepareStatement("insert into login values(?,?,?)");
		pstmt.setString(1, login.getEmail());
		pstmt.setString(2, login.getPassword());
		pstmt.setString(3, login.getTypeofuser());
		return pstmt.executeUpdate();
		} catch (Exception e) {
			System.err.println(e);
			return 0;
		}
	}
}
