<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
//String fname = (String)request.getAttribute("obj");	// receive the value from request scope 
String fname = (String)session.getAttribute("obj");
out.println("<br/>In JSP Page ");
out.println("Name is "+fname);
%>
</body>
</html>