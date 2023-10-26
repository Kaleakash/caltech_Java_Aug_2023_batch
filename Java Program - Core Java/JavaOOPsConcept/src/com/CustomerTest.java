package com;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1 = new Customer();
		c1.setCid(100);
		c1.setCname("Ravi");
		c1.setAge(21);
		
		System.out.println("id is "+c1.getCid());
		System.out.println("name is "+c1.getCname());
		System.out.println("age is "+c1.getAge());
		
		Customer c2 = new Customer();
		
		
		System.out.println("id is "+c2.getCid());
		System.out.println("name is "+c2.getCname());
		System.out.println("age is "+c2.getAge());
		
		Customer c3 = new Customer(101,"Lex",22);
		
		
		System.out.println("id is "+c3.getCid());
		System.out.println("name is "+c3.getCname());
		System.out.println("age is "+c3.getAge());
		
	}

}
