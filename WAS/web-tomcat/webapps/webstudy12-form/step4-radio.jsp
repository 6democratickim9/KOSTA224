<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
ArrayList<String> list = new ArrayList<String>();
list.add("김치찌게");
list.add("큐브스테이크");
list.add("감자찜");
list.add("생선찜");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="step4-radio-action.jsp" method="post">
		<%
		for (int i = 0; i < list.size(); i++) {
		%>
		<input type="radio" name="menu" value="<%=list.get(i)%>" required="required"><%=list.get(i)%><br>
		<%} %>
		<input type="submit" name="submit">
	</form>
</body>
</html>