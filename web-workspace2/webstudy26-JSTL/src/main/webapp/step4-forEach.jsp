<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String friends[] = { "이강인", "손흥민", "황의조" };
	request.setAttribute("fa", friends);
	%>
	<c:forEach items="${requestScope.fa}" var="f" varStatus="order">${f}, index: ${order.index }, count : ${order.count }<br>
		<br>
	</c:forEach>
</body>
</html>