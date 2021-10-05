<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="step5-2-select-action.jsp">
	<select name="line" required="required">
	<option value="">- line - </option>
	<%
	for(int i =1;i<=9;i++){
	%>
	<option value="<%=i%>">line <%=i %></option>
	<%
	}%>
	</select>
	<button type="submit"> choose</button>
</form>
</body>
</html>