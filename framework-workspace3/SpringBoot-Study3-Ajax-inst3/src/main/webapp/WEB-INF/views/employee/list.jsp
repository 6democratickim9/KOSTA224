<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>사원리스트</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container pt-3">
		<div class="row">
			<div class="col-sm-4 offset-sm-4">
				<select id="deptNo">
					<option value="0">-부서-</option>
					<c:forEach items="${deptList}" var="dept">
					<option value="${dept.deptNo}">${dept.dname}</option>
					</c:forEach>
				</select>
				<button type="button" id="searchEmpDeptListBtn">검색</button>
			</div>
		</div>
		<div class="row pt-4">
			<div class="col-sm-4 offset-sm-4">
				<table class="table table-bordered">
					<thead>
						<tr>
							<th>사원번호</th>
							<th>사원명</th>
							<th>부서명</th>
							<th>근무지</th>
						</tr>
					</thead>
					<tbody id="empList">
					</tbody>
				</table>
			</div><%-- table div --%>
		</div><%-- row --%>
	</div><%-- container --%>
</body>
</html>









