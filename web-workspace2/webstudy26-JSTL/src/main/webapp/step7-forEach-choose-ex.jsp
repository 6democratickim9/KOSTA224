
<%@page import="model.PersonVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <title>Bootstrap Example</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
<%
	ArrayList<PersonVO> list = new ArrayList<PersonVO>();
	list.add(new PersonVO("IU", 30));
	list.add(new PersonVO("MINJU", 26));
	list.add(new PersonVO("SOLJI", 18));
	request.setAttribute("personList", list);
	%>
<div class="container">
  <h2>JSTL forEach choose</h2>
  <table class="table table-bordered table-hover">
    <thead>
      <tr>
        <th>연령대</th>
        <th>이름</th>
        <th>나이</th>
      </tr>
    </thead>
    <tbody>
				<c:forEach items="${requestScope.personList}" var="p">
					<tr>

						<c:choose>
							<c:when test="${p.age >19}">
								<td>성인</td>
					</c:when>
					<c:when test="${p.age<=19 }">
						<td>미성년</td>
					</c:when>
					</c:choose>
					<td>${p.name}</td>
					<td>${p.age}</td>
					</tr>
				</c:forEach>
				</tr>
    </tbody>
  </table>
</div>

</body>
</html>
