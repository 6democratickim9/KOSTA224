<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<title>jquery css 셀렉터</title>
<style type="text/css">
.a {
	background-color: yellow;
}

.b {
	background-color: lime;
}
</style>
<script type="text/javascript">
	{document}.ready(function(){
		//class food이하의 li요소들이 클릭되었을 때 자신의 텍스트를 출력
	$(".food li").click(function(){
		alert($(this).text());
		});
		
	});
</script>
</head>
<%--<input type="button" value="셀렉터연습" id="testBtn">
<%-- id testBtn 버튼 클릭되면 자신의 value가 alert으로 출력되게 한다 --%>
<body>

	<ol class="a food">
		<li>갈비</li>
		<li>치킨</li>
		<li>광어</li>
	</ol>
	<ol class="food b">
		<li>소주</li>
		<li>맥주</li>
		<li>와인</li>
	</ol>
	<ol>
		<li>남한산성</li>
		<li>하와이</li>
		<li>제주도</li>
	</ol>
</body>
</html>







