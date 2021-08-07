<%@ page import="org.zerock.w1.service.StoreService" %>
<%--
  Created by IntelliJ IDEA.
  User: 82102
  Date: 2021-08-06
  Time: 오후 6:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String area=request.getParameter("area"); //  값을 읽으려고 가져온다.요청.받아오는 값.
%>
<h1><%=StoreService.INSTANCE.getDtoList(area) %></h1>
</body>
</html>
