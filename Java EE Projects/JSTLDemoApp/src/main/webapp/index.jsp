<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!int a=10,b=20,sum; String name;%>
<%
sum = a+b;
name="Lex";
request.setAttribute("obj", name);
out.println("sum of two number is "+sum);
String names[]={"Ravi","John","Alex","Ramesh","Ajay"};
request.setAttribute("names", names);
%>
<br/>
<div>Sum of two number is <%=a+b %></div>
<div>Sum of two number is <%=100+200 %></div>
<div>Sum of two number is ${10+20}</div>
<br/>
<c:out value="Welcome to JSTL"></c:out>

<c:set var="name" value="Steven" scope="request"></c:set>
<br/>
name is : <c:out value="${requestScope.name}"></c:out>
<br/>
name is : <c:out value="${requestScope.obj}"></c:out>
<br/>
<c:forEach items="${requestScope.names}" var="n">
	Name is : <c:out value="${n}"></c:out><br/>
</c:forEach>
</body>
</html>








