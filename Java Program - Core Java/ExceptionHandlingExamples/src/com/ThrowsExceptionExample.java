package com;

public class ThrowsExceptionExample {

	static void dis1() throws Exception{
		try {
		//int a=10/0;
			int num[]= {10,20,30};
			int res = 10/num[4];
		}catch(ArithmeticException e) {}
		System.out.println("dis1 method");
	}
	static void dis2() throws Exception{
		try {
		dis1();
		}catch(ArrayIndexOutOfBoundsException e) {}
		System.out.println("dis2 method");
	}
	public static void main(String[] args) throws Exception{
		try {
		dis2();
		}catch(Exception e) {}
		System.out.println("Main method");
		
	}

}
