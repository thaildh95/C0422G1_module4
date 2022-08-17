<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 8/17/2022
  Time: 2:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>Tờ Khai Y Tế</h1>
<h2>ĐÂY LÀ TÀI LIỆU QUAN TRỌNG, THÔNG TIN CỦA ANH/CHỊ SẼ GIÚP CƠ QUAN Y TẾ LIÊN LẠC KHI CẦN THIẾT ĐỂ ĐỀ PHÒNG BỆNH TRUYỀN NHIỄM</h2>
              <h5 style="color: red">Khuyến cáo : Khai báo thông tin sai là vi phạm pháp luật và sẽ bị xử lí hình sự</h5>
 <form:form action="/info" method="get" modelAttribute="HealthDeclare">
<div>
  <form:label path="name">Họ và tên</form:label>
  <form:input path="name"></form:input>
</div>
   <div>
     <form:label path="birth">Năm sinh</form:label>
     <form:select path="birth" items="${yearList}"></form:select>
     <form:label path="gender">Giới tính</form:label>
     <form:select path="gender" items="${genderList}"></form:select>
     <form:label path="nationality">Quốc tịch</form:label>
     <form:select path="nationality" items="${nationList}"></form:select>
   </div>

   <div>
     <form:label path="id">Số CMND</form:label>
    <form:input path="id"></form:input>
   </div>
 </form:form>

  </body>
</html>
