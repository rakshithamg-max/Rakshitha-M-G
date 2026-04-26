<!DOCTYPE html>
<html>
<head>
<title>Update Product</title>
<link rel="stylesheet" href="css/style.css">
</head>

<body>

<div class="container">

<h2>Update Product</h2>

<form action="update" method="post">

<input type="number" name="id" placeholder="Product ID" required>
<input type="text" name="name" placeholder="New Product Name" required>
<input type="text" name="category" placeholder="New Category" required>
<input type="number" name="price" placeholder="New Price" required>
<input type="number" name="quantity" placeholder="New Quantity" required>

<button type="submit">Update Product</button>

</form>

<a href="index.jsp">Back to Home</a>

</div>

</body>
</html>