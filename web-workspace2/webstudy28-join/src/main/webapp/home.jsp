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
<h3>Model2MVC 사원관리</h3>
현재 총 사원수 ${requestScope.empTotalCount }명
<jsp:forward page="EmployeeListController.do"/>사원명단보기
</body>
</html>