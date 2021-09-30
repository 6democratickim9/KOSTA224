<%@ page import="model.FoodVO"%>
<%@ page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
ArrayList<FoodVO> food = new ArrayList<FoodVO>();
food.add(new FoodVO("New England Clam Chowder", "Campbell", 5360));
food.add(new FoodVO("Tomato Soup", "Campbell", 4000));
food.add(new FoodVO("Beef Soup", "Ottogi", 5000));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/home.css">
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>name</th>
				<th>maker</th>
				<th>price</th>
			<tr>
		</thead>
		<tbody>

			<%
			for (int i = 0; i < food.size(); i++) {
			%>
			<tr>
				<td><%=food.get(i).getName() %></td>
				<td><%=food.get(i).getMaker()%></td>
				<td><%=food.get(i).getPrice() %></td>
			</tr>
			<%
			}
			%>
		</tbody>
	</table>
</body>
</html>