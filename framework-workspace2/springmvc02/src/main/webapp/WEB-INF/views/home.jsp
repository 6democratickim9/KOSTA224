<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="registerCustomer.do" method="post">
<input type="text" name="id" placeholder="아이디" required="required"><br>
<input type="text" name="name" placeholder="이름" required="required"><br>
<input type="text" name="address" placeholder="주소" required="required"><br>
<button>등록</button> 
</form>
<%--
	post 요청방식만 고객등록되게 하고 등록성공시에는 redirect 방식으로 응답
	중복되어 등록 안될 때는 forward 방식으로 응답
	
	CustomerController
	|	registerCustomer() : 중복확인은 mapper.findCustomerById()를 이용
	|	
	register-success.jsp or duplicate-id.jsp(아이디가 중복될 경우)
 --%>
</body>
</html>