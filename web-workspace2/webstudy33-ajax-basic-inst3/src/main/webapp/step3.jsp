<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>step3 ajax</title>
</head>
<body>
<script type="text/javascript">
	function startAjax(){
		let memberId=document.getElementById("id").value;
		if(memberId==""){
			alert("아이디를 입력하세요!");
			return; //함수실행종료
		}
		let xhr=new XMLHttpRequest();
		//alert(xhr);
		//서버가 응답하면 동작할 콜백함수를 익명함수 스타일로 등록해본다 
		/*
		xhr.onreadystatechange=function(){
			if(xhr.readyState==4&&xhr.status==200){//readyState 4는 응답완료 , status 200은 정상수행  
					alert(xhr.responseText);	
			}
		} 
		*/
		//위 콜백함수코드를 onload 를 이용해 표현 
		// onload 는 readyState가 4 이고 status 가 200 일 때 동작하는 이벤트 
		xhr.onload=function(){
			alert(xhr.responseText);
		}
		//open 은 ajax 통신에 필요한 정보를 할당 
		//get 방식일때는 url 뒤에 쿼리스트링으로 data를 전달 , post방식일때는 send 함수의 매개변수 인자값으로 데이터 전달 
		xhr.open("get", "AjaxMemberServlet?memberId="+memberId);
		//send 는 ajax 통신을 시작 
		xhr.send();
	}
</script>
<input type="text" id="id"  placeholder="아이디"><button type="button" onclick="startAjax()">회원조회</button>
</body>
</html>














