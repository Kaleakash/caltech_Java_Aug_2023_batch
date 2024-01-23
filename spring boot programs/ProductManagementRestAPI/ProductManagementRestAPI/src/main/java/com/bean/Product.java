package com.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity							// @entity part of jakarta previously part of javax in spring boot 3.x version 
public class Product {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int pid;
private String pname;
private float price;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public Product(int pid, String pname, float price) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.price = price;
}
@Override
public String toString() {
	return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
}

}
