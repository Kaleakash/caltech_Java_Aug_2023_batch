package com.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class BookCab {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int bookcabid;
private String cname;
private LocalDateTime bookingtime;		// current data and time.
private float amount;					// 
private String source;
private String destination;
private String typeofcab;
private int numberofseats;			//cname,source,destination, typeofcab,numberofseats

public String getTypeofcab() {
	return typeofcab;
}
public void setTypeofcab(String typeofcab) {
	this.typeofcab = typeofcab;
}
public int getNumberofseats() {
	return numberofseats;
}
public void setNumberofseats(int numberofseats) {
	this.numberofseats = numberofseats;
}
public String getSource() {
	return source;
}
public void setSource(String source) {
	this.source = source;
}
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}
public int getBookcabid() {
	return bookcabid;
}
public void setBookcabid(int bookcabid) {
	this.bookcabid = bookcabid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public LocalDateTime getBookingtime() {
	return bookingtime;
}
public void setBookingtime(LocalDateTime bookingtime) {
	this.bookingtime = bookingtime;
}
public float getAmount() {
	return amount;
}
public void setAmount(float amount) {
	this.amount = amount;
}

}
