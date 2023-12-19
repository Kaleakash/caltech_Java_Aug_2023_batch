package com.zumba.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zumba.bean.Batch;
import com.zumba.service.BatchService;

/**
 * Servlet implementation class BatchController
 */
@WebServlet("/BatchController")
public class BatchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BatchController() {
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

	BatchService bs = new BatchService();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		String operation = request.getParameter("operation");
		if(operation.equals("add")) {
				Batch batch = new Batch();
			int batchId = Integer.parseInt(request.getParameter("batchid"));
			String typeofbatch = request.getParameter("typeofbatch");
			String time = request.getParameter("time");
			
			batch.setBatchid(batchId);
			batch.setTypeofbatch(typeofbatch);
			batch.setTime(time);
			String result = bs.storeBatch(batch);
			pw.println(result);
			RequestDispatcher rd = request.getRequestDispatcher("addBatch.jsp");
			response.setContentType("text/html");
			rd.include(request, response);
		}
	}

	
	
}
