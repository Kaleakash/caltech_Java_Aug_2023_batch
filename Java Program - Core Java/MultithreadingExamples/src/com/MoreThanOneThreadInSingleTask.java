package com;
class Task implements Runnable{
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		for(int i=0;i<5;i++) {
			try {
				System.out.println("thread name "+name);
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
public class MoreThanOneThreadInSingleTask {
	public static void main(String[] args) {
	Thread t = Thread.currentThread();
	System.out.println(t);
	Runnable rr = new Task();
	Thread t1 = new Thread(rr);
	Thread t2 = new Thread(rr);
	Thread t3 = new Thread(rr);
	Thread t4 = new Thread(rr);
	t1.setName("1st Thread");
	t2.setName("2nd Thread");
	t3.setName("3rd Thread");
	t4.setName("4th Thread");
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	}

}
