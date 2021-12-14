<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ page import="java.io.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<title>Form Processing</title>
</head>
<body>
	<%
	request.setCharacterEncoding("UTF-8");

	Enumeration paramNames = request.getParameterNames();

	String name = (String) paramNames.nextElement();
	String address = (String) paramNames.nextElement();
	String email = (String) paramNames.nextElement();

	StringBuffer sb = new StringBuffer();
	sb.append(name).append(" : ").append(request.getParameter(name)).append("<br>");
	sb.append(address).append(" : ").append(request.getParameter(address)).append("<br>");
	sb.append(email).append(" : ").append(request.getParameter(email)).append("<br>");
	%>
	<p>
		<%=sb%>
</body>
</html>