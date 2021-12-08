<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>step27-ajax-json</title>
<script type="text/javascript">
	$(function() {
		$("#jsonObjBtn").click(function() {
			$.ajax({
				type:"get",
				url:"JSONServlet",
				dataType:"json",
				data:"command=getMemberInfo",
				success:function(result){
					alert(result.name+" "+result.age);
				}
			});//ajax
		});//click
		$("#jsonArrayBtn").click(function() {
			$.ajax({
				type:"get",
				dataType:"json",
				url:"JSONServlet",
				data:"command=getMemberList",
				success:function(result){
					for(let i=0;i<result.length;i++){
						alert(result[i]);
					}
				}
			});
		});
	});//ready
</script>
</head>
<body>
	<div class="container">
		<button type="button" id="jsonObjBtn">JSONObject 테스트</button>
		<br>
		<button type="button" id="jsonArrayBtn">JSONArray 테스트</button>
		<br>
	</div>
</body>
</html>








