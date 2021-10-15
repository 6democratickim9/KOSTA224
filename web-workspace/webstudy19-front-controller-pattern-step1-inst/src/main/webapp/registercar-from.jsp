<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="FrontController Serlvet" method="post">
	<input type="hidden" name="command" value="registerCar">
		<input type="text" name="carInfo" placeholder="information" required="required">
		<button type="submit">register</button>
	</form>
</body>
</html>