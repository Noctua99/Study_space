<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ page import="java.io.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<title>Form Processing</title>
</head>
<body>
	<p>
		<b>선택된 과일</b>
	<p>
		<%
		request.setCharacterEncoding("UTF-8");

		String[] values = request.getParameterValues("fruit");
		for (String value : values) {
			out.println("<b>"+value+"</b>");
		}
		%>
	
</body>
</html>