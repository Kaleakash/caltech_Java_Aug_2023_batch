package com;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//id =100;
		//display();
		Employee emp1 = new Employee();
//		emp1.id=100;
//		emp1.name="Steven";
//		emp1.salary=-14000;
		emp1.setValue(100, "Steven", -14000);
		emp1.display();
	}

}
