package com;

public class DefaultThreadExample {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t);
		t.setName("My Thread");
		t.setPriority(2);
		System.out.println(t);
		t.setPriority(Thread.MAX_PRIORITY); // 10 
		System.out.println(t);
		//t.setPriority(11);
		String name = t.getName();
		int i = t.getPriority();
		ThreadGroup tg	= t.getThreadGroup();
		System.out.println("name "+name);
		System.out.println("priority "+i);
		System.out.println("group info "+tg.getName());
	}

}
