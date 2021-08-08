<%@ page import="org.zerock.w1.dto.StoreDTO" %>
<%@ page import="jdk.tools.jlink.internal.Jlink" %>
<%@ page import="org.zerock.w1.service.StoreService" %><%--
  Created by IntelliJ IDEA.
  User: 82102
  Date: 2021-08-06
  Time: 오후 7:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    request.setCharacterEncoding("UTF-8");
    String name = request.getParameter("name");
    String area = request.getParameter("area");
    String desc = request.getParameter("desc");
    String link = request.getParameter("link");

    StoreDTO dto = StoreDTO.builder()
            .name(name)
            .area(area)
            .desc(desc)
            .link(link)
            .build();

    StoreService.INSTANCE.add(dto);

    response.sendRedirect("show.jsp");
%>
<!---
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
-->