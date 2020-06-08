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
    <form>
        <div class="form-group">
            <label for="project-name">Name</label>
            <input type="text" class="form-control" id="project-name" name="name">
        </div>
        <div class="form-group">
            <label for="sponsor">Sponsor</label>
            <input type="text" class="form-control" id="sponsor" name="sponsor">
        </div>
        <div class="form-group">
            <label for="funds">Authorized Funds</label>
            <input type="text" class="form-control" id="funds" name="authorized_funds">
        </div>
        <div class="form-group">
            <label for="hours">Authorized Hours</label>
            <input type="text" class="form-control" id="hours" name="authorized_hours">
        </div>
        <div class="form-group">
            <label for="project-name">Description</label>
            <textarea class="form-control" rows="3"></textarea>
        </div>

        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>
</body>
</html>
