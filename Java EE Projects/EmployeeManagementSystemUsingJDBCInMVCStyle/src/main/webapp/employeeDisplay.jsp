<%@page import="java.util.Iterator"%>
<%@page import="com.ems.bean.Employee"%>
<%@page import="java.util.List"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Employee Details using JSP</h2>
<table border="1" class="table table-success table-striped">
<tr>
	<th>Employee Id</th>
	<th>Employee Name</th>
	<th>Employee Salary</th>
</tr>
<%
Object obj = session.getAttribute("listOfEmp");		// get the object from session scope 
List<Employee> listOfEmp = (List<Employee>)obj;		// type casting 
Iterator<Employee> li  = listOfEmp.iterator();
while(li.hasNext()){
	Employee emp = li.next();
	%>
	<tr>
		<td><%=emp.getId()%></td>
		<td><%=emp.getName() %></td>
		<td><%=emp.getSalary() %></td>
	</tr>
	<% 
}
%>

</table>
<br/>
<h2>Employee Details using JSTL</h2>
<table border="1" class="table table-striped">
<tr>
	<th>Employee Id</th>
	<th>Employee Name</th>
	<th>Employee Salary</th>
</tr>

<core:forEach items="${sessionScope.listOfEmp}" var="emp">
	<tr>
		<td><core:out value="${emp.getId()}"></core:out> </td>
		<td><core:out value="${emp.getName()}"></core:out> </td>
		<td><core:out value="${emp.getSalary()}"></core:out> </td>
	</tr>
</core:forEach>
</table>
<a href="index.jsp">Back</a>
</body>
</html>