<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<c:set var="string" value="Kansara Aditya"/>	
	String : ${string}<br>
	Length : ${fn:length(string)}

	<c:forEach items="${fn:split(string ,' ')}" var="s">
		<br>
		${s}
	</c:forEach>
	
	index : ${fn:indexOf(string ,"Adi")}
	
	is there : ${fn:contains(string , "Kan")}
	
	<c:if test="${fn:contains(string,'Ad')}">
		Yes/NO
	</c:if> 
	
	${fn:toLowerCase(string)}
	${fn:toUpperCase(string)}
	
	
</body>
</html>