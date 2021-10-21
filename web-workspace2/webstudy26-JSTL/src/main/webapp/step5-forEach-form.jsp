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
	function checkForm(){
		let ma = document.getElementByName("menu");
		let flag = false;
		for(let i=0;i<ma.length;i++){
			if(ma[i].checked)
				flag=true;
				break;
		}
	
	if(flag==false){
		alert("choose the menu");
		return false;
	}
	}
}
</script>
	<form action="step5-forEach-result.jsp" onsubmit="return checkForm()">
		<input type="checkbox" name="menu" value="pizza">pizza<br>
		<input type="checkbox" name="menu" value="chicken">chicken<br>
		<input type="checkbox" name="menu" value="salad">salad<br>
		<button>order</button>
	</form>
</body>
</html>