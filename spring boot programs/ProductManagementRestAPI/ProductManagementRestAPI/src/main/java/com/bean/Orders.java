package com.bean;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Orders {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int oid;
private int pid;
private LocalDateTime ldt;
private int qty;
private int total;
public int getOid() {
	return oid;
}
public void setOid(int oid) {
	this.oid = oid;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public LocalDateTime getLdt() {
	return ldt;
}
public void setLdt(LocalDateTime ldt) {
	this.ldt = ldt;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public int getTotal() {
	return total;
}
public void setTotal(int total) {
	this.total = total;
}

}
