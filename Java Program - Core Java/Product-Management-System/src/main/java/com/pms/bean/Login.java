package com.pms.bean;

public class Login {			// map to table 
private String emailId;
private String password;
private String typeOfUser;		// map to all columns 
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getTypeOfUser() {
	return typeOfUser;
}
public void setTypeOfUser(String typeOfUser) {
	this.typeOfUser = typeOfUser;
}
public Login() {
	super();
	// TODO Auto-generated constructor stub
}
public Login(String emailId, String password, String typeOfUser) {
	super();
	this.emailId = emailId;
	this.password = password;
	this.typeOfUser = typeOfUser;
}



}
