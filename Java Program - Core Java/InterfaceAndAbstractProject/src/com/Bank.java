package com;

public interface Bank {

	void withdrawn(int accno,float amount);
	void deposit(int accno,float amount);
	void transfer(int toaccno,int fromaccno,float amount);
	void checkBalance(int accno);

}
