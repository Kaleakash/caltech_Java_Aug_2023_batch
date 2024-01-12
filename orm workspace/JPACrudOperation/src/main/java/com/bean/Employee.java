package com.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity							// Map to Employee table 
public class Employee {
@Id
private int id;
private String name;
private float salary;

@OneToMany(cascade = CascadeType.ALL)				// using Employee table object we can do all operation on skillset object. 
@JoinColumn(name = "esid")			// it is FK in skillset table. 
private List<Skillset> listOfSkillset;		// one employee known more than one skill 

public List<Skillset> getListOfSkillset() {
	return listOfSkillset;
}
public void setListOfSkillset(List<Skillset> listOfSkillset) {
	this.listOfSkillset = listOfSkillset;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", listOfSkillset=" + listOfSkillset + "]";
}

}
