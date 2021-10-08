<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h3>Model2 MVC 회원관리</h3>
		<a href="index.jsp">Home</a>
		<script type="text/javascript">
			function checkRegForm() {
				if (document.getElementById("password") != document
						.getElementById("confirmpassword")) {
					alert("password doesnt match with confirmpassword");
				}
			}
		</script>
		<form action="RegisterMemberServlet" method="post"
			onsubmit="return checkRegForm()">
			<input type="text" name="id" required="required" placeholder="id"><br>
			<input type="password" name="password" id="password" required="required" placeholder="password"><br>
		    <input type="text" name="confirmPassword" id="confirmpassword" required="required" placeholder="confirmpassword"><br>
			<input type="text" name="name" required="required" placeholder="name"><br>
			<input type="text" name="address" required="required"
				placeholder="address"><br>
			<button type="submit">sign up</button>
		</form>
	</div>
</body>
</html>
