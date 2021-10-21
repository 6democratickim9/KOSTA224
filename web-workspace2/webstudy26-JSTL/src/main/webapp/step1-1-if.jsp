<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:if test="true">
jstl if 문 실행
</c:if>
<c:if test="false">
</c:if>
<a href="step1-2-if.jsp?userName=iu&userAge=30">check out in step1-2-if</a>
</body>
</html>