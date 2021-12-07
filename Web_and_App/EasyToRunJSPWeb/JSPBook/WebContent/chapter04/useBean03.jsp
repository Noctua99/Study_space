<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="person" class="com.Person" scope="request" />
	<p>
		아이디 :
		<%=person.getId()%>
	<p>
		이 름 :
		<%=person.getName()%>
</body>
</html>