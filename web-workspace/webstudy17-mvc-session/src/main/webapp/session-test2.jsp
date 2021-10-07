<%@ page import="model.MemberVO" %>
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
	//session-test1에서 session 에 저장한 회원 객체가 존재하는 지 확인해서 존재하면 회원 이름을 보여주고
	//존재하지 않으면 현 세션에서는 회원정보가 존재하지 않습니다 라고 메세지를 보여줌
	MemberVO vo = (MemberVO)session.getAttribute("mvo");
	if(vo!=null){
%>
	세션에 저장된 회원이름:<%=vo.getName() %> 님
<%
	}else{
%>
	현 세션에서는 회원정보가 존재하지 않습니다
<%
	}
%>
	<br><br>
	<a href="session-test1.jsp">session1 에서 확인</a><br>
	<a href="session-test3.jsp">session3 에서 확인</a><br>
</body>
</html>