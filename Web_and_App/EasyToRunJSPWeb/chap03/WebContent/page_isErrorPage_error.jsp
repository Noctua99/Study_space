<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Directives Tag</title>
</head>
<body>
	<h4>에러가 발생되었습니다.</h4>
	<h5>exception 내장 객체 변수</h5>
	<%
	exception.printStackTrace(new java.io.PrintWriter(out));
	%>
</body>
</html>