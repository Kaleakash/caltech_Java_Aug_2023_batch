package com.eshopping.bean;

public class Login {
private String email;
private String password;
private String typeofuser;
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getTypeofuser() {
	return typeofuser;
}
public void setTypeofuser(String typeofuser) {
	this.typeofuser = typeofuser;
}
public Login() {
	super();
	// TODO Auto-generated constructor stub
}
public Login(String email, String password, String typeofuser) {
	super();
	this.email = email;
	this.password = password;
	this.typeofuser = typeofuser;
}

}
