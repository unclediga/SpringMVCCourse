<%--suppress JSUnresolvedLibraryURL --%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Project Manager</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
            integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
            crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
            integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
            crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
            integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
            crossorigin="anonymous"></script>
    <link rel="stylesheet" href="<spring:url value="/resources/css/home.css" />" type="text/css"/>
</head>
<body>
<jsp:include page="fragments/header.jsp"/>
<div class="container">
    <div class="row">
        <h1>Resource Review</h1>
    </div>

        <div class="form-group">
            <label for="name">Name</label>
            <input value="${resource.name}" id="name" type="text" class="form-control"/>
        </div>
        <div class="form-group">
            <label for="type">Type</label>
            <input value="${resource.type}" id="type" class="form-control"/>
        </div>
        <div class="form-group">
            <label for="cost">Cost</label>
            <input value="${resource.cost}" id="cost" type="text" class="form-control">
        </div>
        <div class="form-group">
            <label for="unit">Unit Of Measure</label>
            <c:forEach var="radio" items= "${resource.unitOfMeasure}" >
                <span id="unit" >${radio}</span>
            </c:forEach>
        </div>
        <div class="form-group">
            <label for="indicators">Indicators</label>
            <c:forEach var="indicator" items= "${resource.indicators}" >
                <span id="indicators" >${indicator}</span>
            </c:forEach>
        </div>
        <div class="form-group">
            <label for="notes">Notes</label>
            <textarea  id="notes"  rows="3" class="form-control">${resource.notes}</textarea>
        </div>
        <spring:url value="/resource/add" var="addUrl"/>
        <spring:url value="/resource/save" var="saveUrl"/>
        <a href="${addUrl}" class="btn btn-primary">Edit</a>
        <a href="${saveUrl}" class="btn btn-primary">Submit</a>

</div>
</body>
</html>
