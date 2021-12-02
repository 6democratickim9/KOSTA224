<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
아이템수 ${totalItemCount}
<br><br>
<form action="findItemByNo.do">
<input type="number" name="itemNo" placeholder="아이템번호" required="required">
<button>검색</button>
</form>


</body>
</html>