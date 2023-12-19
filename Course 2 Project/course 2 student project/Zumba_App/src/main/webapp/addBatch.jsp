<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Add Batch</h2>
<form action="BatchController" method="post">
<input type="hidden" name="operation" value="add"><br/>
<label>BatchId</label>
<input type="number" name="batchid"/><br/>
 <label>Typeofbatch</label>
 <input type="radio" name="typeofbatch" value="morning">Morning
<input type="radio" name="typeofbatch" value="evenining">Evening<br/>
 <label>Time</label>
 <select name="time">
 	<option value="7am">7am</option>
 	<option value="8am">8am</option>
 	<option value="9am">9am</option>
 	<option value="7pm">7pm</option>
 	<option value="8am">8pm</option>
 	<option value="9am">9pm</option>
 </select><br/>
 <input type="submit" value="Create Batch"/>
<input type="reset" value="reset"/>
 
</form>
</body>
</html>