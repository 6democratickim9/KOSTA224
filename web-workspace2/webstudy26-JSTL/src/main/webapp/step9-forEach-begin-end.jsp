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
	<%-- <c:forEach begin="1" end="10" var="page">
${page } &nbsp; &nbsp;</c:forEach><br><br>--%>${page } &nbsp; &nbsp;
	<%
	request.setAttribute("startPage", 11);
	request.setAttribute("endPage", 15);
	request.setAttribute("nowPage", 13);
	%>

	print pages from startPage to endPage
	<c:forEach begin="${requestScope.startPage }"
		end="${requestScope.endPage }" var="page">
		<c:choose>
			<c:when test="${page==requestScope.nowPage}">
				${page } &nbsp; &nbsp;
			</c:when>
			<c:otherwise>
				<a href="">${page }</a>&nbsp;&nbsp;
			</c:otherwise>
		</c:choose>
</c:forEach>

</body>
</html>