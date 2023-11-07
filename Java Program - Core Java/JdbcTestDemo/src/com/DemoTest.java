package com;
import java.sql.*;
import java.util.*;
public class DemoTest {

	
	// create table employee(id int primary key,name varchar(20), salary float);
	// select * from employee;
	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Drivr Loaded successfully");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/info","root","root@123");
		System.out.println("Database connected...");	
		//Statement stmt = con.createStatement();
		
		// insert Query code 
//		int res = stmt.executeUpdate("insert into employee values(3,'Mohan',39000)");
//		if(res>0) {
//		System.out.println("Record inserted successfully");
//		}
	
//		// Delete Query code 
//		int res = stmt.executeUpdate("delete from employee where id=3");
//		if(res>0) {
//			System.out.println("Record deleted successfully");
//		}else {
//			System.out.println("No record present");
//		}
		
		// update Query code 
//				int res = stmt.executeUpdate("update employee set salary = 55000 where id =2");
//				if(res>0) {
//					System.out.println("Record updated successfully");
//				}else {
//					System.out.println("No record present");
//				}
		// Retrieve records 
//		ResultSet rs = stmt.executeQuery("select * from employee");
//		while(rs.next()) {
//	//System.out.println("id is "+rs.getInt(1)+" Name is  "+rs.getString(2)+" Salary is "+rs.getFloat(3));
//System.out.println("id is "+rs.getInt("id")+" Name is  "+rs.getString("name")+" Salary is "+rs.getFloat("salary"));
//		}
		
		//	it is use to insert more than one record 
//		stmt.addBatch("insert into employee values(3,'Lokesh',36000)");
//		stmt.addBatch("insert into employee values(4,'John',33000)");
//		stmt.addBatch("insert into employee values(5,'Neena',26000)");
//		stmt.addBatch("insert into employee values(6,'Teena',25000)");
//		stmt.addBatch("insert into employee values(7,'Veena',54000)");
//		
//		int res[]=stmt.executeBatch();
//		if(res.length > 0) {
//			System.out.println("All Records inserted...."+res.length);
//		}
		
		Scanner sc = new Scanner(System.in);
		
//		Statement stmt = con.createStatement();
//		int res = stmt.executeUpdate("insert into employee values(1,'Ravi',140000)");
		
		PreparedStatement pstmt = con.prepareStatement("insert into employee values(?,?,?)");
		System.out.println("Enter the id");
		int id = sc.nextInt();
			pstmt.setInt(1,id);
		System.out.println("Enter the name");
		String name = sc.next();
			pstmt.setString(2,name);
		System.out.println("Enter the salary");
		float salary = sc.nextFloat();
			pstmt.setFloat(3,salary);
		int result = pstmt.executeUpdate();
		if(result>0) {
			System.out.println("Record inserted successfully");
		}
		
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}


