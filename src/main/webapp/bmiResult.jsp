<%--
  Created by IntelliJ IDEA.
  User: 82102
  Date: 2021-08-05
  Time: 오후 5:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%  //시작
    String heightStr = request.getParameter("height");
    String weightStr = request.getParameter("weight");
%> // 끝. 스크립트릿(Scriptlet). 자바코드의 조각 //자바코드로 바꿔준다.
//웹은 문자열로 처리



<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1><%=heightStr%></h1> // 스크립트릿(Scriptlet)안의 변수를 출력할 때 사용
    <h1><%=weightStr%></h1>

    <a href="bmiInput.jsp"> 다시 시도</a>
</body>
</html>
//사용자가 전달한 데이터를 읽는다.
//request는 인풋스트림 대신 - 처리를 다 해둠.
//들어오는 자바코드가 필요