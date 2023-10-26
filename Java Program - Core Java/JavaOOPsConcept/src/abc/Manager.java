package abc;

public class Manager extends Employee{
private int numberOfEmp;
void readManager() {
	System.out.println("Enter the number of employee working under him");
	numberOfEmp = sc.nextInt();
}
void displayManager() {
	System.out.println("Number of employee working under him "+numberOfEmp);
}
}
