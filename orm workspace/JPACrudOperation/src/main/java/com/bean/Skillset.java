package com.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity						//
public class Skillset {		// map to skillset table 
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)	// auto_increment 
private int ssid;			//PK
private String sname;	
private Integer esid;			//FK it can hold null value
public int getSsid() {
	return ssid;
}
public void setSsid(int ssid) {
	this.ssid = ssid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public Integer getEsid() {
	return esid;
}
public void setEsid(Integer esid) {
	this.esid = esid;
}

}
