package abc;
class A extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(" A thread "+i);
		}
	}
}
class B extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(" B thread "+i);
		}
	}
	
}
public class ExtendsThreadClassExample {
	public static void main(String[] args) {
//		A obj1 = new A();		// obj1 is consider as thread class reference. 
//		B obj2 = new B();
		Thread obj1 = new A();	// sub class object and super class/interface reference possible 
		Thread obj2 = new B();
		obj1.start();			// ready to run internally call run method. 
		obj2.start();
	}

}
