<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<form action="UpdatePostController.do" method="post">
	<table class="table">
		<tr>
			<td><input type="text" name="title" value=""
				placeholder="title" required="required">
			</td>
		</tr>
		<tr>
			<td><textarea rows="10" class="form-control" name="content"
					required="required"></textarea></td>
		</tr>
	</table>
	<div class="text-center">
		<button type="submit" class="btn btn-success">수정</button>
		<button type="reset" class="btn btn-success">취소</button>
	</div>
</form>