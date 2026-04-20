 <%@ page language="java" contentType="text/html; charset=UTF-8" %>
<html>
<head>
<title>Welcome</title>
</head>
<body>

<%
String name = request.getParameter("username");
String timeStr = request.getParameter("time");

if (name != null && timeStr != null) {
    int t = Integer.parseInt(timeStr);
    session.setAttribute("user", name);
    session.setMaxInactiveInterval(t);
}

String user = (String) session.getAttribute("user");

if (user != null) {
%>

<h2 style="color:green;">Hello <%= user %>!</h2>
<p>Session set for <%= session.getMaxInactiveInterval() %> seconds</p>

<a href="check.jsp">Click here to check session</a>

<%
} else {
%>

<h2 style="color:red;">Session expired! Please login again.</h2>
<a href="index.jsp">Go Back</a>

<%
}
%>

</body>
</html>