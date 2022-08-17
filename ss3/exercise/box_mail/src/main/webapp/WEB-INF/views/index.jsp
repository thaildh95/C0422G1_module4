<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 8/17/2022
  Time: 9:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h1>Setting</h1>
<form:form action="/configure" method="post" modelAttribute="MailConfiguration">
    <div>
        <form:label path="language"> Language</form:label>
        <form:select path="language" items="${languageList}"> </form:select>
    </div>
    <div>
        <form:label path="size"> Size</form:label>
        <form:select path="size" items="${sizeList}"> size </form:select>
    </div>
    <form:label path="filter"> Filter </form:label>
    <form:checkbox path="filter"/>
    <div>
        <form:label path="signature"> Signature</form:label>
        <form:textarea path="signature"></form:textarea>
    </div>
    <div>
        <button type="submit">sibmit</button>
    </div>

</form:form>
</body>
</html>
