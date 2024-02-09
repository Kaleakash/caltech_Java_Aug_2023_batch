package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Product {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int pid;
private String pname;
private float price;
private String url;
private int qty;
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
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}

}
