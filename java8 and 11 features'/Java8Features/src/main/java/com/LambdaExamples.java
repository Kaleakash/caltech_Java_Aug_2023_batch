package com;
@FunctionalInterface
interface Operation {
	public int add(int x, int y);
}
public class LambdaExamples {
	public static void main(String[] args) {
	Operation op1 = (a,b)->a+b;
	System.out.println("Sum of two number is "+op1.add(100, 200));
	Operation op2 = (x,y)->x+y;
	System.out.println("Sum of two number is "+op2.add(10, 20));
	Operation op3 = (int x, int y)->x+y;
	System.out.println("Sum of two number is "+op3.add(1, 2));
	Operation op4 = (int x, int y)-> {
		int sum = x+y;
		return sum;
	};
	System.out.println("Sum of two number is "+op4.add(11, 22));
	}

}
