package com;
@FunctionalInterface
interface Abc {
	void dis1();
	default void dis2() {
		System.out.println("dis2 default implementation");
	}
	default void dis3() {
		System.out.println("dis2 default implementation");
	}
	static void dis4() {
		System.out.println("dis3 static implementation");
	}
	default void dis5() {}
}
class Demo implements Abc {
	@Override
	public void dis1() {
		System.out.println("provided body for dis1 method");
	}
	@Override
	public void dis2() {
		System.out.println("Demo class overrided dis2 method ");
	}
	public void dis5() {
		System.out.println("provided body for dis5 method");
	}
//	@Override
//	static void dis4() {
//		System.out.println("dis2 static implementation");
//	}
}
public class Java8Interface {
	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.dis1();
		obj.dis2();
		obj.dis3();
		Abc.dis4();     // static method we need to call by interface name. 
	}

}
