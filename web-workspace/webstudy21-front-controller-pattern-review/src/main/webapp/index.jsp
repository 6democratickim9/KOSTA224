<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Model2MVC FrontController Pattern</title>
</head>
<body>
<h3>Model2 MVC FrontController Pattern Review</h3>
<form action="FrontControllerServlet">
<input type="hidden"name="command" value="FindProductByIdController">
<input type ="number" name = "productId" placeholder="productId" required="required">
<button type="submit"> search </button>
</form>
<br><br>
<%--아래와 같이 쿼리스트링 방식으로도 동작 가능 --%>
<a href="FrontControllerServlet?command=FindProductByIdController&productId=1">Search Product Testing</a>
<br><br>
<%--

 --%>
<form action="FrontControllerServlet" method="post">
<input type="hidden"name="command" value="RegisterProductController">
<input type ="text" name = "productInfo" placeholder="productInfo" required="required">
<button type="submit"> search </button>
</form>
<br><br>
<!-- 쿼리스트링은 get방식, controller는 post방식 -->
<a href="FrontControllerServlet?command=RegisterProductController&productInfo=Lays">Register Product Testing</a>

</body>
</html>