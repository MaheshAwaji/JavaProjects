<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body >
	<%
	String name = (String) request.getAttribute("name");
	%>
	<h1>This Home Page</h1>
	<h1>Called by Home Controller</h1>
	<h1 >
		My Name is
		<%=name%></h1>
</body>
</html>