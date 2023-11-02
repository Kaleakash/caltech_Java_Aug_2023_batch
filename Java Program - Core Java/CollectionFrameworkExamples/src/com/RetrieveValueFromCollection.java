package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class RetrieveValueFromCollection {

	public static void main(String[] args) {
		// Set family ie HashSet, LinkedHashSet and TreeSet 
//		Set ss = new HashSet();
//			ss.add(10);		// autoboxing : convert int to object. 
//			ss.add("Ravi");
//		ss.add(10.10);
//		ss.add(true);
//			System.out.println(ss);  // it display information as string format [v1,v2,v3];
//		System.out.println("Set value using for loop");
//		for(Object n :ss) {
//			System.out.println(n);
//		}
//		System.out.println("Set value using iterator interface ");
//		Iterator ii  =   ss.iterator();
//		while(ii.hasNext()) {
//			 Object obj = ii.next();
//			 System.out.println(obj);
//		}
		
		// List family : ArrayLis and LinkedList 
//		List ll = new ArrayList();
//		ll.add(40);	// auto boxing : convert int to Object. 
//		ll.add(10);
//		ll.add(50);
//		ll.add(90);
//		System.out.println(ll);   // it display all elements in string format. 
//		System.out.println("List using for each loop");
//		for(Object n:ll) {
//			System.out.println(n);
//		}
//		ListIterator li = ll.listIterator();
//		System.out.println("ListIterator -- forward direction");
//		while(li.hasNext()) {
//			Object obj = li.next();
//			System.out.println(obj);
//		}
//		System.out.println("ListIterator -- backward direction");
//		while(li.hasPrevious()) {
//			Object obj = li.previous();
//			System.out.println(obj);
//		}
		// Map faimly : HashMap, LinkedHashMap, TreeMap 
		Map mm = new HashMap();
		mm.put(1, "Ravi");
		mm.put(2, "Lokesh");
		mm.put(3, "Rajesh");
		System.out.println(mm);
//		for(Object obj :mm) {
//			
//		}
		Set key = mm.keySet();		// convert all map's key to set 
		Iterator ii  = key.iterator();
		while(ii.hasNext()) {
			Object obj = ii.next();
			
			System.out.println("Key "+obj+" Value "+mm.get(obj));
		}
	}

}






