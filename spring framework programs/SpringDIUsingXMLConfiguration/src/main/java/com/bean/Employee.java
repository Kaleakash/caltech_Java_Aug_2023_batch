package com.bean;

public class Employee {
private int id;
private String name;
private float salary;

	public Employee() {
		System.out.println("object created...empty constructor");
	}
	
	public Employee(int id, String name, float salary) {
		super();
		System.out.println("object created - parameter constructor");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void display() {
		System.out.println("this is employee method");
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		System.out.println("salary  is "+salary);
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
	
}
