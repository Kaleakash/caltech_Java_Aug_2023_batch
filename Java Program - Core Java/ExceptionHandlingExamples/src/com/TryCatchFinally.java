package com;

public class TryCatchFinally {

	public static void main(String[] args) {
	System.out.println("Hi");
	try {
		int res = 100/1;
		System.out.println("res "+res);
		System.out.println("no exception");
	} catch (Exception e) {
		System.out.println("catch block");
	}
	finally {
		System.out.println("finally block");
	}
		System.out.println("normal statement");
	}
}
