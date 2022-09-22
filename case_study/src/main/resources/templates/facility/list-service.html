<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 8/4/2022
  Time: 11:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Danh sách khách hàng</title>
    <link rel="stylesheet" href="/other/bootstrap/css/bootstrap.min.css">
    <style>
      
    </style>
    
</head>

<body>
<%@include file="/view/include/head.jsp"%>
<div class="container-fluid position-relative">
    <div class="row">
        <div class="col-lg-10 d-flex justify-content-center  position-absolute" style="top: 10%">
            <div class="row">
                <div class="col-l-12 ps-2 pe-2">
                    <div class="row text-center">
                        <h2>Service List</h2>
                        <div class="col-lg-3">
                            <a href="/facility?action=add">
                                <button class="btn btn-primary">Add new service</button>
                            </a>
                        </div>
                        <div class="col-lg-9">
                            <form action="/facility" method="get">
                                <div class="row">
                                    <div class="col-lg-3"></div>
                                    <div class="col-lg-3">
                                        <input type="text" placeholder="facility code" name="facilityCode" class="form-control">
                                    </div>
                                    <div class="col-lg-3">
                                        <input type="text" placeholder="facility Name" name="facilityName" class="form-control">
                                    </div>
                                    <div class="col-lg-3">
                                        <button type="submit" name="action" value="find" class="btn btn-primary">search</button>
                                    </div>
                                </div>
                            </form>
                        </div>
                        <table class="table" id="list">
                            <thead>
                            <tr>
                                <th>ID</th>
                                <th>Name</th>
                                <th>Area</th>
                                <th>Cost</th>
                                <th>Max people</th>
                                <th>Rental type</th>
                                <th>Type</th>
                                <th>Standard</th>
                                <th>Other convenience</th>
                                <th>Pool area</th>
                                <th>Floors</th>
                                <th>Facility free</th>
                                <th></th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${facilityList}" var="facility">
                                <tr>
                                    <td>${facility.id}</td>
                                    <td>${facility.name}</td>
                                    <td>${facility.area}</td>
                                    <td>${facility.cost}</td>
                                    <td>${facility.maxPeople}</td>

                                    <c:forEach var="rentType" items="${rentTypeList}">
                                        <c:if test="${rentType.rentId == facility.rentTypeId}">
                                            <td>${rentType.rentTypeName}</td>
                                        </c:if>
                                    </c:forEach>

                                    <c:forEach var="facilityType" items="${facilityTypeList}">
                                        <c:if test="${facility.facilityTypeId == facilityType.id}">
                                            <td>${facilityType.name}</td>
                                        </c:if>
                                    </c:forEach>

                                    <td>${facility.standard}</td>
                                    <td>${facility.otherConvenience}</td>
                                    <td>${facility.poolArea}</td>
                                    <td>${facility.floors}</td>
                                    <td>${facility.facilityFree}</td>
                                    <td>
                                        <a href="/facility?action=edit&facilityCode=${facility.id}">
                                            <button style="padding: 5px" class="btn btn-primary">
                                                <span class="material-symbols-outlined">edit</span>
                                            </button>
                                        </a>
                                        <button style="padding: 5px" type="button" class="btn btn-primary"
                                                data-bs-toggle="modal" data-bs-target="#exampleModal"
                                                onclick="getInfoToModal('${facility.id}','${facility.name}')">
                                            <span class="material-symbols-outlined">delete</span>
                                        </button>
                                    </td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
<%--        <div class="col-lg-10 pt-2 pb-2 d-flex justify-content-center">--%>
<%--            <img style="border-radius: 30px" width="93%"--%>
<%--                 src="https://s3.ap-southeast-2.amazonaws.com/travlr.com/uploads/images/venue/923e2231037b6ad79efbd200cf2a1d6e.jpg"--%>
<%--                 alt="">--%>
<%--        </div>--%>
    </div>
    <form action="/facility">
        <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        <div class="row">
                            <div class="col-lg-3">Service Code:</div>
                            <div class="col-lg-9">
                                <input type="text" readonly name="facilityCode" id="code" class="form-control">
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-lg-3">Service Name:</div>
                            <div class="col-lg-9">
                                <input type="text" readonly id="name" class="form-control">
                            </div>
                        </div>
                        <div class="row">
                            <h5>Are you sure that you want to delete this service?</h5>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                        <button type="submit" name="action" value="delete" class="btn btn-primary">Yes</button>
                    </div>
                </div>
            </div>
        </div>
    </form>
</div>
<%@include file="/view/include/foot.jsp"%>
<script src="../../jquery/jquery-3.6.0.min.js"></script>
<script src="../../DataTables-1.12.1/js/jquery.dataTables.min.js"></script>
<script src="../../DataTables-1.12.1/js/dataTables.bootstrap5.min.js"></script>
<script src=../../bootstrap-5.1.3-dist/js/bootstrap.min.js></script>
<script>
    $(document).ready(function () {
        $('#list').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 3
        });
    });
</script>
<script>
    function getInfoToModal(code, name) {
        document.getElementById("code").value = code;
        document.getElementById("name").value = name;
    }
</script>
</body>
</html>
