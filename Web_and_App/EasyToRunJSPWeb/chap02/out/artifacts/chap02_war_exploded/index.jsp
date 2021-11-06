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
    <title>Scripting Tag</title>
  </head>
  <body>
  <h2>Scripting Tag</h2>
  <%! int count=3;

    String makeItLower(String data){
      return data.toLowerCase();
    }%>
  <%! int data=50;%>
  <%! int sum(int a, int b){
    return a+b;
  }%>
  <%
    for (int i = 1; i <=count ; i++) {
      out.println("Java Server Pages"+ i +".<br>");
    }
    out.println("Value of the variable is:"+data+"<br>");
  %>
  <%
    out.println("2 + 3 = "+sum(2,3)+"<br>");
  %>

  <%=makeItLower("Hello World")%>
  </body>
</html>
