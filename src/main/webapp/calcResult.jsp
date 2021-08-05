<%--
  Created by IntelliJ IDEA.
  User: 82102
  Date: 2021-08-05
  Time: 오후 11:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    int num1 = Integer.parseInt(request.getParameter("num1"));
    int num2 = Integer.parseInt(request.getParameter("num2"));
    String operator = request.getParameter("operator");
    int result = 0;

    switch (operator) {
        case "+":
            result = num1 + num2;
            break;
        case "-":
            result = num1 - num2;
            break;
        case "*":
            result = num1 * num2;
            break;
        case "/":
            result = num1 / num2;
            break;
    }
%>
<html>
<head>
    <title>Title</title>
</head>
<body>

   <h1><%=result%></h1>

   <a href="calcInput.jsp">다시 시도</a>

</body>
</html>
