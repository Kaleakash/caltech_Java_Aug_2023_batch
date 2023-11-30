package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Demo
 */
@WebServlet("/Demo")
public class Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	String name = "Akash";
    public Demo() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		pw.println("In Sevlet Program <br/>");
		pw.println("Name is "+name);
			//request.setAttribute("obj", name);			// value set in request scope object. 
		HttpSession hs = request.getSession();
		hs.setAttribute("obj",name);
		RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
		//rd.include(request, response);					// source + target 
		//rd.forward(request, response);					//target page old request  
			response.sendRedirect("welcome.jsp");			// target page new request 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
	}

}
