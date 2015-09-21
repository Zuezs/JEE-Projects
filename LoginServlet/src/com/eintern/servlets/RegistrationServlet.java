package com.eintern.servlets;

import java.io.IOException;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.eintern.hibernateTest.RegisterTest;


@WebServlet(description = "Register Servlet", urlPatterns = {"/registerServletpath"})
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public RegistrationServlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("userName");

		
		//Instantiate RegisterTest to get registerUser method
		RegisterTest register = new RegisterTest();
		
		
		boolean b = register.compare(email);
		
		
		if(b){
			String greetings = "Username is available!";
			response.setContentType("text/plain");
	        response.getWriter().write(greetings);
			
		}else{
			String greetings = "Username is unavailable! Choose again!";
			response.setContentType("text/plain");
	        response.getWriter().write(greetings);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//Get request from the form created
		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		//Instantiate RegisterTest to get registerUser method
		RegisterTest register = new RegisterTest();
		
		//Testing the compare function
		/*request.setAttribute("message", message);
		request.getRequestDispatcher("/Register.jsp").forward(request, response);*/
		
		//Set request in method to save registree
		register.registerUser(firstName, lastName, email, password);
		
		//Print Success and Redirect to login page
		System.out.println("You Are Registered!!! Log In!");
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
	}

}
