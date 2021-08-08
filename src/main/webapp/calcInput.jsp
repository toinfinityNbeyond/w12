<%--
  Created by IntelliJ IDEA.
  User: 82102
  Date: 2021-08-05
  Time: 오후 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="calcResult.jsp" method="post">

        <h1>계산기</h1>
        <input name="num1"><br>
        <input name="num2"><br>
        <select name="operator">
            <option> + </option>
            <option> - </option>
            <option> * </option>
            <option> / </option>
        </select>
        <input type="submit" value="=">
    </form>
</body>
</html>
