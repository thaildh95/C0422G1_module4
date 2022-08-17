<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 8/17/2022
  Time: 9:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<a class="btn btn-success" href="/">Thêm mới</a>
<div>
    <p style="color: red">${mess}</p>
</div>
<table class="table table-success table-striped">
    <tr>
        <th>STT</th>
        <th>Họ tên</th>
        <th>Năm sinh</th>
        <th>Giới tính</th>
        <th>Quốc tịch</th>
        <th>CMND</th>
        <th>Thông tin đi lại</th>
        <th>Phương tiện</th>
        <th>Số ghê</th>
        <th colspan="3">Ngày khởi hành</th>
        <th colspan="3">Ngày kết thúc</th>
        <th>Lưu ý</th>
        <th colspan="3">Tùy Chọn</th>
    </tr>

    <c:forEach var="medical" items="${healthDeclareList}" varStatus="status">
        <tr>
            <td>${status.count}</td>
            <td>${medical.name}</td>
            <td>${medical.birth}</td>
            <td>${medical.gender}</td>
            <td>${medical.nationality}</td>
            <td>${medical.id}</td>
            <td>${medical.travelInformation}</td>
            <td>${medical.vehicle}</td>
            <td>${medical.seats}</td>
            <td>${medical.startDay}</td>
            <td>${medical.startMonth}</td>
            <td>${medical.startYear}</td>
            <td>${medical.endDay}</td>
            <td>${medical.endMonth}</td>
            <td>${medical.endYear}</td>
            <td>${medical.infomation}</td>
            <td>
                <a class="btn btn-primary" href="/details?id=${medical.id}">Xem</a>
            </td>
            <td>
                <a class="btn btn-warning" href="/showEdit?id=${medical.id}">Chỉnh sửa</a>
            </td>
            <td>
                <button class="btn btn-danger"
                        data-bs-toggle="modal"
                        data-bs-target="#deleteModal"
                        onclick="setIdToFormDelete('${medical.id}')">
                    Delete
                </button>
            </td>
        </tr>
    </c:forEach>
</table>

<!-- Modal -->
<div class="modal fade" id="deleteModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="deleteModalLabel">Delete confirm</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
                Are you sure delete?
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary" onclick="submitFormDelete()">Delete</button>
            </div>
        </div>
    </div>
</div>

<form action="/delete" id="formDelete">
    <input type="hidden" id="idInput" name="id">
</form>

<script>
    function setIdToFormDelete(id) {
        document.getElementById("idInput").value = id;
    }

    function submitFormDelete() {
        document.getElementById("formDelete").submit();
    }
</script>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</body>
</html>
</body>
</html>
