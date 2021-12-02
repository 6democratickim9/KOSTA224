<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>springmvc01</title>
</head>
<body>
	<h3>${message}</h3>
	<br>
	<br> spring controller test
	<br>
	<br>
	<%--
	index.jsp -- hello.do -- MyTestController의 hello()
								|
								WEB-INF/views/result1.jsp로 응답
 --%>
	<a href="hello.do">Hello Test</a>
	<br>
	<a href="hi.do">Hi Test</a>
	<br>
	<br>
	<form action="paramTest1.do">
		고객아이디 <input type="text" name="customerId" required="required">
		<button type="submit">검색</button>
	</form>
	<br>
	<br>
	<form action="paramTest2.do">
		<input type="text" name="userName" placeholder="고객이름"
			required="required"> <input type="text" name="userAddress"
			placeholder="주소" required="required">
		<button type="submit">전송</button>
	</form>
	<br>
	<br>

	<form action="paramTest3.do">
		<input type="checkbox" name="hobby" value="영화">영화<br> <input
			type="checkbox" name="hobby" value="독서">독서<br> <input
			type="checkbox" name="hobby" value="게임">게임<br>
		<button>전송</button>
	</form>

	<form action="methodTest1.do" method="post">
		<button>post방식요청</button>
	</form>
	<form action="methodTest2.do" method="post"> 
		<button>get방식요청</button>
	</form>
	<form action="methodTest2.do">
		<button>get방식요청</button>
	</form>

	<img src="springmvc.jpg">
</body>
</html>
