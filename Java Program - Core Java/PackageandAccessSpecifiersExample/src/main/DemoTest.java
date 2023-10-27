package main;

import bean.Employee;
import college.Attendance;
//import school.Attendance;
public class DemoTest {

	public static void main(String[] args) {
//	college.Attendance att1 = new college.Attendance();
//	college.Attendance a1 = new college.Attendance();
//	college.Attendance a2 = new college.Attendance();
		Attendance att1 = new Attendance();
		att1.display();
	school.Attendance att2 = new school.Attendance();
		att2.display();
		Test tt = new Test();
		Employee emp1 = new Employee();
		emp1.disEmployee();
	}

}
