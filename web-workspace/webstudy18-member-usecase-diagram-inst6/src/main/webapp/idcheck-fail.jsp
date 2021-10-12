<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
opener.document.getElementById("flag").value="";
function closePopup(){
	let idComp=opener.document.getElementById("id");
	idComp.value="";
	idComp.focus();
	self.close();
}

</script>
</head>
<body>
<body bgcolor="orange">
<%=request.getParameter("id") %>id name is already exists.
</body>
</body>
</html>