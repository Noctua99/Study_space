<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="java.util.Date"%>
<%@ page import="java.lang.Math"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Directives Tag</title>
</head>
<body>
	<%
	Date now = new Date();
	out.println("���� ��¥ : " + now + "<br>");
	out.println("5�� ���� : " + Math.pow(5, 2));
	%>
</body>
</html>