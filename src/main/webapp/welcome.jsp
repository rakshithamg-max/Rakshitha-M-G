 <%@ page language="java" contentType="text/html; charset=UTF-8" %>
<html>
<head>
<title>Session Output</title>
</head>
<body>

<%
String name = request.getParameter("username");

if (name != null) {
    session.setAttribute("user", name);
    session.setMaxInactiveInterval(60);
}

String user = (String) session.getAttribute("user");

if (user != null) {
%>

<h2 style="color:green;">Hello <%= user %>!</h2>
<p>Session will expire in 60 seconds</p>

<%
} else {
%>

<h2 style="color:red;">Session expired! Please enter your name again.</h2>
<a href="index.jsp">Go Back</a>

<%
}
%>

</body>
</html>