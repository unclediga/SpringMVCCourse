<%--suppress JSUnresolvedLibraryURL --%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
        <h1>Project</h1>
    </div>
    <spring:url value="/project/add" var="formUrl"/>
    <form:form method="post" action="${formUrl}" modelAttribute="project" >
        <div class="form-group">
            <label for="project-name">Name</label>
            <form:input class="form-control" id="project-name"  path="name" />
            <form:errors path="name" cssStyle="color: red"/>
        </div>
        <div class="form-group">
            <label for="sponsor-name">Sponsor name</label>
            <form:input class="form-control" id="sponsor-name" path="sponsor.name"/>
        </div>
        <div class="form-group">
            <label for="sponsor-phone">Sponsor phone</label>
            <form:input class="form-control" id="sponsor-phone" path="sponsor.phone"/>
        </div>
        <div class="form-group">
            <label for="sponsor-email">Sponsor email</label>
            <form:input class="form-control" id="sponsor-email" path="sponsor.email"/>
        </div>
        <div class="form-group">
            <label for="project_type">Type</label>
            <form:select path="type" items="${types}" class="selectpicker" id="project_type"/>
            <form:errors path="type" cssStyle="color: red"/>
        </div>
        <div class="form-group">
            <label for="funds">Authorized Funds</label>
            <form:input class="form-control" id="funds" path="authorizedFunds"/>
            <form:errors path="authorizedFunds" cssStyle="color: red"/>
        </div>
        <div class="form-group">
            <label for="hours">Authorized Hours</label>
            <form:input lass="form-control" id="hours" path="authorizedHours"/>
            <form:errors path="authorizedHours" cssStyle="color: red"/>
        </div>
        <div class="form-group">
            <label for="project-description">Description</label>
            <form:textarea id="project-description" class="form-control" rows="3" path="description"/>
            <form:errors path="description" cssStyle="color: red"/>
        </div>
        <div class="form-group">
            <label for="start_date">start date</label>
            <form:input class="form-control" id="start_date" path="startDate"/>
        </div>
        <div class="form-group">
            <label for="poc">POC</label>
            <form:input class="form-control" id="poc" path="pointOfContact[0]"/>
        </div>
        <div class="form-group">
            <label for="poc2">POC2</label>
            <form:input class="form-control" id="poc2" path="pointOfContact[1]"/>
        </div>
        <div class="form-group">
            <label for="poc3">POC3</label>
            <form:input class="form-control" id="poc3" path="pointOfContact[2]"/>
        </div>
        <div class="form-group">
            <label for="special">Special</label>
            <form:checkbox class="form-control" id="special" path="special" />
            <form:errors path="special" cssStyle="color: red"/>
        </div>

        <button type="submit" class="btn btn-primary">Submit</button>
    </form:form>
</div>
</body>
</html>
