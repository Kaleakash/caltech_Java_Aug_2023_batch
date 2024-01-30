package com.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Gpay {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int gpayid;
private String emailid;
public int getGpayid() {
	return gpayid;
}
public void setGpayid(int gpayid) {
	this.gpayid = gpayid;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}

}
