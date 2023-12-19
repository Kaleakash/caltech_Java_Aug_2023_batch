package com.zumba.bean;

public class Participant {
private int participantid;
private String pname;
private int age;
private String phonenumber;
private int batchid;

public Participant() {
	super();
	// TODO Auto-generated constructor stub
}

public Participant(int participantid, String pname, int age, String phonenumber, int batchid) {
	super();
	this.participantid = participantid;
	this.pname = pname;
	this.age = age;
	this.phonenumber = phonenumber;
	this.batchid = batchid;
}

public int getParticipantid() {
	return participantid;
}
public void setParticipantid(int participantid) {
	this.participantid = participantid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(String phonenumber) {
	this.phonenumber = phonenumber;
}
public int getBatchid() {
	return batchid;
}
public void setBatchid(int batchid) {
	this.batchid = batchid;
}

}
