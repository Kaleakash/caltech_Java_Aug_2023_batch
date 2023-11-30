package com.ems.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ems.bean.Employee;
import com.ems.service.EmployeeService;

/**
 * Servlet implementation class EmployeeController
 */
@WebServlet("/EmployeeController")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public EmployeeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		EmployeeService es = new EmployeeService();
		List<Employee> listOfEmp  = es.findAllEmployee();
		HttpSession hs = request.getSession();
		hs.setAttribute("listOfEmp", listOfEmp);
		response.sendRedirect("employeeDisplay.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		// Integer.parseInt it help to convert string to integer. 
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		float salary = Float.parseFloat(request.getParameter("salary"));

		// converted form value into java bean class object. 
		
		Employee emp = new Employee();
		emp.setId(id);
		emp.setName(name);
		emp.setSalary(salary);
		// pass java bean to dao layer 
		EmployeeService es = new EmployeeService();
		String result = es.storeEmployee(emp);
		// display result and include same page once again. 
		pw.print(result);
		response.setContentType("text/html");
		RequestDispatcher rd = request.getRequestDispatcher("storeEmployee.jsp");
		rd.include(request, response);
	}

}
















