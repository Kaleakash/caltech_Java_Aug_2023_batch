package com;

public class TryWithMultipleCatchBlock {

	public static void main(String[] args) {
		System.out.println("Hi");
		int a=10;
		int b=1;
		int res1,res2;
		int abc[]= {10,20,30};
		String n = "a10";
		try {
			res1 = a/b;		
			res2 = abc[1];	
			System.out.println("res1 "+res1);
			System.out.println("res2 "+res2);
			System.out.println(n+10);
			System.out.println(Integer.parseInt(n)+10); // Integer is pre defined class conains parseint method 
			System.out.println("No exception");					// which help to convert string toint
		}catch(ArithmeticException e){
			System.out.println("Arithmetic exception generated "+e);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("array index generated "+e);
		}catch(Exception e) {
			System.out.println("Generic exception generate "+e);
		}
		
		System.out.println("Normal Statement");

	}

}
