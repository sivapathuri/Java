package com.test;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.test.model.User;
import com.test.service.AuthenticateService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		System.out.println("username:" + username);
		System.out.println("password:" + password);
		
		AuthenticateService authService = new AuthenticateService();
		boolean result = authService.authenticate(username, password);
		System.out.println("Authentication:" + result);
		if(result) {
			User user = authService.getUserDetails(username);
			request.getSession().setAttribute("user", user);
			response.sendRedirect("success.jsp");
			
			/*
			 * server side redirect
			 */
			//RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
			//rd.forward(request, response);
			
		} else {
			response.sendRedirect("login.jsp");
		}
		//doGet(request, response);
	}

}
