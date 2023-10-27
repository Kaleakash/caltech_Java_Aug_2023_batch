package com;

public class RuntimeException {

	public static void main(String[] args) {
		System.out.println("Hi");
		int a=10;
		int b=1;
			int abc[]= {10,20,30};
		try {
		int res = a/b;
		System.out.println("Result is "+res);
			int res1 = 100/abc[5];
			System.out.println("Result is "+res1);
		}catch(Exception e) {
			//System.out.println("I Take Care!");
			//System.out.println(e.getMessage()); // display short messsage of exception 
			System.out.println(e.toString());  // it display name as well as message 
			//e.printStackTrace();		// it display name, message as well as line 
		}
		System.out.println("Bye..");
		System.out.println("Bye..");
		System.out.println("Bye..");	
	}

}
