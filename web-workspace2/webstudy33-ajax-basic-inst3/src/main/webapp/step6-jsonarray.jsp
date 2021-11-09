<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ajax(JSON을 이용하여 통신)</title>
<script type="text/javascript">
	function startAjax() {
	
		let xhr=new XMLHttpRequest();
		xhr.onload=function(){
			//alert(xhr.responseText);
			//응답정보를 json object 로 변환한다 
			let json=JSON.parse(xhr.responseText);
			//JSONArray로 서버가 응답했으므로 아래와 같이 루프가 가능
			for(let i=0;i<json.length;i++){
				alert(json[i]);
			}
		}
		xhr.open("get","JSONArrayServlet");
		xhr.send();
	}
</script>
</head>
<body>
<button onclick="startAjax()">JSONArrayTest</button>
</body>
</html>










