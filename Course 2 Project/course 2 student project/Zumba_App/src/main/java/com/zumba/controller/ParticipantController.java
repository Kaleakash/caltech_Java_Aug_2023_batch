package com.zumba.controller;

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

import com.zumba.bean.Batch;
import com.zumba.bean.Participant;
import com.zumba.service.BatchService;
import com.zumba.service.ParticipantsService;

/**
 * Servlet implementation class ParticipantController
 */
@WebServlet("/ParticipantController")
public class ParticipantController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ParticipantController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		BatchService bs = new BatchService();
		List<Batch> listOfBatch = bs.allBatchDetails();
		HttpSession hs =request.getSession();
		hs.setAttribute("batchInfo", listOfBatch);
		response.sendRedirect("addParticipants.jsp");
	}

	ParticipantsService ps = new ParticipantsService();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		String operation = request.getParameter("operation");
		if(operation.equals("add")) {
			int participantid = Integer.parseInt(request.getParameter("participantid"));
			String pname = request.getParameter("pname");
			int age  = Integer.parseInt(request.getParameter("age"));
			String phonenumber = request.getParameter("phonenumber");
			int batchd = Integer.parseInt(request.getParameter("batchid"));
			Participant pp = new Participant();
					pp.setParticipantid(participantid);
					pp.setPname(pname);
					pp.setAge(age);
					pp.setPhonenumber(phonenumber);
					pp.setBatchid(batchd);
					String result = ps.storeParticipatns(pp);
					pw.println(result);
					RequestDispatcher rd = request.getRequestDispatcher("addParticipants.jsp");
					response.setContentType("text/html");
					rd.include(request, response);
		}
	}

}
