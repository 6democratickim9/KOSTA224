<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="false"%><%--session="false" 로 설정해 세션을 자동 생성하지 않도록 설정 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
세션을 자동 생성하지 않도록 설정
<%
	HttpSession session = request.getSession();
	%>
<%=session.getId() %>
</body>
</html>