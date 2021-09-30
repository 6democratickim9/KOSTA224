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
int line = Integer.parseInt(request.getParameter("line"));
String name=null;
if(line<5)
	name="korail";
else
	name="citytrail";

%>
<%=name %>line <%=line %> choosed

</body>
</html>