
<%@page import="model.PersonVO"%>
<%@page import="java.util.ArrayList"%>
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

	<%
	ArrayList<PersonVO> list = new ArrayList<PersonVO>();
	list.add(new PersonVO("IU", 30));
	list.add(new PersonVO("MINJU", 26));
	list.add(new PersonVO("SOLJI", 18));
	request.setAttribute("personList", list);
	%>
	<c:forEach items="${requestScopes.personList}" var="p" varStatus="order"></c:forEach>
${order.count}	name: ${p.name} 
	age:${p.age}
	<br>
	<br>
</body>
</html>