<%--
  Created by IntelliJ IDEA.
  User: hanseul
  Date: 2021/08/05
  Time: 5:43 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String number1 = request.getParameter("num1");
    String number2 = request.getParameter("num2");
%>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1> <%= number1 %> </h1>
<h1> <%= number2 %> </h1>
<% System.out.println("number1" + "+" + "number2" + "=" + number1+number2 );
%>

<a href="calcInput.jsp"><input type="button" value="돌아가기"></a>
</body>
</html>

