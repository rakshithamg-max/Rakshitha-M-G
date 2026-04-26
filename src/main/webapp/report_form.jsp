 <h2>Report Filter</h2>

<form action="report" method="post">

Enter Category: <input type="text" name="category"><br>
Enter Min Price: <input type="number" name="price"><br>

<button type="submit">Generate</button>

</form>


<hr>

<h2>Top N Products (By Quantity)</h2>

<form action="topProducts" method="post">

Enter N: <input type="number" name="limit" required><br>

<button type="submit">Show Top Products</button>

</form>