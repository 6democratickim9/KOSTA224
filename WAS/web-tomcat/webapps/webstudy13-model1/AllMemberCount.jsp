<%@page import="model.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	MemberDAO dao=new MemberDAO();
	int count=dao.getTotalCount();//MemberDAO 에 들어가서 getTotalCount()의 count 값을 받아온다
%>
<h4>Number of Members: <%=count %></h4>
</body>
</html>