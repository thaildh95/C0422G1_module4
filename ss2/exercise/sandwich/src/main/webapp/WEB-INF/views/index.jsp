<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 8/16/2022
  Time: 1:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h1>Sandwich Condiment</h1>
<form action="/save" method="post">
    <c:forEach var="s" items="${list}">
        <p><input type="checkbox" value="${s.name}" name="spices"> ${s.name}</p>
    </c:forEach>
    <button>Save</button>

    ${result}
</form>


</body>
</html>
