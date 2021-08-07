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
    <title>ADD</title>
</head>
<body>

<h1>ADD</h1>
<form action="addResult.jsp" method="post"> <!--form action 폼의 행동 결과를 보내준다.-->
    <div> <!--구역 나눠준다.css를 위해서. 꾸며주는 기능을 위해서.-->
        <input type="text" name="name" value="맛집">  <!--value 값이 미리 넣어준다.-->
    </div>
    <div>
        <input type="text" name="area" value="종각">
    </div>
    <div>
        <input type="text" name="desc" value="설명">
    </div>
    <div>
        <input type="text" name="link">
    </div>
    <div>
        <button type="reset">Reset</button>
        <button type="submit">Submit</button>
    </div>

</form>
</body>
</html>