<%--suppress JSUnresolvedLibraryURL --%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Project Manager</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"
            integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
            crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
            integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
            crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
            integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
            crossorigin="anonymous"></script>
    <link rel="stylesheet" href="<spring:url value="/resources/css/home.css" />" type="text/css"/>
    <script>var ctx = "${pageContext.request.contextPath}"</script>
    <script src="<spring:url value="/resources/js/resource.js" />"></script>
</head>
<body>
<jsp:include page="fragments/header.jsp"/>
<div class="container">
    <div class="row">
        <h1>Resource</h1>
    </div>

    <spring:url value="/resource/review" var="formUrl"/>
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
            <form:input path="cost" id="cost" type="text" class="form-control"/>
        </div>
        <div class="form-group">
            <label for="unit">Unit Of Measure</label>
            <form:radiobuttons path="unitOfMeasure" items="${radioOptions}" id="unit" />
        </div>
        <div class="form-group">
            <label for="indicators">Indicators</label>
            <form:checkboxes path="indicators" items="${checkOptions}" id="indicators" />
        </div>
        <div class="form-group">
            <a href="#" id="request-link">Send Request</a>
        </div>
        <div class="form-group">
            <label for="notes">Notes</label>
            <form:textarea path="notes" id="notes"  rows="3" class="form-control"/>
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form:form>
    
    <spring:url value="/resource/upload" var="uploadUrl"/>
    <form action="${uploadUrl}" method="POST" enctype="multipart/form-data">
        <input name="file" type="file" />
        <input type="submit" value="Upload">Upload the file!
    </form>

</div>
</body>
</html>
