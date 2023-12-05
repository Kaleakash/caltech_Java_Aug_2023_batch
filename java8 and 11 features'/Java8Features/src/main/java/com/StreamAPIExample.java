package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

class MyConsumer implements Consumer<Integer>{
	@Override
	public void accept(Integer t) {
		System.out.println("Value is "+t);
	}
}
public class StreamAPIExample {

	public static void main(String[] args) {
	List<Integer> ll = new ArrayList<Integer>();
	ll.add(1);ll.add(12);ll.add(18);ll.add(32);ll.add(8);
	ll.add(2);ll.add(19);ll.add(21);ll.add(45);ll.add(90);ll.add(45);
	ll.add(5);ll.add(10);ll.add(24);ll.add(56);ll.add(101);ll.add(34);
	List<String> names = new ArrayList<String>();
	names.add("Steven"); names.add("Ravi"); names.add("Lokesh");
	names.add("Lex"); names.add("Leena");
//	Iterator<Integer> li = ll.iterator();
//	while(li.hasNext()) {
//		int n = li.next();
//		if(n%2!=0) {
//			System.out.println(n);
//		}
//	}
//	Consumer<Integer> cc = new MyConsumer();
	//ll.stream().forEach(cc);
	//ll.stream().forEach((v)->System.out.println("Value is "+v));			// display all number 
	//ll.stream().filter(a->a%2==0).forEach(v->System.out.println("Even number "+v));	// even number 
	//ll.stream().map(v->v+100).forEach(v->System.out.println(v)); // added 100 for each number 
	//names.stream().map(e->e.toUpperCase()).forEach(e->System.out.println(e));	// convert to upper case
	//names.stream().map(e->"Welcome user "+e).forEach(e->System.out.println(e));
	//long count = names.stream().filter(v->v.contains("e")).count();
	//long count = names.stream().filter(v->v.startsWith("L")).count();
	//System.out.println("number of names "+count);
//	boolean res = names.stream().anyMatch(e->e.contains("v"));
//	System.out.println(res);
	
	boolean res = names.stream().allMatch(e->e.length()>3);
	System.out.println(res);
	}

}



