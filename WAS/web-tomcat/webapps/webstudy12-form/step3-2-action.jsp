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
//post요청 메서드일때는 별도의 한글 처리가 필요
request.setCharacterEncoding("UTF-8");
String name= request.getParameter("userName");
int age = Integer.parseInt(request.getParameter("userAge"));
%>


	<% if(age>19) {
%>
	성인
	<br> name:<%=name %><br> 
	age:<%=age  %><br>
	<%}%>
	<%
	if(age<19){
	
%>
	미성년<br>
	name:<%=name %><br> 
	age:<%=age  %>

	<% }%>
</body>
</html>