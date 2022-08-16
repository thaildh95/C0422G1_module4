<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 8/16/2022
  Time: 3:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form action="/calculate" method="get">
    <input type="number" name="number1" value="0" required>
    <input type="number" name="number2" value="0" required>
    <button type="submit" name="operator" value="addition">addition</button>
    <button type="submit" name="operator" value="subtraction">subtraction</button>
    <button type="submit" name="operator" value="multiplication">multiplication</button>
    <button type="submit" name="operator" value="division">division</button>
</form>
<h3>Result : ${result}</h3>
</body>
</html>
