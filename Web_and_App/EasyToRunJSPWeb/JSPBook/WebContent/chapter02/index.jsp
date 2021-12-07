<%--
  Created by IntelliJ IDEA.
  User: jongi
  Date: 2021-11-06
  Time: 오전 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%--        int count2 = 0;--%>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <title>Welcome</title>
</head>
<body>
<%--<h2>Scripting Tag</h2>--%>
<%--<%! int count = 3;--%>

<%--    String makeItLower(String data) {--%>
<%--        return data.toLowerCase();--%>
<%--    }%>--%>
<%--<%! int data = 50;%>--%>
<%--<%! int sum(int a, int b) {--%>
<%--    return a + b;--%>
<%--}%>--%>
<%--<%--%>
<%--    for (int i = 1; i <= count; i++) {--%>
<%--        out.println("Java Server Pages" + i + ".<br>");--%>
<%--    }--%>
<%--    out.println("Value of the variable is:" + data + "<br>");--%>
<%--%>--%>
<%--<%--%>
<%--    out.println("2 + 3 = " + sum(2, 3) + "<br>");--%>
<%--%>--%>

<%--<%=makeItLower("Hello World")%>--%>

<%--Page Count is--%>
<%--<%--%>
<%--    out.println(++count2);--%>
<%--%>--%>
<%--<%= ++count2 %>--%>
<%--<p> Today's date: <%=new java.util.Date()%>--%>
<%--</p>--%>
<nav class="navbar navbar-expand  navbar-dark bg-dark">
    <div class="container">
        <div class="navbar-header">
            <a class="navbar-brand" href="./index.jsp">Home</a>
        </div>
    </div>
</nav>
<%! String greeting = "Welcome to Web Shopping Mall";
    String tagline = "Welcome to Web Market!";%>
<div class="jumbotron">
    <div class="container">
        <h1 class="display-3">
            <%=greeting%>
        </h1>
    </div>
</div>
<div class="container">
    <div class="text-center">
        <h3>
            <%=tagline%>
        </h3>
    </div>
    <hr>
</div>
<footer class="container">
    <p>&copy; WebMarket</p>
</footer>
</body>
</html>
