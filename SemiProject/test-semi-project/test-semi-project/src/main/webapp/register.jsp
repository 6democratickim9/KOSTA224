<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class = "container" style="margin-top: 100px">
	<div class = "row">
		<div class="col-sm-4 offset-sm-4">	
			<form action="RegisterMemberController.do" method="post" onsubmit="return checkRegForm()">
			<div class="input-group mb-3">
				<input type="text" class="form-control" name="id" id="id" required="required" placeholder="아이디">
				<input type="hidden" id="flag" value="">
				<div class="input-group-append">
					<button type="button" onclick="checkId()" class="btn btn-outline-primary"> 중복 확인 </button> 
				</div> <%-- input -group-append --%>
		 	</div> <%-- input group mb-3 --%>
		 	<div class="input-group mb-3"> 
				<input type="password" class="form-control" name="password" id="pass" required="required" placeholder="패스워드" maxlength="100" onkeyup="return passwordChanged();">
				<div class="input-group-append">
					<span id="strength" class = "input-group-text">패스워드 강도</span>
				</div>
			</div> <%-- input group mb-3 --%> 
			<div class="input-group mb-3">
				<input type="password" class="form-control" name="confirmPassword" id="confirmPass" required="required" placeholder="패스워드확인">
			</div>
			<div class="input-group mb-3">
				<input type="text" class="form-control" name="name" required="required" placeholder="이름">
			</div> 
			<div class="input-group mb-3">
				<input type="text" class="form-control" name="address" required="required" placeholder="주소">
			</div>
			<div class="input-group mb-3">	
				<input type="date" class="form-control" name="birth" required="required" placeholder="생년월일" >
			</div>
				<button type="submit" class="btn btn-primary btn-block">가입하기</button>
			</form>
		</div><%--col-sm-4 offset-sm-4 div --%>
	</div>  <%-- row div --%>	
</div> <%-- container --%>