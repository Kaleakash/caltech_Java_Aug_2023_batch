package com;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
	ArrayList al = new ArrayList();
	System.out.println("Size "+al.size());
	al.add(10);
	al.add(10.10);
	al.add(10);
	al.add("Ravi");
	System.out.println(al);
	System.out.println("Get the value using index position "+al.get(0));
	System.out.println("Get the value using index position "+al.get(1));
		System.out.println(al);
	al.add(1, 200);  // add 200 at 1 index postion 
	System.out.println("Get the value using index position "+al.get(1));
	System.out.println("Get the value using index position "+al.get(2));
		System.out.println(al);
	al.remove("Ravi");		// remove using value 
	al.remove(0);			// remove using index 
	Integer i = 200;		// i consider as object not a primitive 
	al.remove(i);			// 200 index position consider 
	System.out.println(al);
	}

}


