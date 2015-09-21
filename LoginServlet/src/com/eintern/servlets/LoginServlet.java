package com.eintern.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.eintern.hibernate.Registration;
import com.eintern.hibernateTest.AuthTest;
import com.eintern.hibernateTest.RegisterTest;


@WebServlet(description = "Login servlet", urlPatterns = {"/loginServletpath"})
public class LoginServlet extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello from the Servlet GET method");
		response.getWriter().print("Hello from the Servlet GET method on the webpage!");
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		boolean auth = false;
		
		AuthTest test = new AuthTest();
		Registration user = new Registration();
		RegisterTest tester = new RegisterTest();
		
		auth = test.authorizeUser(name, password);
		user = tester.getUser(name);
		 
		
		if(auth == true){
			if(user.getRole().equals("Client")){
				System.out.println("Success!");
				HttpSession session = request.getSession(true);
				session.setAttribute("theName", name);
				session.setAttribute("authorize", test);
				request.getRequestDispatcher("Success.jsp").forward(request, response);
			}
			if(user.getRole().equals("Admin")){
				System.out.println("Success!");
				HttpSession session = request.getSession(true);
				session.setAttribute("theName", name);
				session.setAttribute("authorize", test);
				request.getRequestDispatcher("AdminHome.jsp").forward(request, response);
			}
			if(user.getRole().equals("Bank")){
				System.out.println("Success!");
				HttpSession session = request.getSession(true);
				session.setAttribute("theName", name);
				session.setAttribute("authorize", test);
				request.getRequestDispatcher("BankHome.jsp").forward(request, response);
			}
			
			
		}else{
			System.out.println("Fail!");
			request.getRequestDispatcher("Fail.jsp").forward(request, response);
		}

	}

}
