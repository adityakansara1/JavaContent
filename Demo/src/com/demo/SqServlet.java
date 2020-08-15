package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebServlet("/sq")
public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest req ,HttpServletResponse res) throws IOException, ServletException
	{
		int k = 0;
		// Req. Dis.
		// k = (int) req.getAttribute("k");
		
		// HttpSession session= req.getSession();
		// k = (int)session.getAttribute("k");
		
		Cookie cookies[] = req.getCookies();
		
		for(Cookie c : cookies) {
			if(c.getName().equals("k"))
				k = Integer.parseInt(c.getValue());
		}
	
		// Redirect 
		// k = Integer.parseInt(req.getParameter("k"));
		
		
		PrintWriter out = res.getWriter();
		out.println("Result is " + k*k);
	}
}
