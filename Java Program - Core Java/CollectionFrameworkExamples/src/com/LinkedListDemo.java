package com;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(10); 
		al.add(20); 
		al.add(30);
		System.out.println(al);
			al.add(1, 100);
		LinkedList ll = new LinkedList(); // double linked list consider.
		ll.add(10); 
		ll.add(20); 
		ll.add(30);
		System.out.println(ll);
			ll.add(1, 100);
			ll.addFirst(1);
			ll.addLast(2);
			System.out.println(ll);
			System.out.println(" "+ll.getFirst());
			System.out.println(""+ll.getLast());
	}

}
