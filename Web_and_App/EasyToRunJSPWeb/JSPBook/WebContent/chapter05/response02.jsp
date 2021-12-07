<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<p>
		이 페이지는 1초마다 새로고침 됩니다.
		<%
	response.setIntHeader("Refresh", 1);
	%>
	<p><%=(new java.util.Date()) %>
</body>
</html>