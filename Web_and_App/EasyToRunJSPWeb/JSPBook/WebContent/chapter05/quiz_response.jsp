<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="java.time.LocalTime"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
	response.setHeader("Refresh", "1");
	LocalTime now = LocalTime.now();
	int hour = now.getHour();
	int minute = now.getMinute();
	int second = now.getSecond();
	String am_pm;
	if (hour >= 12) {
		am_pm = "PM";
		hour -= 12;
	} else {
		am_pm = "AM";
	}
	out.println("���� �ð��� " + hour + ":" + minute + ":" + second + " " + am_pm);
	%>
	<p>
		<a href="quiz_response_data.jsp">Google Ȩ�������� �̵��ϱ�</a>
</body>
</html>