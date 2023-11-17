package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		PrintWriter pw = response.getWriter();
		String emailid = request.getParameter("email");
		String password = request.getParameter("password");
		String typeofuser = request.getParameter("typeofuser");
		
		RequestDispatcher rd1 = request.getRequestDispatcher("login.html");
		RequestDispatcher rd2 = request.getRequestDispatcher("AdminHome");
		RequestDispatcher rd3 = request.getRequestDispatcher("CustomerHome");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/info", "root", "root@123");
	PreparedStatement pstmt = con.prepareStatement("select * from login where emailid = ? and password = ? and typeofuser = ?");
			pstmt.setString(1, emailid);
			pstmt.setString(2, password);
			pstmt.setString(3,typeofuser);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
						if(typeofuser.equals("admin")) {
							rd2.forward(request, response);
						}else {
							rd3.forward(request, response);
						}
			}else {
				pw.println("Invalid emailid or password or typeofuser");
				rd1.include(request, response);
			}
		} catch (Exception e) {
			System.err.print(e);
			pw.println("While login exception "+e.toString());
			rd1.include(request, response);
		}
		response.setContentType("text/html");
		
	}
	
		
}
