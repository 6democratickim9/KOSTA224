<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<title>jquery basic</title>


</head>
<body>

	<script type="text/javascript">
		//이 ㅣ시점에서는 testSpan id의 span이 로드되어 있지 않기 때문에 null	
		alert(document.getElementById("testSpan"));
	</script>
	<script type="text/javascript">
		//document가 ready가 되는 시점에 넣어줘야 함 -> 얘도 object 출력됨
		alert(document.getElementById("testSpan"));
	</script>

	<span id="testSpan">즐공</span>
	<script type="text/javascript">
	//이 ㅣ시점에서는 testSpan id의 span이 로드되어 있기 때문에 object 출력
		alert(document.getElementById("testSpan"));
	</script>
</body>
</html>










