<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<table class="table table-hover table-bordered boardlist">
	<tr>
	<tr style="background-color: #d6f5d6">
		<td>번호</td>
		<td class="title">제목</td>
		<td>작성자</td>
		<td>작성일</td>
		<td>조회</td>
	</tr>
	<tr>
		<td colspan="5">
			<%--pre: db 에 저장된 글형식 그대로 표현 --%> <pre>
	<font size="4"></font>
	</pre>
	</tr>
	<tr>
		<td colspan="5" class="btnArea">
			<button type="button" class="button btn-success">delete</button>
			<button type="button" class="button btn-success">edit</button>
		</td>
</table>