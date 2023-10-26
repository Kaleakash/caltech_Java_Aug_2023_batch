package abc;
import java.util.Scanner;
public abstract class Employee {

	private int id;
	private String name;
	private float salary;
	Scanner sc = new Scanner(System.in);

	void readEmployee() {
	System.out.println("Enter the id");
	id = sc.nextInt();
	System.out.println("Enter the name");
	name = sc.next();
	System.out.println("Enter the salary");
	salary = sc.nextFloat();
	}
	// business method. 
	void displayEmployee() {
		System.out.println("Id is "+id);
		System.out.println("Name is "+name);
		System.out.println("Salary is "+salary);
	}
}
