package com;
class Booking implements Runnable{
	int avl=1;
	
	public synchronized void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		if(avl==1) {
			System.out.println(name+" got the ticket");
			avl = avl-1;
		}else {
			System.out.println("sorry no ticket "+name);
		}
	}
}
public class BookingApp {
	public static void main(String[] args) {
	Runnable rr1 = new Booking();			// avl = 1
	//Runnable rr2 = new Booking();			// avl=1
	//Runnable rr3 = new Booking();			// avl=1
	//Runnable rr4 = new Booking();			// avl = 1
	Thread t1 = new Thread(rr1);
	Thread t2 = new Thread(rr1);
	Thread t3 = new Thread(rr1);
	Thread t4 = new Thread(rr1);
	t1.setName("John");
	t2.setName("Steven");
	t3.setName("Leena");
	t4.setName("Lex");
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	}

}

