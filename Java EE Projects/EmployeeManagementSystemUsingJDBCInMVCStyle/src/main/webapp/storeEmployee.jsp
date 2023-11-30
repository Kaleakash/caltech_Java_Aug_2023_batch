<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Employee Store</h2>
<form action="EmployeeController" method="post">
<label>Employee Id</label>
<input type="number" name="id"><br/>
<label>Employee Name</label>
<input type="text" name="name"><br/>
<label>Employee Salary</label>
<input type="number" name="salary"><br/>
<input type="submit" value="Store Employee"/>
<input type="reset" value="reset"/>
<br/>
<a href="index.jsp">Back</a>
</form>
</body>
</html>