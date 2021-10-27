<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
<a href="HomeController.do">Home</a>
     ${requestScope.empList}
  <table class="table table-bordered" >
    <thead>
      <tr>
        <th>사번</th>
        <th>사원명</th>
        <th>월급</th>
        <th>부서명</th>
        <th>근무지</th>
      </tr>
    </thead>
    <tbody>
    
<c:forEach items="${requestScope.empList}" var="employee" >
<tr>
<td>${employee.empno }</td>
<td>${employee.ename}</td>
<td>${employee.sal }</td>
<td>${employee.departmentVO.dname }</td>
<td>${employee.departmentVO.loc }</td>
</tr>
</c:forEach>
      
    </tbody>
  </table>
</div>

</body>
</html>