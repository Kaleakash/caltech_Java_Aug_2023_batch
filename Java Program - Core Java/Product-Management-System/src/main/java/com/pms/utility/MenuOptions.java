package com.pms.utility;
import java.util.*;
import com.pms.bean.*;
import com.pms.dao.*;
import com.pms.service.LoginService;
import com.pms.service.ProductService;
public class MenuOptions {
	
	static Scanner sc = new Scanner(System.in);
	static int choice;
	static String con;
	static String emailid,password,typeofuser;
	static String result;
	
	public static void loginMenuOption() {
		LoginService ls = new LoginService();
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
			         result = ls.signIn(ll1);
			         if(result.equals("Admin Login successfully")) {
			        	 adminMenuOption();
			         }else if(result.equals("Customer login successfully")) {
			        	 customerMenuOption();
			         }else {
			        	 System.out.println(result);
			         }
			         
				    break;
			case 2: System.out.println("Enter the emailid");
	         		emailid = sc.next();
	         		System.out.println("Enter the password");
	         		password = sc.next();
	         		System.out.println("Type of user");
	         		typeofuser = sc.next();
	         		Login ll2 = new Login(emailid,password,typeofuser);
	         		result = ls.signUp(ll2);
	         		System.out.println(result);
					break;
				
			default : System.out.println("Wrong choice");
					break;
			}
			System.out.println("Do you want to to continue(y/n)");
			con = sc.next();
		}while(con.equalsIgnoreCase("y"));
	}
	
	static int pid;
	static String pname;
	static float price;
	static String con1;
	private static void adminMenuOption() {
		ProductService ps = new ProductService();
			do {
				System.out.println("1:Add 2: Delete 3: Update 4: Find All");
				System.out.println("Plz enter your choice");
				choice = sc.nextInt();
				switch(choice) {
				case 1:System.out.println("Plz enter product id");
				       pid = sc.nextInt();
				       System.out.println("Plz enter the pname");
				       pname = sc.next();
				       System.out.println("Plz enter the price");
				       price = sc.nextFloat();
				       Product p1 = new Product(pid,pname,price);
				       result = ps.storeProduct(p1);
				       System.out.println(result);
				       break;
				case 2:System.out.println("Plz enter product id");
			       		pid = sc.nextInt();
			       		result = ps.deleteProduct(pid);
			       		System.out.println(result);
			       		break;
				case 3:System.out.println("Plz enter product id");
			       		pid = sc.nextInt();
			       		System.out.println("Plz enter the price");
			       		price = sc.nextFloat();
			       		Product p2 = new Product();
			       		p2.setPid(pid);
			       		p2.setPrice(price);
			       		result = ps.updateProduct(p2);
			       		System.out.println(result);
			       		break;
				case 4:System.out.println("All Product details");
				       List<Product> listOfProduct = ps.findAllProduct();
				       Iterator<Product> li = listOfProduct.iterator();
				       while(li.hasNext()) {
				    	   Product p = li.next();
				 System.out.println("Pid "+p.getPid()+"PName "+p.getPname()+"Price "+p.getPrice());
				       }
				       break;
				 default :System.out.println("Wrong choice");
				 		break;
				}
				System.out.println("Do you want to continue(yes/logout)");
				con1 = sc.next();
			}while(con1.equalsIgnoreCase("yes"));
	}
	
	
	private static void customerMenuOption() {
		System.out.println("Cutomer Menu Option we will display");
	}
	
	
	
	
}
