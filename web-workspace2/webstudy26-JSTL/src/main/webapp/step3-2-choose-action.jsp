<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${param.name} , you are over  
		<c:choose>
			<c:when test="${param.age>=19}">
${param.age} years old adult.
</c:when>
			<c:when test="${param.age>=13}">
 ${param.age} years old adolescent.
</c:when>
			<c:when test="${param.age<13}">
${param.age} years old kid.
</c:when>
		</c:choose>

</body>
</html>