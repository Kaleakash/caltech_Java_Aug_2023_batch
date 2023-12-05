package com;

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
	}

}
