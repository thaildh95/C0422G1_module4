<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 8/17/2022
  Time: 1:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <th>language</th>
        <th>size</th>
        <th>check filter</th>
        <th>signature</th>
    </tr>
    <c:forEach var="configure" items="${configureList}">
        <td>${configure.language}</td>
        <td>${configure.size}</td>
        <td>${configure.filter}</td>
        <td>${configure.signature}</td>
    </c:forEach>
    <tr>

    </tr>
</table>
</body>
</html>
