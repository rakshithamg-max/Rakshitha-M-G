 <%@ page language="java" contentType="text/html; charset=UTF-8" %>
<html>
<head>
<title>Session Input</title>
</head>
<body>

<h2>Enter your name and session time (in seconds)</h2>

<form action="welcome.jsp" method="post">
Name: <input type="text" name="username" required><br><br>
Session Time: <input type="number" name="time" required><br><br>
<input type="submit" value="Submit">
</form>

</body>
</html>