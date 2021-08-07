<%@ page import="org.zerock.w1.dto.StoreDTO" %>
<%@ page import="org.zerock.w1.service.StoreService" %>
<%--
  Created by IntelliJ IDEA.
  User: 82102
  Date: 2021-08-06
  Time: 오후 6:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    request.setCharacterEncoding("UTF-8");//한글 안깨지게
    String name = request.getParameter("name");   // 값을 읽으려고 가져온다.요청.받아오는 값.
    String area = request.getParameter("area");
    String desc = request.getParameter("desc");
    String link = request.getParameter("link");

    StoreDTO dto= StoreDTO.builder()
            .name(name)
            .area(area)
            .desc(desc)
            .link(link)
            .build();  //롬복 사용

    StoreService.INSTANCE.add(dto);// 식당추가

    response.sendRedirect("show.jsp"); // 결과를 보여준다. write . 자동생성되게 만듬.바로 목록을 띄어줌.
     // Post처리시 등록 수정 삭제를 할 때 이 일이 마무리가 됬으면 흐름을 끊고 처음부터 다시 (리프레쉬)
    // 카페 글 쓰기 끝나고 다시 목록으로 가는 것.(리다이렉트)
    // 시작.
%>
<!--
<html>
<head>
<title>Title</title>
</head>
<body>

<h1><a href="show.jsp"> 목록 </a></h1>

<h2><%= name%></h2>
<h2><%= area%></h2>
<h2><%= desc%></h2>
<h2><%= link%></h2>
</body>
</html>
-->
