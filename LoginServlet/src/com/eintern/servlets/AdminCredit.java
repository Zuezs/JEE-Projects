package com.eintern.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eintern.hibernateTest.CreditTest;

@WebServlet(description = "Admin Credit servlet", urlPatterns ={"/adminCreditpath"})
public class AdminCredit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CreditTest test = new CreditTest();
		
		//For the Edit Button
		String email = request.getParameter("Uname");
		String address = request.getParameter("address");
		String credit = request.getParameter("credit");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String salary = request.getParameter("salary");
		
		
		//Set values
		test.registerCredit(email, fname, lname, address, salary, credit);
		
		//After Applying send to home page
		request.getRequestDispatcher("AdminHome.jsp").forward(request, response);
		
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CreditTest test = new CreditTest();
		
		//For the delete button
				String nameToDelete = request.getParameter("userId");
				test.deleteCredit(nameToDelete);
		
		//After adding user credit send to home page
		request.getRequestDispatcher("AdminHome.jsp").forward(request, response);
	}
		

}
