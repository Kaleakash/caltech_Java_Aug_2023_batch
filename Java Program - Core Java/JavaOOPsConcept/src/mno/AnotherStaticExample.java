package mno;
class Test {
	int a;
	static int b;
	void dis() {
		System.out.println("a "+a);
		System.out.println("b "+b);
	}
}
public class AnotherStaticExample {
	public static void main(String[] args) {
			Test tt1 = new Test();			// heap memory 
				Test tt2 = new Test();		// another heap memory 
					tt1.a=100;
						Test.b=200;
							tt1.b=300;
								tt2.a=400;
									Test.b=500;
									tt2.b=600;
	tt1.dis();			// a=100		b=600
	tt2.dis();			// a=400		b=600
	}

}
