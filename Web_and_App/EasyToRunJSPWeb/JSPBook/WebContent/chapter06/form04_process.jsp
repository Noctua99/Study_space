<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Form Processing</title>
</head>
<body>
	<%
	request.setCharacterEncoding("UTF-8");

	String id = request.getParameter("id");
	String passwd = request.getParameter("passwd");
	String name = request.getParameter("name");
	String phone1 = request.getParameter("phone1");
	String phone2 = request.getParameter("phone2");
	String phone3 = request.getParameter("phone3");
	String sex = request.getParameter("sex");
	String hobby1 = request.getParameter("hobby1");
	String hobby2 = request.getParameter("hobby2");
	String hobby3 = request.getParameter("hobby3");
	String comment = request.getParameter("comment");
	%>
	<p>
		아이디 : <%=id%>
		비밀번호 : <%=passwd%>
		이름 : <%=name%>
		연락처 : <%=phone1%>-<%=phone2%>-<%=phone3%>
		성별 : <%=sex%>
		취미 : <%=hobby1%> <%=hobby2%> <%=hobby3%>
		가입 인사 : <%=comment%>
</body>
</html>