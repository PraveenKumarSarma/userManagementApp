package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/SaveUserServlet")
public class SaveUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		//Get the requested data
		String userId = request.getParameter("userId");		
		String userName = request.getParameter("userName");
		String userEmail = request.getParameter("userEmail");
		String userMobile = request.getParameter("userMobile");
		String userLocation=request.getParameter("userLocation");
		
		
		//calling the Dao method by passing servlet data
		
		UserDao userDao = new UserDao();
		userDao.saveUser(userId, userName, userEmail, userMobile, userLocation);
		
		//Response
		PrintWriter writer = response.getWriter();
		writer.println("Data inserted successfully.....");
		
	}
}
