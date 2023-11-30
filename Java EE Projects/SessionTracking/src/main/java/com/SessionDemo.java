package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionDemo
 */
@WebServlet("/SessionDemo")
public class SessionDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    int count =0;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw = response.getWriter();
		HttpSession hs = request.getSession();
		RequestDispatcher rd = request.getRequestDispatcher("index.html");
		pw.println("<h3>");
		if(hs.isNew()) {
			pw.println("new client");
		}else {
			pw.println("Old client");
		}
		pw.println("<br/>");
		pw.println("<br/> Session id "+hs.getId());
		pw.println("<br/> Session Creation time "+hs.getCreationTime());  //it display in millisession format 
		pw.println("<br/> Session Creation time in date and time format "+new Date(hs.getCreationTime()));
		pw.println("<br/> Last access time is "+new Date(hs.getLastAccessedTime()));
		pw.println("<br/> Default sessiontime is "+hs.getMaxInactiveInterval());  // by default 3 min ie 1800
		hs.setMaxInactiveInterval(600);
		pw.println("<br/> session inactive set time is "+hs.getMaxInactiveInterval());  // by default 3 min
		pw.println("<br/> Value of count is "+count);
		if(count%5==0) {
			hs.invalidate();		// destroy the session 
		}
		count++;
		response.setContentType("text/html");
		pw.println("</h3>");
		rd.include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
