<%--suppress JSUnresolvedLibraryURL --%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
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
    <jsp:include page="../views/fragments/header.jsp"/>

    <h2>Resources</h2>

    <table class="table table-hover">
        <tbody>
        <tr>
            <th>Name</th><th>Type</th><th>Cost</th>
        </tr>
        <c:forEach items="${resources}" var="resource">
            <tr>
                <td><a href="<spring:url value="/resource/${resource.resourceId}"/>" >${resource.name}</a></td>
                <td>${resource.type}</td>
                <td>${resource.cost}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
