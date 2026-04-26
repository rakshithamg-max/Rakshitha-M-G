<!DOCTYPE html>
<html>
<head>
    <title>Add Product</title>

    <style>
        body {
            font-family: Arial;
            background: linear-gradient(to right, #36d1dc, #5b86e5);
        }

        .container {
            width: 400px;
            margin: 60px auto;
            background: white;
            padding: 25px;
            border-radius: 10px;
            text-align: center;
        }

        input {
            width: 90%;
            padding: 10px;
            margin: 8px;
        }

        button {
            padding: 10px;
            background: green;
            color: white;
            border: none;
        }
    </style>
</head>

<body>

<div class="container">

<h2>Add Product</h2>

<form action="add" method="post">

<input type="number" name="id" placeholder="Product ID" required>
<input type="text" name="name" placeholder="Name" required>
<input type="text" name="category" placeholder="Category" required>
<input type="number" name="price" placeholder="Price" required>
<input type="number" name="quantity" placeholder="Quantity" required>

<button type="submit">Add</button>

</form>

</div>

</body>
</html>