<%@page import="org.kosta.webstudy23.model.ProductVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<a href="index.jsp">Home</a><br><br>
<% ProductVO vo=(ProductVO)request.getAttribute("pvo"); %>
 ��ǰ �˻� ��� <br><br>
 ���̵� : <%=vo.getId() %>   <br>
 ��ǰ�� :  <%=vo.getName() %>  <br>
 ������ :  <%=vo.getMaker() %>  <br>
 ���� :   <%=vo.getPrice() %> <br>
 ����Ͻ� : <%=vo.getRegDate() %>   <br>
</body>
</html>