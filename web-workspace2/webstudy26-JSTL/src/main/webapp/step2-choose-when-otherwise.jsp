<%@page import="model.PersonVO" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
request.setAttribute("pvo", new PersonVO("IU", 30));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	jstl 다중조건
	<c:choose>
		<c:when test="${requestScope.pvo.name=='IU'}">
		IU is ${requestScope.pvo.age } y.o
	</c:when>
		<c:when test="${requestScope.pvo.name='SON' }">
		SON ${pvo.age}
	</c:when>
		<c:otherwise>
		Not applicable
		</c:otherwise>
	</c:choose>
</body>
</html>