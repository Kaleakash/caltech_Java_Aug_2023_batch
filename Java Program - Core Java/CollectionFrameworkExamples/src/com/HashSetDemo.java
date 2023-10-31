package com;
import java.util.*;
public class HashSetDemo {
	public static void main(String[] args) {
		HashSet hh = new HashSet();
		System.out.println("Size "+hh.size());
		System.out.println("Empty "+hh.isEmpty());
		hh.add(10);
		hh.add(10.10);
		hh.add("Steven");
		hh.add(true);
		System.out.println("Size "+hh.size());
		System.out.println("Empty "+hh.isEmpty());
		System.out.println(hh);
		System.out.println("Search "+hh.contains(10));
		System.out.println("Search "+hh.contains(100));
		System.out.println("Remove "+hh.remove(10));
		System.out.println("Remove "+hh.remove(100));
		System.out.println(hh);
		hh.clear();
		System.out.println("Size "+hh.size());
		System.out.println("Empty "+hh.isEmpty());
		System.out.println(hh);
	}

}
