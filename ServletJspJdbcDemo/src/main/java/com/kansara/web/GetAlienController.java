package com.kansara.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class GetAlienController extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		ProfileDao dao = new ProfileDao();
		
		if(dao.check(id))	{
			POJO pojo = new POJO();
			pojo = dao.dataFetcher(id);
//			request.setAttribute("profile", pojo);
//			RequestDispatcher rd = request.getRequestDispatcher("profile.jsp");
//			rd.forward(request, response);
			
			HttpSession session = request.getSession();
			session.setAttribute("profile", pojo);
			response.sendRedirect("profile.jsp");
		} else {
			response.sendRedirect("index.jsp");
		}
	}
}
