package com;

import java.util.function.Function;

class MyFunction implements Function<Integer, String>{
	@Override
	public String apply(Integer t) {
		
		return "Your number is "+t;
	}
}

public class PredefinedFuntionalInterface {
	public static void main(String[] args) {
	Function<Integer, String> f1 = new MyFunction();	
	System.out.println(f1.apply(100));
	
	Function<Integer, String> f2 = (t)->"Your number is using lambda "+t;
	System.out.println(f2.apply(200));
	Function<String, String> f3 = (name)->"Your name is "+name;
	System.out.println(f3.apply("Ravi"));
	}

}
