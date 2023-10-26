package abc;

public class EmployeeTest {

	public static void main(String[] args) {
//	System.out.println("Enter generic employee details");
//	Employee emp1 = new Employee();
//	emp1.readEmployee();
//	emp1.displayEmployee();
	
	System.out.println("enter the manager details");
	Manager mgr1 = new Manager();
	mgr1.readEmployee();
	mgr1.readManager();
	
	mgr1.displayEmployee();
	mgr1.displayManager();
	
	}

}
