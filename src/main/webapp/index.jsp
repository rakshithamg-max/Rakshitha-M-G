 <%@ page language="java" contentType="text/html; charset=UTF-8" %>
<html>
<head>
<title>User Form</title>

<script>
function validate() {
    var u = document.getElementById("username").value;
    var e = document.getElementById("email").value;
    var d = document.getElementById("designation").value;

    if (u == "" || e == "" || d == "") {
        alert("All fields are required");
        return false;
    }

    var emailPattern = /^[^ ]+@[^ ]+\.[a-z]{2,3}$/;
    if (!emailPattern.test(e)) {
        alert("Enter valid email");
        return false;
    }

    return true;
}
</script>

</head>
<body>

<h2>User Details Form</h2>

<form action="UserDataServlet" method="post" onsubmit="return validate()">
Username: <input type="text" id="username" name="username"><br><br>
Email: <input type="text" id="email" name="email"><br><br>
Designation: <input type="text" id="designation" name="designation"><br><br>

<input type="submit" value="Submit">
</form>

</body>
</html>