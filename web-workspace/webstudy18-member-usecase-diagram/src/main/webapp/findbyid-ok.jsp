<%@ page import="org.kosta.webstudy18.model.*" %>
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
		<h3>Find Result</h3>
		<% MemberVO vo = (MemberVO)request.getAttribute("memberVO"); %>
		<table>
			<thead>
				<tr>
					<th>id</th>
					<th>name</th>
					<th>address</th>
				</tr>
			</thead>
			<tr>
					<th><%=vo.getId() %></th>
					<th><%=vo.getName() %></th>
					<th><%=vo.getAddress() %></th>
				</tr>
		</table>
	</div>
</html>