package com.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.Login;

@Repository
public class LoginDao {

	@Autowired
	JdbcTemplate jdbcTemplate; // in spring boot it check details in application.properties 
	
	public int signIn(Login login) {
		try {
List<Map<String, Object>> listOfData = jdbcTemplate.queryForList("select * from login where emailid=? and password = ?", login.getEmailid(),login.getPassword());	
		return listOfData.size();
		} catch (Exception e) {
			System.err.println(e);
			return 0;
		}
	}
	public int signUp(Login login) {
		try {
return jdbcTemplate.update("insert into login values(?,?)", login.getEmailid(),login.getPassword());		
		} catch (Exception e) {
			System.err.println(e);
			return 0;
		}
	}
}
