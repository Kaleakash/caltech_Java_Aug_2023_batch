package com;
// using java bean class we expose rest api with java technologies. 
// java bean class map to table in mysql database. 
public class Customer {
private int cid;
private String cname;
private int age;
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Customer() {
	this.cid=123;
	this.cname="Unknown";
	this.age=18;
}
public Customer(int cid, String cname, int age) {
	super();
	this.cid = cid;
	this.cname = cname;
	this.age = age;
}


}
