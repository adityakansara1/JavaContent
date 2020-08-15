package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String fName = request.getParameter("fName") ,lName = request.getParameter("lName") ,sName = request.getParameter("sName");
		
		String gender = request.getParameter("gender");
		String qualification = request.getParameter("qualification");
		String address = request.getParameter("address");
		
		out.println("<table style=\"width:100%;border: 1px solid #dddddd;\">\r\n" + 
				"  <tr>\r\n" + 
				"    <th>Firstname</th>\r\n" + 
				"    <th>Lastname</th>\r\n" + 
				"    <th>Surname</th>\r\n" + 
				"    <th>Gender</th>\r\n" + 
				"    <th>Qualification</th>\r\n" +
				"    <th>Address</th>\r\n" + 
				"  </tr>\r\n" + 
				"  <tr>\r\n" + 
				"    <td>" + fName + "</td>\r\n" + 
				"    <td>" + lName + "</td>\r\n" + 
				"    <td>" + sName + "</td>\r\n" +
				"    <td>" + gender + "</td>\r\n" +
				"    <td>" + qualification + "</td>\r\n" +
				"    <td>" + address + "</td>\r\n" +
				"  </tr>\r\n" + 
				"</table>");
	}

}