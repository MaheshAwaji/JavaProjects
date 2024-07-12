<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>About Page</title>
</head>
<body>

	<%
	/* String name = (String) request.getAttribute("name"); */
	/* LocalDateTime time=(LocalDateTime)request.getAttribute("time"); */
	//I am using Expression Language ${  id name from controller}
	%>
	<h1>This About Page</h1>
	<h1>Called by About Controller</h1>
	<h1>
		my name is
		<%-- <%=name%> --%>
		${name}

	</h1>
	<h1>Time is
	<%-- <%=time %> --%>
	 ${time}
	
	</h1>
</body>
</html>