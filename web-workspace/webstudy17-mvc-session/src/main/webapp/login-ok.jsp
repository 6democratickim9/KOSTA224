<%@ page import="model.MemberVO" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%MemberVO vo =(MemberVO) session.getAttribute("mvo");%>
Welcome, <%=vo.getName() %>
</body>
</html>