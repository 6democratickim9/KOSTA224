<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Web MVC , FrontController</title>
</head>
<body>
<h3>Model 2 Architecture MVC, Singleton , Front Controller Design Pattern</h3>
<%--
		index.jsp --- FrontControllerServlet --- FindCustomerByIdController --- DAO --- DB 
							|
							findbyid-ok.jsp
							or
							findbyid-fail.jsp

 --%>

<form action="FrontControllerServlet" method="get">
<input type="hidden" name="command" value="FindCustomerByIdController">
<input type="text" name="id" placeholder="고객아이디" required="required">
<button type="submit">검색</button>
</form>
<br><br>
<form action="FrontControllerServlet" method="post">
<input type="hidden" name="command" value="RegisterCustomerController">
<input type="text" name="customerInfo" placeholder="고객정보" required="required">
<input type="date" id="birthday" name="birthday" placeholder="birthday">
<button type="submit">등록</button>
</form>
<br><br>
<form action="FrontControllerServlet" method="post">
<input type="hidden" name="command" value="UpdateCustomerController">
<input type="text" name="customerInfo" placeholder="고객정보" required="required">
<button type="submit">수정</button>
</form>
<br><br>
<form action="FrontControllerServlet" method="post">
<input type="hidden" name="command" value="DeleteCustomerController">
<input type="text" name="customerId" placeholder="고객아이디" required="required">
<button type="submit">삭제</button>
</form>
<br><br><br>

<form action="LoginServlet" method="post">
<input type="text" name="memberId" placeholder="아이디" required="required">	<br>
<input type="password" name="memberPass" placeholder="패스워드" required="required"><br>
<input type="submit" value="로그인">

<img src="image/frontcontroller.png">
</body>
</html>
