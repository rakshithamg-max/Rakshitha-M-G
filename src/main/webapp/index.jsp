<!DOCTYPE html>
<html>
<head>
    <title>Product Management System</title>

    <style>
        body {
            font-family: Arial, sans-serif;
            background: linear-gradient(to right, #4facfe, #00f2fe);
            margin: 0;
            padding: 0;
            text-align: center;
        }

        h1 {
            margin-top: 50px;
            color: white;
        }

        .container {
            background: white;
            width: 350px;
            margin: 50px auto;
            padding: 30px;
            border-radius: 12px;
            box-shadow: 0px 0px 15px rgba(0,0,0,0.2);
        }

        a {
            display: block;
            margin: 12px 0;
            padding: 12px;
            text-decoration: none;
            color: white;
            background-color: #007bff;
            border-radius: 6px;
            font-size: 16px;
            transition: 0.3s;
        }

        a:hover {
            background-color: #0056b3;
            transform: scale(1.05);
        }
    </style>
</head>

<body>

    <h1>Product Management System</h1>

    <div class="container">
        <a href="productadd.jsp">Add Product</a>
        <a href="productupdate.jsp">Update Product</a>
        <a href="productdelete.jsp">Delete Product</a>
        <a href="productdisplay.jsp">View Products</a>
        <a href="reports.jsp">Reports</a>
    </div>

</body>
</html>