<%@ page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	ArrayList<String> list = new ArrayList<String>();
	list.add("마라탕");
	list.add("라면");
	list.add("카레");
	%>
	<script type="text/javascript">
	function checkMenu(){
		let flag=false;
		let m = document.getElementsByName("checkbox");
		for(let i=0;i<m.length;i++)
		if(m[i].checked){
			flag=true;
			break;
		}
	}
	if(flag==false){
		alert("choose the menu");
		return false;
	}	
}
	
</script>
	<form action="step6-2-checkbox-action.jsp" method="get">
		<%
		for (int i = 0; i < list.size(); i++) {
		%>
		<input type="checkbox" name="menu" value="<%=list.get(i)%>"><%=list.get(i)%><br>
		<%
		}
		%>
		<input type="checkbox" name="menu"><br> <input
			type="submit" name="order"><br>

	<input type="submit" value="order">
	</form>
</body>
</html>