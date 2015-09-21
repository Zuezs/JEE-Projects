package com.eintern.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.eintern.hibernate.CreditApp;
import com.eintern.hibernateTest.CreditTest;


@WebServlet(description = "Credit servlet", urlPatterns ={"/creditServletpath"})
public class CreditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("${row.userName}");
		
		/*//Get request from the form created
		String email = request.getParameter("edit");
		
		//Instantiate new credApp
		CreditTest cred = new CreditTest();
		
		cred.showStatus(email);*/
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		
		//Get request from the form created
		
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String credit = request.getParameter("credit");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String salary = request.getParameter("salary");
		
		
		//Instantiate new credApp
		CreditTest cred = new CreditTest();
		
		/*List <CreditApp> user = new ArrayList<CreditApp>();
		user = cred.showAllStats();
		request.setAttribute("CredResults", user);*/
		/*RequestDispatcher view = request.getRequestDispatcher("AdminHome.jsp");
        view.forward(request, response);*/
        
        
        if(cred.showStatus(email) != null){
			//Set values
			cred.registerCredit(email, fname, lname, address, salary, credit);
			
			HttpSession session = request.getSession(true);
			session.setAttribute("theAdd", address);
			session.setAttribute("theCred", credit);
			session.setAttribute("theFname", fname);
			session.setAttribute("theLname", lname);
			session.setAttribute("theSalary", salary);
			
			
			//After Applying send to home page
			request.getRequestDispatcher("Success.jsp").forward(request, response);
        }
		
	}

}
