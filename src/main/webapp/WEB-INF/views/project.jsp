<%--suppress JSUnresolvedLibraryURL --%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
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
    <div class="form-group row">
        <label for="project-name" class="col-form-label">Name</label>
        <span id="project-name" class="form-control-plaintext">${project.name}</span>
    </div>

    <div class="form-group row">
        <label for="project_type" class="col-form-label">Type</label>
        <span id="project_type" class="form-control-plaintext">${project.type }</span>
    </div>

    <div class="form-group row">
        <label for="sponsor" class="col-form-label">Sponsor</label>
        <span id="sponsor" class="form-control-plaintext">${project.sponsor}</span>
    </div>

    <div class="form-group row">
        <label for="funds" class="col-form-label">Authorized Funds</label>
        <span id="funds" class="form-control-plaintext">${project.authorizedFunds}</span>
    </div>

    <div class="form-group row">
        <label for="hours" class="col-form-label">Authorized Hours</label>
        <span id="hours" class="form-control-plaintext">${project.authorizedHours}</span>
    </div>

    <div class="form-group row">
        <label for="project-descr" class="col-form-label">Description</label>
        <span id="project-descr" class="form-control-plaintext">${project.description}</span>
    </div>

    <div class="form-group row">
        <label for="special" class="col-form-label">Special</label>
        <span id="special" class="form-control-plaintext">${project.special == true ? 'Yes':'No'}</span>
    </div>

</div>

</body>
</html>
