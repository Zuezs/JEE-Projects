package com.eintern.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eintern.hibernateTest.CreditTest;
import com.eintern.hibernateTest.RegisterTest;


@WebServlet(description = "Admin Credit servlet", urlPatterns ={"/adminRegistrationpath"})
public class AdminRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RegisterTest test = new RegisterTest();
		
		//Parameters for the Edit Button
		String email = request.getParameter("Uname");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String password = request.getParameter("password");
		String role = request.getParameter("role");
		
		//Calling method to edit users
		test.editRegister(email, fname, lname, password, role);
		
		//After Applying send to home page
		request.getRequestDispatcher("AdminHome.jsp").forward(request, response);
		
		//For the delete button
		String nameToDelete = request.getParameter("userId");
		test.deleteUser(nameToDelete);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		RegisterTest test = new RegisterTest();
		
		//Parameters for the Edit Button
		String email = request.getParameter("Uname");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String password = request.getParameter("password");
		
		//Add parameters to method
		test.registerUser(fname, lname, email, password);
		
		//After Adding send to edit page
				request.getRequestDispatcher("AdminEditRegister.jsp").forward(request, response);
	}

}
