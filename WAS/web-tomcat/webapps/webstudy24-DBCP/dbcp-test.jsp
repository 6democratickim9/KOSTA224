<%@page import="java.sql.*,javax.sql.*,model.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	1. connection method that creates existing DB connection and destroys:
	<%
String url = "jdbc:oracle:thin@127.0.0.1:1521:xe";
Connection con = DriverManager.getConnection(url, "scott", "tiger");
%>
	<%=con.getClass()%>
	<%
	con.close();//destroy the connection
	%>
	<br>
	<br> 2. connection method that uses DBCP to borrow connection and
	return :
	<%
	DataSource ds=DataSourceManager.getInstance().getDataSource();
	//take the connection from dbcp
	Connection dbcpCon = ds.getConnection();
	%>
	<%=dbcpCon.getClass()%>
	<%
	//return the connection to the dbcp
	dbcpCon.close();
	%>
</body>
</html>