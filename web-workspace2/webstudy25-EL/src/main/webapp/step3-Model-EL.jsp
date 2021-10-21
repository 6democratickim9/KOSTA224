<%@page import="model.TestVO" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	TestVO tvo = new TestVO();
	request.setAttribute("testVO", tvo);
	%>
	${requestScope.testVO}<br>
	${requestScope.testVO.name}<br>
	${requestScope.testVO.info}<br>
	${requestScope.testVO.exist}<br>
	${requestScope.testVO.id}<br>
	
	<%-- name을 썼을때는 getName이 실행됨
	TestVO의 getName() 메서드가 실행되어 반환된 값이 출력
		${requestScope.testVO.info}<br>
	얜 안됨...ㅡㅡ
	error: TestVO의 findInfo() 메서드이므로 접근불가
	${requestScope.testVO.exist} 얜 됨
	boolean 형을 제외하면 다 get으로 설정해둬야함
	
		${requestScope.testVO.id}<br>
	GETTER 있으면 가능
	 --%>
</body>
</html>