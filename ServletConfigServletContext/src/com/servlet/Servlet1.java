package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * ServletConfig & ServletContext
 **/
public class Servlet1 extends HttpServlet 
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException ,ServletException
	{
		PrintWriter out = res.getWriter();
		out.println("HELLO");
	
//		ServletContext ctx = getServletContext();
//		String str = ctx.getInitParameter("name");
//		str += " ";
//		str += ctx.getInitParameter("name");
		
		ServletConfig cg = getServletConfig();
		String str = cg.getInitParameter("name");
		str += " ";
		str += cg.getInitParameter("phone");
		
		// EXCEPTION HANDLING 
		// 1. try catch method
		try {
			int a = 9/0;
		}
		catch(Exception e) {
			out.println("Error " + e);
		}
		finally {
			int a = 9/1;
		} 
		
		// 2. jsp method
		//We have done that in jsp files
		
		
		out.println(str);
	}
}

