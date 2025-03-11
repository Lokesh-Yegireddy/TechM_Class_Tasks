<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile Page</title>
</head>
<body>
 <%
    String username = (String)session.getAttribute("username");
%>
<h1>Welcome, <%= username %>!</h1>
<a href="Transactions">View Transactions Data</a><br>
<a href="UserLogout">Logout</a>

</body>
</html>