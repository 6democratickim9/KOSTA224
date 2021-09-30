<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- html 주석 -->
	<%--jsp 주석: client측에 전달되지 않음 --%>
	jsp 기본
	<br>
	<br>
	<%
	//아래 코드는 service 메서드 내에 삽입됨
	for (int i =0; i<10; i++){
	%>
	<font color = "green" size="5"><%=i+1 %>.가을 전어회</font><br>
	<%
	}
	%>
	<br><br>
	<%--인스턴스 변수 선언 --%>
	<%!
		private int count;
	%>
	접속수<%=count++ %>
	
</body>
</html>