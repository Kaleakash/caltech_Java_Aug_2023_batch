package com;

import java.util.ArrayList;
import java.util.List;

public class CollectionFrameworkWithGenerics {

	public static void main(String[] args) {
	// Collection Framework without generics 
//	List ll = new ArrayList();
//	int a=10;
//	ll.add(a);
//	ll.add("Ravi");
//	ll.add(10.30);
//	
//	Object obj = ll.get(2);
//	Integer i = (Integer)obj; 		 // explicit type casting 
//	int n = i.intValue();				// i is integer object which method convert integer object to int value. 
//	System.out.println("Value of n is "+n);
		
	// Collection Framework with generics 
	
	List<Integer> ll = new ArrayList<Integer>();
	ll.add(10);			// auto boxing 
	ll.add(20);
	ll.add(30);
	ll.add(40);
	//ll.add(10.10);
	//ll.add("Ravi");
	
	
	int n = ll.get(0);			// auto - unboxing : converting Object to primitive 
	System.out.println("Value is "+n);
	}

}
