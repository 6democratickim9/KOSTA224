<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
	function checkAge() {

	}
</script>
<body>


	<%
	request.setCharacterEncoding("UTF-8");
	String name = request.getParameter("userName");
	int age = Integer.parseInt(request.getParameter("userAge"));
	if(age>=19){
	%>

	<%= name %>, have a good time!
	<%
} else{
	%>
	<script type="text/javascript">
		alert("<%=name%>, you are not allowed to watch this movie.");
		location.href="step7-3-child.jsp?name=<%=name%>";
	</script>
	<%
}
%>

</body>
</html>