
<%@page import="model.PersonVO"%>
<%@page import="java.util.LinkedHashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
LinkedHashMap<String, PersonVO> map = new LinkedHashMap<String, PersonVO>();
map.put("a", new PersonVO("IU", 30));
map.put("b", new PersonVO("MINJU", 30));
map.put("c", new PersonVO("SON", 30));
session.setAttribute("personMap", map);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	@SuppressWarnings("unchecked")
	LinkedHashMap<String, PersonVO> rMap = (LinkedHashMap<String, PersonVO>) session.getAttribute("personMap");
	Set<String> set = rMap.keySet();
	Iterator<String> it = set.iterator();
	while (it.hasNext()) {
	%>
	String key = it.next(); key:
	<%=key%>
	value:<%=rMap.get(key).getName()%>
	<%
	}
	%>
</body>
</html>