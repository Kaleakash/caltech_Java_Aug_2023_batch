package com;

import java.util.Arrays;
import java.util.List;

public class Java11Features {

	public static void main(String[] args) {
	String msg = "  Welcome to java ";
	String info ="     ";
	System.out.println(msg);
	System.out.println(msg.length());
	System.out.println(msg.strip().length());
	System.out.println(msg.stripLeading().length());
	System.out.println(msg.stripTrailing().length());
	System.out.println(info.length());
	System.out.println(info.isBlank());
	msg.lines().forEach(e->System.out.println(e));
	List<String> names = Arrays.asList("Ravi","Ramesh","Lex","Rajesh","Lokesh");
	//names.stream().forEach((name)->System.out.println(name));
	//names.stream().forEach((String name)->System.out.println(name));
	names.stream().forEach((var name)->System.out.println(name));
	var name="Akash";
	name="Ravi";
	//name=100;
	System.out.println(name);
	}

}
