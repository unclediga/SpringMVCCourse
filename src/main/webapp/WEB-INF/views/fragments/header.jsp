<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">Project Manager</a>
        </div>
        <div class="collapse navbar-collapse">
            <ul class="nav">
                <li class="nav-item">
                    <a class="nav-link active" href="#">Home</a>
                </li>
                <li class="nav-item">
                    <div class="dropdown">
                        <button class="btn dropdown-toggle" type="button" id="dropdownMenuButton1"
                                data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Projects
                        </button>
                        <div class="dropdown-menu" aria-labelledby="dropdownMenuButton1">
                            <a class="dropdown-item" href="<spring:url value="/project/add"/>">Add</a>
                            <a class="dropdown-item" href="<spring:url value="/project/find"/>">Find</a>
                        </div>
                    </div>
                </li>
                <li class="nav-item">
                    <div class="dropdown">
                        <button class="btn dropdown-toggle" type="button" id="dropdownMenuButton2"
                                data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Resources
                        </button>
                        <div class="dropdown-menu" aria-labelledby="dropdownMenuButton2">
                            <a class="dropdown-item" href="<spring:url value="/resource/add"/>">Add</a>
                            <a class="dropdown-item" href="<spring:url value="/resource/find"/>">Find</a>
                        </div>
                    </div>
                </li>

            </ul>
        </div>
    </div>
</nav>