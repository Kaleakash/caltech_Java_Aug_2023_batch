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
<h2>Employee Update Salary</h2>
<form action="EmployeeController" method="post">
	<input type="hidden" name="flag" value="2"><br/>
<label>Employee Id</label>
<input type="number" name="id"><br/>
<label>Employee Salary</label>
<input type="number" name="salary"><br/>
<input type="submit" value="Update Employee"/>
<input type="reset" value="reset"/>
<br/>
<a href="index.jsp">Back</a>
</form>
</body>
</html>