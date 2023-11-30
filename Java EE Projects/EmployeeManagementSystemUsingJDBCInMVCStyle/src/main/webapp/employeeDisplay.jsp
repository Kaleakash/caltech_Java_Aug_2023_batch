<%@page import="java.util.Iterator"%>
<%@page import="com.ems.bean.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Employee Details</h2>
<table border="1">
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
<a href="index.jsp">Back</a>
</body>
</html>