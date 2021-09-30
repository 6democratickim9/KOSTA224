<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.ArrayList"%>

<%
	ArrayList <String> list= new ArrayList<String>();
	list.add("김치찌개");
	list.add("큐브스테이크");
	list.add("감자찜");
	list.add("생선찜");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp table practice</title>
<style type="text/css">
table {
	borader-collapse: collapse;
}

table, td {
	border: 1px solid black;
}

td {padding 10px;
	width: 100px;
	text-align: center;
}
</style>
</head>
<body>
	<table border="1">
		<%
	for(int i =0; i<list.size(); i++){
%>
		<tr>
			<td><%=i %></td>
			<td><%=list.get(i) %></td>

		</tr>
<%} %>



	</table>
</body>
</html>