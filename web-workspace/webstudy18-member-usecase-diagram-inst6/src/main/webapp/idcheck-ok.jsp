<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
//the hidden tag will be assigned to this pop-upped window
opener.document.getElementById("flag").value="<%=request.getParameter("id")%>";
function closePopup(){
	opener.document.getElementById("pass").focus();
	self.close();
}

</script>
</head>
<body bgcolor="">

</body>
</html>