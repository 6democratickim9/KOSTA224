<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>.do test</title>
</head>
<body>
<h3>Ŭ���̾�Ʈ ��û ��� *.do</h3>
<%--
	��û url�� .do�� ��ġ�°��� ��� FrontControllerServlet�� ó���ϵ��� �����Ͽ� �׽�Ʈ �غ���
	�� ���������� ��û�غ��� ���� ���� �ֿܼ��� ����� Ȯ���Ѵ�
 --%>
<a href="FrontController.do">��ȸ</a><br><br>
<form action="RegisterController.do" method="post">
<button type="submit">submit</button>
</form>
</body>
</html>