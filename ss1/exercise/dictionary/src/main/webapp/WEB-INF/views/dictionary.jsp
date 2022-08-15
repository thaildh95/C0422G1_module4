<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 8/15/2022
  Time: 12:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../../bootstrap-5.0.2-dist/js/bootstrap.min.js">
</head>
<body>
<form action="/dictionarytion" method="post">
    <input type="text" name="name" placeholder="Nhap tu">
    <button type="submit" class="btn btn-primary">Click</button>
    <h3>${result}</h3>
</form>
<script src="../../bootstrap-5.0.2-dist/css/bootstrap.min.css"></script>
<script src="../../bootstrap-5.0.2-dist/jquery/jquery-3.6.0.min.js"></script>
</body>
</html>
