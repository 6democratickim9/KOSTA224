<%@page import="model.FoodVO"%>
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
	//assume this is shared in controller
	FoodVO vo = new FoodVO("salad", 5000);
	//save in request
	request.setAttribute("fvo", vo);
	//save in session
	session.setAttribute("food", new FoodVO("pasta", 14000));
	// assign the information to the same-named request and the session
	request.setAttribute("test", new FoodVO("mac-n-cheese", 2000));
	session.setAttribute("test", new FoodVO("Lobster", 12000));
	%>
	1. Expression in the old way:<br>
	<%
	FoodVO fvo = (FoodVO) request.getAttribute("fvo");
	FoodVO fvo2 = (FoodVO) session.getAttribute("food");
	%>
	<%=fvo.getName()%><br>
	<%=fvo.getPrice()%><br>
	<%=fvo2.getName()%><br>
	<%=fvo2.getPrice()%><br>
	2. Expression in EL: ${fvo.name} ${fvo.price} ${requestScope.fvo.name}
	${requestScope.fvo.price} ${food.name} ${food.price} ${sessionScope.food.name} ${sessionScope.food.price }
	<br><br>
	confirm the information of the same-named in request and session in EL: 
<%-- 아래와 같이 별도의 Scope를 명시하지 않으면 request 영역에 있는 정보를 반환 
request < session < application(ServletContext)  
--%>
	${test.name} ${test.price }
	<%-- session 의 test 정보를 얻으려면 Scope를 명시한다  --%>
	${sessionScope.test.name} ${sessionScope.test.price} 

</body>
</html>