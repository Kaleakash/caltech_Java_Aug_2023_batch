package com.pms.utility;
import java.util.*;
import com.pms.bean.*;
import com.pms.dao.*;
public class MenuOptions {
	
	static Scanner sc = new Scanner(System.in);
	static int choice;
	static String con;
	static String emailid,password,typeofuser;
	static String result;
	public static void loginMenuOption() {
	LoginDao ld = new LoginDao();
		do {
			System.out.println("1:Sign In 2: Sign Up");
			System.out.println("Plz enter your choice");
			choice = sc.nextInt();
			switch(choice) {
			case 1 : System.out.println("Enter the emailid");
			         emailid = sc.next();
			         System.out.println("Enter the password");
			         password = sc.next();
			         System.out.println("Type of user");
			         typeofuser = sc.next();
			         Login ll1 = new Login(emailid,password,typeofuser);
			         result = ld.signIn(ll1);
			         System.out.println(result);
				    break;
			case 2: System.out.println("Enter the emailid");
	         		emailid = sc.next();
	         		System.out.println("Enter the password");
	         		password = sc.next();
	         		System.out.println("Type of user");
	         		typeofuser = sc.next();
	         		Login ll2 = new Login(emailid,password,typeofuser);
	         		result = ld.signUp(ll2);
	         		System.out.println(result);
					break;
				
			default : System.out.println("Wrong choice");
					break;
			}
			System.out.println("Do you want to to continue(y/n)");
			con = sc.next();
		}while(con.equalsIgnoreCase("y"));
	}
}
