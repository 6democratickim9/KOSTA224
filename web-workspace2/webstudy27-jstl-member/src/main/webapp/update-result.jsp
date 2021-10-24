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
수정이 완료되었습니다
아이디: ${sessionScope.mvo.id }<br>
패스워드: ${sessionScope.mvo.password }<br>
name: ${sessionScope.mvo.name }
address: ${sessionScope.mvo.address }
birth: ${sessionScope.mvo.birthday }
</body>
</html>