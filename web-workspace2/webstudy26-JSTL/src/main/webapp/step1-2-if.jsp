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
user name : ${param.userName}<br>
user age :${param.userAge} y.o <br>
<%--print "adult" if age is over 20 y.o --%>
 <c:if test="${param.userAge>=20 }">
 	Adult
 </c:if>
<br>
<c:if test="${param.userName=='iu' && param.userAge>=20}">
</c:if>
</body>
</html>