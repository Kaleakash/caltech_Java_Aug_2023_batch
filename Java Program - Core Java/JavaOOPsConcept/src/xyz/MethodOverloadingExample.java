package xyz;

class Operation {
//	void read() {
//		System.out.println(10+20);
//	}
//	void display() {
//		System.out.println(10+20);
//	}
	void add() {
		System.out.println(10+20);
	}
	void add(int x) {
		System.out.println(x+20);
	}
	void add(int x, int y) {
		System.out.println(x+y);
	}
	void add(float x, float y) {
		System.out.println(x+y);
	}
	void add(String x, String y) {
		System.out.println(x+y);			// 100200 
	}
}
public class MethodOverloadingExample {
	public static void main(String[] args) {
	Operation op = new Operation();
	op.add(10);
	op.add();
	op.add(1,2);
	op.add(10.10f,20.20f);
	op.add("100","200");
	}

}
