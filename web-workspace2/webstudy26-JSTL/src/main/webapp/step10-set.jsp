<%@page import="model.CarVO"%>
<%@page import="model.PersonVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	PersonVO pvo = new PersonVO("IU", 30, new CarVO("1223", "k5", 2000));
	request.setAttribute("personVO", pvo);
	%>
	EL로 PersonVO와 CarVO에 접근해서 출력 : ${requestScope.personVO.name} ${requestScope.personVO.carVO.model }
	
	<%--set 을 이용해 personVO를 변숭 저장해 간단하게 사용할 수있음 --%>
	<c:set value="${requestScope.personVO }" var="p"></c:set>
	<br><br>
	${p.age }${p.carVO.price }
	<c:set value="${requestScope.personVO.CarVO }" var="c"></c:set>
	<br><br>
	${c.model }${c.price }

</body>
</html>