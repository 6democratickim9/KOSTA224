<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/home.css">
</head>
<body>
<div class="container">
<h3>Model2 MVC Member management</h3>
<%--1. search member by id --%>
<form action="FindMemberByIdServlet">
<input type="text" name="memberId" required="required" placeholder="id">
<button type="submit"></button>

</form>

</div>
</body>
</html>