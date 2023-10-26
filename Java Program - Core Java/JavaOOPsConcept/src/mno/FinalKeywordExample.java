package mno;
final class A {
	final void dis() {
		System.out.println("A class method");
	}
}
//class B extends A {
////	void dis() {
////		System.out.println("B class overrid A class dis method");
////	}
//}
public class FinalKeywordExample {
	public static void main(String[] args) {
	final int A=10;
	int b=20;
	System.out.println(A);
	//A=20;
	b=30;
//	B obj = new B();
//	obj.dis();
	A obj1 = new A();
	obj1.dis();
	}

}
