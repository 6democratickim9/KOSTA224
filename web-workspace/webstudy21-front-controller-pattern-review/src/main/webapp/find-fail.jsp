<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript">
alert("Sorry, we have nothing found for your search <%=request.getParameter("productId")%>");
location.href="index.jsp"

</script>
</body>
</html>