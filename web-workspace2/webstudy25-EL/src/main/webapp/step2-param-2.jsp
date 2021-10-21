<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
1. receive the parameter in a old way :  <%=request.getParameter("command")%>
<%=request.getParameter("name") %>
<br><br>
2. receive the parameter in EL : ${param.command} ${param.name}
</body>
</html>