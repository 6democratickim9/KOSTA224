<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp 와 html form 연동테스트</title>
</head>
<body>
<form action="step1-2-form-action.jsp">
<input type="text" name="userId" placeholder="id" required="required">
<input type="text" name="userName" placeholder="name" required="required">
<input type="submit" value="submit" >
</form>
</body>
</html>