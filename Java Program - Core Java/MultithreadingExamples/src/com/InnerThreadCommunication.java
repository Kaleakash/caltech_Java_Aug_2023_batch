package com;
class InnerThread implements Runnable {
	@Override
	public synchronized void run() {
	Thread t = Thread.currentThread();
	String name = t.getName();
		for(int i=0;i<=10;i++) {
			try {
				Thread.sleep(500);
				if(i==5 && name.equals("Ravi")) {
					wait();
				}
				if(i==3 && name.equals("John")) {
					notify();
					wait();
				}
				System.out.println("name "+name);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
public class InnerThreadCommunication {
	public static void main(String[] args) {
	Runnable r = new InnerThread();
	Thread t1 = new Thread(r);
	Thread t2 = new Thread(r);
	Thread t3 = new Thread(r);
	//Thread t4 = new Thread(r);
	t1.setName("Ravi");
		t2.setName("John");
	t3.setName("Ajay");
	//t4.setName("Lex");
	t1.start();
	t2.start();
	t3.start();
	//t4.start();
	}

}
