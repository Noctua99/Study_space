<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Form Processing</title>
</head>
<body>
	<%
	request.setCharacterEncoding("UTF-8");

	String name = request.getParameter("user_name");
	String address = request.getParameter("user_address");
	String email = request.getParameter("user_email");

	StringBuffer sb = new StringBuffer();
	sb.append("이름 : ").append(name).append("<br>");
	sb.append("주소 : ").append(address).append("<br>");
	sb.append("이메일 : ").append(email).append("<br>");
	%>
	<p>
		<%=sb%>
</body>
</html>