package com;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
	public static void main(String[] args) {
	//HashMap mm = new HashMap();
	//Map mm1 = new HashMap();  // creating object of sub class and reference of interface. 
	//Map mm1 = new LinkedHashMap();  // creating object of sub class and reference of interface. 
	Map mm1 = new TreeMap();
	mm1.put(2, "Steven");
	mm1.put(1, "John");
	mm1.put(3, "Leena");
		//mm1.put("A", "B");
	System.out.println(mm1);
	mm1.put(1, "Akash");		// value replace. 
	mm1.put(7, "Steven");
	System.out.println(mm1);
		System.out.println("Search key "+mm1.containsKey(1));
	System.out.println("Search key "+mm1.containsKey(10));
		System.out.println("Search key "+mm1.containsValue("Akash"));
	System.out.println("Search key "+mm1.containsValue("Vikash"));
	System.out.println("Using key we can get the value "+mm1.get(1));
	}

}
