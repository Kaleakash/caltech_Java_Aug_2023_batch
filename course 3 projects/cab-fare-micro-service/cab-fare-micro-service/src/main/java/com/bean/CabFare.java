package com.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cabfare")
public class CabFare {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int cfid;
private String from;
private String to;
private String typeofcab;
private float amount;
private int numberofseats;
public int getCfid() {
	return cfid;
}
public void setCfid(int cfid) {
	this.cfid = cfid;
}
public String getFrom() {
	return from;
}
public void setFrom(String from) {
	this.from = from;
}
public String getTo() {
	return to;
}
public void setTo(String to) {
	this.to = to;
}
public String getTypeofcab() {
	return typeofcab;
}
public void setTypeofcab(String typeofcab) {
	this.typeofcab = typeofcab;
}
public float getAmount() {
	return amount;
}
public void setAmount(float amount) {
	this.amount = amount;
}
public int getNumberofseats() {
	return numberofseats;
}
public void setNumberofseats(int numberofseats) {
	this.numberofseats = numberofseats;
}

}
