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
	//세션을 무효화 처리
	session.invalidate();
%>세션을 무효화 처리<%=session.getAttribute("mvo") %>
<br><br>
	<a href="sesssion-test1.jsp">session1 에서 확인</a><br>
	<a href="sesssion-test2.jsp">session2 에서 확인</a><br>

</body>
</html>