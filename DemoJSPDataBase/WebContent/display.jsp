<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<c:forEach items="${students}" var="s">
		${s}<br>
		${s.name }<br>
		${s.id }<br><br>
	</c:forEach>
	
	<%--
		All Data : ${student} 
		ID : ${student.id}<br/>
		Name : ${student.name} 
	--%>

</body>
</html>