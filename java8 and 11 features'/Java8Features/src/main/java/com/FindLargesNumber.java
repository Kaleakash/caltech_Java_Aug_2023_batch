package com;

@FunctionalInterface
interface LargestNumber {
	public boolean findLargest(int x, int y);
}
public class FindLargesNumber {

	public static void main(String[] args) {
		
	LargestNumber ll = (x,y)->x>y;
	System.out.println(ll.findLargest(100, 50));
	System.out.println(ll.findLargest(100, 500));
	}

}
