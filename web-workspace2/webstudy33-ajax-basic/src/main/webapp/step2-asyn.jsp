<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<script type="text/javascript">
		let hxr;
		function startAjax(){
			xhr=new XMLHttpRequest();//Ajax 통신을 위한 자바스크립트 객체
			//alert(xhr);
			//callback 함수를 등록: ajax 요청에 대해 서버가 응답하면 실행될 함수
			xhr.onreadystatechange=callback;
			xhr.open("get","AsynServlet");
			xhr.send();
		}
		function callback(){
			if(xhr.readyState==4&&xhr.status==200){
				document.getElementById("resultView").innerHTML=xhr.responseText;
			}
		}
	</script>
	<form>
		<input type="text" name="userInfo">
		<button type="button" onclick="startAjax()">동기방식테스트</button>
		<span id="resultview"></span>
	</form>
	<hr>
	<textarea rows="50" cols="50"></textarea>
</body>
</html>