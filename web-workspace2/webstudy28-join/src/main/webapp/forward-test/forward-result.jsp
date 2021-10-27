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
${param.age}
<c:choose>
<c:when test="${param.age>=19}">
	${param.age}세 성인입니다
	</c:when>
	<c:otherwise>
		<jsp:forward page="forward-result-child.jsp"/>
	</c:otherwise>

</c:choose>
</body>
</html>