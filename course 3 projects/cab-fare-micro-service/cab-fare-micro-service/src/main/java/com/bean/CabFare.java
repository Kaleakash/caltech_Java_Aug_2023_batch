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
private String fromlocation;
private String tolocation;
private String typeofcab;
private float amount;
private int numberofseats;
public int getCfid() {
	return cfid;
}
public void setCfid(int cfid) {
	this.cfid = cfid;
}
public String getFromlocation() {
	return fromlocation;
}
public void setFromlocation(String fromlocation) {
	this.fromlocation = fromlocation;
}
public String getTolocation() {
	return tolocation;
}
public void setTolocation(String tolocation) {
	this.tolocation = tolocation;
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
@Override
public String toString() {
	return "CabFare [cfid=" + cfid + ", fromlocation=" + fromlocation + ", tolocation=" + tolocation + ", typeofcab="
			+ typeofcab + ", amount=" + amount + ", numberofseats=" + numberofseats + "]";
}
public CabFare() {
	super();
	// TODO Auto-generated constructor stub
}
public CabFare(int cfid, String fromlocation, String tolocation, String typeofcab, float amount, int numberofseats) {
	super();
	this.cfid = cfid;
	this.fromlocation = fromlocation;
	this.tolocation = tolocation;
	this.typeofcab = typeofcab;
	this.amount = amount;
	this.numberofseats = numberofseats;
}

}
