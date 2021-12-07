<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Action Tag</title>
</head>
<body>
	<p>
		아이디 :
		<%=request.getParameter("id")%>
		<%
		String name = request.getParameter("name");
		%>
	
	<p>
		이 름 :
		<%=java.net.URLDecoder.decode(name)%>
</body>
</html>