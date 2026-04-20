<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<html>
<head>
<title>Student Result Form</title>

<script>
function validate() {
    var r = document.getElementById("roll").value;
    var n = document.getElementById("name").value;
    var s1 = document.getElementById("s1").value;
    var s2 = document.getElementById("s2").value;
    var s3 = document.getElementById("s3").value;
    var s4 = document.getElementById("s4").value;
    var s5 = document.getElementById("s5").value;

    if (r=="" || n=="" || s1=="" || s2=="" || s3=="" || s4=="" || s5=="") {
        alert("All fields are required");
        return false;
    }

    return true;
}
</script>

</head>
<body>

<h2>Student Marks Entry</h2>

<form action="ResultServlet" method="post" onsubmit="return validate()">

Roll No: <input type="text" id="roll" name="roll"><br><br>
Name: <input type="text" id="name" name="name"><br><br>

Sub1: <input type="number" id="s1" name="s1"><br><br>
Sub2: <input type="number" id="s2" name="s2"><br><br>
Sub3: <input type="number" id="s3" name="s3"><br><br>
Sub4: <input type="number" id="s4" name="s4"><br><br>
Sub5: <input type="number" id="s5" name="s5"><br><br>

<input type="submit" value="Calculate Result">

</form>

</body>
</html> 