<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
   	<%-- <%@ include file="filename.jsp" %> --%>
	<!-- This file is for include header to all web pages in over project --> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="blue">

	<%
		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));
		int k = i + j;
		out.println("Result : " + k);
	
	%> 
	
	// Directive => to import classes
	// there are 3 types  1. @page => as per first line in this page ...there are more attributes also..
						  2. @include => To include same header in all webpages
						  3. @taglib =>to build our own tags like
																  <%-- <%@taglib uri="uri" prefix="fx" %> --%>
																  <!-- <fx:aditya></fx:aditya> --> 
	<%@page import="java.util.*" %>
	
	// Discriptive =>To declare a var in the Servlet class but out of the service(doGet or doPost) method... 
	<%! int a = 40; %>
	
	// Scriptlet =>To write something in service(doGEt or doPost) method 
	<% out.println("HELLO WORLD");%>
	
	// Expression => To print the value of variable without "ut.println("");"
	<%= a %>
</body>
</html>