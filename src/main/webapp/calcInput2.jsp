<%--
  Created by IntelliJ IDEA.
  User: 82102
  Date: 2021-08-06
  Time: 오전 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
</head>
<body>
    <h1>Input</h1>

<form action="calcResult2.jsp" method="post" target="zero">
    <div>
        <input type="number" name="num1">
    </div>
    <div>
        <input type="number" name="num2">
    </div>
    <div>
        <select name="oper">
            <option value="add" selected> + </option>    <!---->
            <option value="sub"> - </option>
            <option value="mul"> * </option>
            <option value="div"> / </option> <!--value에 연산자 입력하면 에러가 날 수 있다.-->
        </select>
    </div>
    <div>
    <button type="submit">SUBMIT</button>
    </div>      <!--div 영역을 구분하는 태그. 컨텍스트. style 쓸 때 거의 div로 사용 -->
</form>
    <iframe name="zero"></iframe>  <!--이름을 줘야함.화면의 전환없이 같은 페이지 내에서 결과가 나온다.-->

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj" crossorigin="anonymous"></script>
</body>
</html>
