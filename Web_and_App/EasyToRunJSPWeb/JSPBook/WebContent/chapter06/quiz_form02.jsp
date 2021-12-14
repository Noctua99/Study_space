<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Form Processing</title>
</head>
<body>
	<form action="quiz_form02_process.jsp" method="POST">
		<p>
			이름 : <input type="text" name="user_name">
		<p>
			주소 : <input type="text" name="user_address">
		<p>
			이메일 : <input type="text" name="user_email">
		<p>
			<input type="submit" value="전송">
	</form>
</body>
</html>