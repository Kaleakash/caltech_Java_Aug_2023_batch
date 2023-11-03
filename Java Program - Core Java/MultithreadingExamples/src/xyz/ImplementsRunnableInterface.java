package xyz;
class A implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(" A thread "+i);
			try {
			Thread.sleep(500);
			}catch(Exception e) {}
		}	
	}
}
class B implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(" B thread "+i);
			try {
				Thread.sleep(1000);
				}catch(Exception e) {}
		}
	}
}
public class ImplementsRunnableInterface {
	public static void main(String[] args) {
//	A obj1 = new A();
//	B obj2 = new B();
	Runnable obj1 = new A();		// sub class object super interface reference. 
	Runnable obj2 = new B();
	Thread t1 = new Thread(obj1);		// create thread class and pass runnable reference as parameter 
	Thread t2 = new Thread(obj2);
	System.out.println("Thred A status "+t1.isAlive());  // running or not false 
	System.out.println("Thred B status "+t2.isAlive());  // running or not false 
	t1.start();
	t2.start();
	System.out.println("Thred A status "+t1.isAlive());  // running or not true 
	System.out.println("Thred B status "+t2.isAlive());  // running or not true 
	}

}
