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
session id: <%=session.getId() %>
<%-- 같은 원리로 ServletConfig와 ServletContext객체도 config 와 application 변수로 사용할 수 있다 --%>
<br><br>
ServletConfig: <%=config %>
<br><br>
ServletContext: <%=application %>
<br><br>


<%-- session에 회원객체를 할당해본다 --%>
<%
	MemberVO vo = new  MemberVO("javaking",null,"iu","ori");
	session.setAttribute("mvo",vo);
%>
<a href="session-test2.jsp"> check on session2</a>
</body>
</html>