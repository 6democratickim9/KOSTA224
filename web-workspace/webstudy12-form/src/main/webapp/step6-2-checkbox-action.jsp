<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/home.css">

</head>
<body>
	<%
	String ma[] = request.getParameterValues("menu");//String 형태로 되어있는 ma[]
	%>

	<table>
		<thead>
			<tr>
				<th>No</th>
				<th>Menu</th>
			</tr>
		</thead>
		<tbody>
			<%
			for (int i = 0; i < ma.length; i++) {
			%>
			<tr>
				<td><%=i + 1%></td>
				<td><%=ma[i]%></td>
			</tr>
			<%
			}
			%>
		</tbody>
	</table>
</body>
</html>