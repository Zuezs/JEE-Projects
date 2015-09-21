package com.eintern.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.eintern.hibernateTest.CreditTest;


@WebServlet(description = "Bank Credit servlet", urlPatterns ={"/bankCreditpath"})
public class BankCredit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String user1 = request.getParameter("userId1");
		String user2 = request.getParameter("userId2");
		
		CreditTest test = new CreditTest();
		
		//For Approved Button
		test.updateStatus(user1, "Approved");
		//For Declined Button
		test.updateStatus(user2, "Declined");
		
			//After Applying send to home page
			request.getRequestDispatcher("BankHome.jsp").forward(request, response);
			
	}
		


}
