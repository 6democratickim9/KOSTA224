<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<title>jquery 기본</title>
<script type="text/javascript">
	/*
		window load 와 jquery document ready 의 차이점 
		-> window load 는 img , 동영상과 같은 요소들이 모두 load 된 후에 호출 
		-> document ready 는 DOM 이 load 되는 시점에 호출 
		  ( 이미지나 동영상 같은 자원들이 로드되지 않아도  document 객체가 준비되면 실행)
		  jquery document ready 가 되는 시점에 익명함수 내에 현 페이지에서 동작될 이벤트에 대한 동작을 바인딩(등록)
	*/

	$(document).ready(function(){
		$("a").click(function(){
			alert("링크 클릭했네용");
		});
	});
</script>
</head>
<body>
jQuery Basic
<ul>
	<li><a href="#">test1</a></li>
	<li><a href="#">test2</a></li>
	<li><a href="#">test3</a></li>
</ul>
<span>클릭해봐1</span><br>
<span>클릭해봐2</span>
</body>
</html>







