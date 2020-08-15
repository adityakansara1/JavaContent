package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebServlet("/add")
public class AddServlet extends HttpServlet
{
	// public void doPost(HttpServletRequest req ,HttpServletResponse res) throws IOException
	public void doGet(HttpServletRequest req ,HttpServletResponse res) throws IOException, ServletException
	// We can use both of them for more security of data ,Indirectly the "service" method will be called 
	// public void service(HttpServletRequest req ,HttpServletResponse res) throws IOException 
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i + j;
		
		// SESSION MANAGEMENT
		// HttpSession session = req.getSession();
		// session.setAttribute("k", k);
		// res.sendRedirect("sq");
		
		
		// COOKIE 
		Cookie cookie = new Cookie("k" ,k+"");
		res.addCookie(cookie);
		res.sendRedirect("sq");
		
		// SESSION MANAGEMENT
		// 1. req.setAttribute("k", k);	We have to do this for Request dispatcher
		// 2. res.sendRedirect("sq?k="+k); URL Rewriting...  We have to do this for Redirect method
		
		// To call another servlet from this servlet there is two methods
		// 1. Request Dispacher 
		// 2. Redirect
		
		// 1...
		// RequestDispatcher rd = req.getRequestDispatcher("sq");
		// rd.forward(req, res);
		
		// 2...
		//res.sendRedirect("sq?k="+k); // URL Rewriting	
		
		// PrintWriter out = res.getWriter();
		// out.println("Result is " + k);
		
		// System.out.println("Result is " + k);
	}
}
