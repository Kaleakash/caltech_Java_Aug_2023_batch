<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Add Batch</h2>
<form action="ParticipantController" method="post">
<input type="hidden" name="operation" value="add"><br/>
<label>ParticipantId</label>
<input type="number" name="participantid"/><br/>
<label>Name</label>
<input type="text" name="pname"/><br/>
<label>Age</label>
<input type="number" name="age"/><br/>
<label>PhoneNumber</label>
<input type="number" name="phonenumber"/><br/>
 <label>Batch Id</label>
 <select name="batchid">
 <option>--Select Batch--</option>
 <core:forEach items="${sessionScope.batchInfo}" var="batch">
 		<option value="${batch.getBatchid()}">${batch.getBatchid()}</option>
 </core:forEach>
 
 </select> 
 <br/>
 <input type="submit" value="Add Participants"/>
<input type="reset" value="reset"/>
 
</form>
</body>
</html>