<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 8/12/2022
  Time: 4:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/convertUSD" method="post">
    <input name="usd" type="number" placeholder="Mời nhập số tiền USD" >
    <button type="submit">Đổi</button>
</form>
<h1>$ = ${resultChangeUSD}</h1>
</body>
</html>
