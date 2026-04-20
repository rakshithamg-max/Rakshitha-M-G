 <%@ page language="java" contentType="text/html; charset=UTF-8" %>
<html>
<head>
<title>Check Session</title>
</head>
<body>

<%
String user = (String) session.getAttribute("user");

if (user != null) {
%>

<h2 style="color:blue;">Session Active</h2>
<h3>Hello <%= user %></h3>

<%
} else {
%>

<h2 style="color:red;">Session Expired!</h2>
<a href="index.jsp">Login Again</a>

<%
}
%>

</body>
</html>