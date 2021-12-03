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
	out.println("현재 날짜 : " + now + "<br>");
	out.println("5의 제곱 : " + Math.pow(5, 2));
	%>
</body>
</html>