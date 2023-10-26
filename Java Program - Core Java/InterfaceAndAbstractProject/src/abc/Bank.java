package abc;

public abstract class Bank {

	abstract void withdrawn(int accno,float amount);
	abstract void deposit(int accno,float amount);
	abstract void transfer(int toaccno,int fromaccno,float amount);
	
	void checkBalance(int accno) {
		System.out.println("accno with default implementation");
	}
	final void rateOfInterest() {
		System.out.println("9% of Home loan");
	}
}
