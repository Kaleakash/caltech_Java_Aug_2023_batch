<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Welcome to JSP using html tag</h2>
<%!int a,b,sum; %>
<%
	//int a;
	//int b;
	//int sum = a+b;
	a=100;
	b=200;
	sum = a+b;
	out.println("Welcome to JSP Page");
	out.println("Sum of two number is "+sum);
	out.println("<br/>");
	out.println("<font color=red>Sum of two number is "+sum+"</font>");
%>
<br/>
<p>Sum of two number is <%=10+20 %></p>
<font color=red size=6>The sum of <%=a %> and <%=b %> is <%=sum %></font>
<br/>
<a href="login.jsp">Login Page</a><br/>
<a href="loginFromDb.jsp">Login page From Db</a>
</body>
</html>






