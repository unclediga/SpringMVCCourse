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
        <h1>Resource</h1>
    </div>

    <spring:url value="/resource/save" var="formUrl"/>
    <form:form method="POST" action="${formUrl}" modelAttribute="resource">
        <div class="form-group">
            <label for="name">Name</label>
            <form:input path="name" id="name" type="text" cssClass="form-control"/>
        </div>
        <div class="form-group">
            <label for="type">Type</label>
            <form:select path="type" items="${typeOptions}" cssClass="form-control"/>
        </div>
        <div class="form-group">
            <label for="cost">Cost</label>
            <input name="cost" id="cost" type="text" class="form-control">
        </div>
        <div class="form-group">
            <label for="unit">Unit Of Measure</label>
            <form:radiobuttons path="unitOfMeasure" items="${radioOptions}" id="unit" />
        </div>
        <div class="form-group">
            <label for="indicators">Indicators</label>
            <form:checkboxes path="indicators" items="${checkOptions}" id="indicators" />
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form:form>

</div>
</body>
</html>
