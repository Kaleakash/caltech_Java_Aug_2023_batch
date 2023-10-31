package com;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack ss = new Stack();
		ss.push(100);
		ss.push(200);
		ss.push(300);
		ss.push(400);		// top to bottom and count start from 1 
		System.out.println(ss);
		System.out.println("To remove top most elements "+ss.pop());
		System.out.println(ss);
		System.out.println("To verify top most element "+ss.peek());
		System.out.println(ss);
		System.out.println("Search "+ss.search(300));	// it check from top. 
		System.out.println("Search "+ss.search(200));
		System.out.println("Search "+ss.search(100));
		System.out.println("Search "+ss.search(1000));
		if(ss.search(100)==-1) {
			System.out.println("Element not present");
		}else {
			System.out.println("element is present");
		}
	}

}
