<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container pt-4" >
	<a href="index.jsp">Home</a>
	<br>
	<table class="table table-bordered">
		<thead>
			<tr>
				<th>product name</th>
				<th>maker</th>
				<th>Registration date</th>
			</tr>
		</thead>
	</table>
	
	<tbody>
	<%
		for(int i =0;i<list.size();i++){
		
	%>
	<tr><td><%=list.get(i).getName() %></td>
	<tr><td><%=list.get(i).getMaker() %></td>
	<tr><td><%=list.get(i).getRegDate() %></td>
	</tr>
	<%
		}
	%>
	
	
	</tbody>
	</div>
</body>
</html>