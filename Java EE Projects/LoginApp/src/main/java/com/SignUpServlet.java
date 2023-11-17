package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignUpServlet
 */
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUpServlet() {
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
		
		PrintWriter pw = response.getWriter();
		String emailid = request.getParameter("email");
		String password = request.getParameter("password");
		String typeofuser = request.getParameter("typeofuser");
		
		RequestDispatcher rd = request.getRequestDispatcher("signUp.html");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/info", "root", "root@123");
			PreparedStatement pstmt = con.prepareStatement("insert into login values(?,?,?)");
			pstmt.setString(1, emailid);
			pstmt.setString(2, password);
			pstmt.setString(3,typeofuser);
			int res = pstmt.executeUpdate();
			if(res>0) {
				pw.println("Account created successfully");
				rd.include(request, response);
			}
		} catch (Exception e) {
			System.err.print(e);
			pw.println("Account didn't create "+e.toString());
			rd.include(request, response);
		}
		response.setContentType("text/html");
	}

}





