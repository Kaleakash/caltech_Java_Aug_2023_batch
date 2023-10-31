package com;

class MyException extends Exception {
	public MyException() {
		//super();
	}
	public MyException(String msg) {
		super(msg);			// calling super class parameter constructor to set the message. 
	}
}
public class ThrowsKeywordExample {
	public static void main(String[] args) {
	int age = 18;	
	try {
	if(age<=21) {
		//throw new Exception();		generic exception 
		//throw new Exception("age must be >= 21");
		//throw new ArithmeticException();  // specific exception 
		//throw new ArithmeticException("age must be >=21");
		//throw new MyException();
		throw new MyException("age must be >=21");
	}else {
		System.out.println("You can vote!");
	}
	}catch(Exception e) {
		System.out.println(e.toString());
	}
	System.out.println("Finish");
	}

}
