<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.kansara.web.POJO"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
td,th,table {
	border: 1px solid red;
}
</style>
</head>
<body>
	<%
		/* POJO p1 = (POJO)request.getAttribute("profile"); */
		POJO p1 = (POJO)session.getAttribute("profile");
	%>
	<table>
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>PHONE</th>
			<th>PIN</th>
		</tr>
		<tr>
			<td><%=p1.getId()%></td>
			<td><%=p1.getName()%></td>
			<td><%=p1.getPhone()%></td>
			<td><%=p1.getPin()%></td>
		</tr>
	</table>
</body>
</html>