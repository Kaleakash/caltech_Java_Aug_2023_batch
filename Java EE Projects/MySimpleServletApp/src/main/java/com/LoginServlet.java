package com;
import java.io.IOException;
import java.io.PrintWriter;
	import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;  
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();
	RequestDispatcher rd1 = request.getRequestDispatcher("Home");		// success
	RequestDispatcher rd2 = request.getRequestDispatcher("login.html");	// failure 
	
		String emailid = request.getParameter("email");
		String password = request.getParameter("password");
		// we can check from database using JDBC 
		if(emailid.equals("akash@gmail.com") && password.equals("akash@123")) {
			pw.println("successfully login using get method");
			rd1.forward(request, response);								// only target page 
		}else {
			pw.println("failure try once again using get method");		// source + target 
			rd2.include(request, response);
		}
		
		response.setContentType("text/html");  // output consider as html not plain text
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		RequestDispatcher rd1 = request.getRequestDispatcher("Home");		// success
		RequestDispatcher rd2 = request.getRequestDispatcher("login.html");	// failure 
		
			String emailid = request.getParameter("email");
			String password = request.getParameter("password");
			// we can check from database using JDBC 
			if(emailid.equals("akash@gmail.com") && password.equals("akash@123")) {
				pw.println("successfully login using post method");
				rd1.forward(request, response);								// only target page 
			}else {
				pw.println("failure try once again using post method");		// source + target 
				rd2.include(request, response);
			}
			response.setContentType("text/html");  // output consider as html not plain text
	}

}
