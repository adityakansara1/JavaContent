<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/aditya" user="root" password=""/>
	<sql:query var="rs" dataSource="${db}">select * from student_marks1</sql:query> 
	<c:forEach items="${rs.rows }" var="student">
		<c:out value="${student.id }"> </c:out> : <c:out value="${student.name }"></c:out> : <c:out value="${student.phone }"></c:out><br>
 	</c:forEach>
</body>
</html>