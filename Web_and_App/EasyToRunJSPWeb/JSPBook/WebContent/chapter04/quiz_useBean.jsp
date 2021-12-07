<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h4>구구단 출력하기</h4>
	<br>
	<jsp:useBean id="gugudan" class="dao.GuGuDan" />
	<%
	out.println(gugudan.process(5));
	%>
</body>
</html>