<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원관리</title>
</head>
<body>
<%--
			index.jsp -- FrontControllerServlet --HandlerMapping-- FindMemberByIdController -- MemberDAO -- DataSourceManager -- DB 
								|
								findbyid-ok.jsp
								or
								findbyid-fail.jsp
 --%>
 <form action="FindMemberByIdController.do">
 <input type="text" name="id" placeholder="아이디" required="required">
 <button>검색</button>
 </form>
</body>
</html>
























