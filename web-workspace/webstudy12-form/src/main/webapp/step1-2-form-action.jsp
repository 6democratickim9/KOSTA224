<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp 와 html form 연동테스트</title>
</head>
<body>
your id:<%=request.getParameter("userId") %><br><br>

your name:<%=request.getParameter("userName") %>

</body>
</html>