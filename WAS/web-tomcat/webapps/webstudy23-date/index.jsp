<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>db sql date 형 테스트</title>
</head>
<body>
	<%-- this form is for controller test 
	
		<form action="TestController.do">
		<button type="submit" method="post">submit</button>
	</form>
	<form action="FindProductByIdController.do">
<input type="number" name="productId" placeholder="product id" required="required">
<button type="submit">search</button>

</form>
	--%>
<form action="RegisterProductController.do" method="post"><br><br>
<input type="text" name="name" placeholder="product name" required="required"><br><br>
<input type="text" name="maker" placeholder="maker" required="required"><br><br>
<input type="text" name="price" placeholder="price" required="required"><br><br>
<button type="submit">submit</button><button type="reset">reset</button>
</form>
<br><br>
<a href="AllProductListController.do">Product List</a>
</form>
</body>
</html>