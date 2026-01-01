<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Get By ID</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB"
          crossorigin="anonymous">

    <style>
        body {
            padding-top: 80px;
            background-color: #f8f9fa;
        }
        .card {
            border-radius: 15px;
        }
    </style>
</head>

<body>

<!-- NAVBAR -->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top shadow">
    <div class="container">
        <a class="navbar-brand fw-bold" href="#">Vastra</a>

        <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                data-bs-target="#navbarNav">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item">
                    <a class="nav-link" href="Vastra.jsp">Register</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="Search.jsp">Search</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" href="SearchById.jsp">Update</a>
                </li>
                <li class="nav-item">
                     <a class="nav-link" href="Delete.jsp">Delete</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<!-- SEARCH FORM -->
<div class="container mt-4">
    <div class="row justify-content-center">
        <div class="col-md-6">

            <div class="card shadow p-4">
                <h4 class="text-center mb-3">Search Outfit by ID</h4>

                <form action="outfit" method="get" class="d-flex gap-2">
                    <input type="number" name="id" class="form-control"
                           placeholder="Enter Outfit ID" required>

                    <button type="submit" class="btn btn-primary">Search</button>
                    <button type="reset" class="btn btn-secondary">Clear</button>
                </form>
            </div>

        </div>
    </div>
</div>

<!-- RESULT -->
<div class="container mt-4">
    <c:if test="${not empty searchId}">
        <div class="row justify-content-center">
            <div class="col-md-6">
                <div class="card shadow p-4">
                    <h5 class="mb-3 text-success">Searched Data</h5>

                    <p><b>Name:</b> ${searchId.name}</p>
                    <p><b>Category:</b> ${searchId.category}</p>
                    <p><b>Brand:</b> ${searchId.brand}</p>
                    <p><b>Price:</b> ₹${searchId.price}</p>
                    <p><b>Size:</b> ${searchId.size}</p>

                    <a class="btn btn-warning mt-3"
                       href="${pageContext.request.contextPath}/getVastraInfo/${searchId.id}">
                        Update Vastra Details
                    </a>
                </div>
                <form action="${pageContext.request.contextPath}/deleteVastra"
                          method="post"
                          onsubmit="return confirm('Are you sure you want to delete?');">

                        <input type="hidden" name="id" value="${searchId.id}">

                        <button type="submit" class="btn btn-danger mt-3">
                            Delete Vastra
                        </button>
                    </form>
            </div>
        </div>
    </c:if>

    <c:if test="${empty searchId}">
        <div class="text-center text-danger mt-4">
            No result found
        </div>
    </c:if>
</div>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
