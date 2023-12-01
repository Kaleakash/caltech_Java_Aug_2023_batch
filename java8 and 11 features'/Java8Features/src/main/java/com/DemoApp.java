package com;
@FunctionalInterface
interface Test {
	void display();
	default void info() {}
}
class TestImp implements Test {
	public void display() {
		System.out.println("Test interface display method");
	}
	public void info() {
		System.out.println("Test interface display method");
	}
}
public class DemoApp {
	public static void main(String[] args) {
		// 1st way to provide the body for interface 
		Test tt1 = new TestImp();
		tt1.display();
		// 2nd way to provide the body using anonymous class. 
		Test tt2 = new Test() {
			public void display() {
				System.out.println("Test interface display method provided body using anonymous class - 1st logic ");
			}
			public void info() {
				System.out.println("Test interface display method");
			}
		};
		tt2.display();
		
		Test tt3 = new Test() {
			public void display() {
				System.out.println("Test interface display method provided body using anonymous class - 2nd logic ");
			}
			public void info() {
				System.out.println("Test interface display method");
			}
		};
		tt3.display();
		//3rd way we can provide the body for Test interface using lambda style. 
		Test tt4 = ()->System.out.println("Test interface display method provided body using lambda sytle -1st logic");
		tt4.display();
		Test tt5 = ()->System.out.println("Test interface display method provided body using lambda sytle - 2nd logic");
		tt5.display();
	}
}
