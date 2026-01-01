<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Vastra Home</title>

    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB"
          crossorigin="anonymous">

    <style>
        body {
            min-height: 100vh;
            background: linear-gradient(135deg, #667eea, #764ba2);
            color: white;
        }
        .content-box {
            margin-top: 100px;
            background: rgba(255, 255, 255, 0.15);
            padding: 40px;
            border-radius: 15px;
            box-shadow: 0 8px 25px rgba(0,0,0,0.2);
            backdrop-filter: blur(8px);
        }
        a.btn-custom {
            width: 180px;
            margin: 10px;
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
                    <a class="nav-link" href="SearchById.jsp">Update</a>
                </li>
                <li class="nav-item">
                   <a class="nav-link" href="Delete.jsp">Delete</a>
                 </li>
            </ul>
        </div>
    </div>
</nav>

<!-- CONTENT -->
<div class="container text-center">
    <div class="content-box mx-auto col-md-8">
        <h1 class="mb-3 fw-bold">Welcome to Vastra</h1>
        <p class="mb-4 fs-5">
            Manage your clothing inventory efficiently with style.
        </p>

        <a href="Vastra.jsp" class="btn btn-light btn-lg btn-custom">Register</a>
        <a href="Search.jsp" class="btn btn-outline-light btn-lg btn-custom">Search</a>
        <a href="SearchById.jsp" class="btn btn-warning btn-lg btn-custom">Update</a>
        <a href="Delete.jsp" class="btn btn-warning btn-lg btn-custom">Delete</a>
    </div>
</div>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
