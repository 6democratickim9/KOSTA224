<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>.do test</title>
</head>
<body>
<h3>클라이언트 요청 방긷 *.do</h3>
<%--
	요청 url이 .do로 마치는것은 모두 FrontControllerServlet이 처리하도록 설정하여 테스트 해본다
	현 페이지에서 요청해보고 서버 상의 콘솔에서 결과를 확인한다
 --%>
<a href="FrontController.do">조회</a><br><br>
<form action="RegisterController.do" method="post">
<button type="submit">submit</button>
</form>
</body>
</html>