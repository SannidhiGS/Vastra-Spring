<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Vastra</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB"
          crossorigin="anonymous">
</head>
<body class="bg-light">
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
            </ul>
        </div>
    </div>
</nav>
<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-6">

            <h2 class="text-center mb-4">Vastra Clothing Form</h2>

            <form action="vastra" method="post">

                <div class="mb-3">
                    <label for="name" class="form-label">Cloth Name</label>
                    <input type="text" class="form-control" id="name" name="name" required>
                </div>

                <div class="mb-3">
                    <label class="form-label">Cloth Category</label>
                    <select class="form-select" name="category" required>
                        <option value="">Select the Category</option>
                        <option value="Casual Wear">Casual Wear</option>
                        <option value="Office Wear">Office Wear</option>
                        <option value="Ethnic Wear">Ethnic Wear</option>
                        <option value="Night Wear">Night Wear</option>
                    </select>
                </div>

                <div class="mb-3">
                    <label for="brand" class="form-label">Cloth Brand</label>
                    <input type="text" class="form-control" id="brand" name="brand" required>
                </div>
                <div class="mb-3">
                    <label for="price" class="form-label">Cloth Price</label>
                    <input type="number" class="form-control" id="price" name="price" required>
                </div>

                <div class="mb-3">
                    <label class="form-label">Cloth Size</label>
                    <select class="form-select" name="size" required>
                        <option value="">Select the Size</option>
                        <option value="S">S</option>
                        <option value="M">M</option>
                        <option value="L">L</option>
                        <option value="XL">XL</option>
                        <option value="2XL">2XL</option>
                    </select>
                </div>
                <div class="d-grid">
                    <button type="submit" class="btn btn-primary">Submit</button>
                </div>
            </form>
        </div>
    </div>
</div>

</body>
</html>
