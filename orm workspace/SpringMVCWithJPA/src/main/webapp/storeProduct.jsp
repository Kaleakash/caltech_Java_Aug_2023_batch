<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${requestScope.msg}<br/>
<h2>Add Product</h2>
<form action="storeProduct" method="post">
<label>Product Name</label>
<input type="text" name="pname"/><br/>
<label>Price</label>
<input type="number" name="price"/><br/>
<input type="submit" value="Store Product"/>
<input type="reset" value="reset"/>
</form>
<br/>
<a href="index.jsp">Back</a> 
</body>
</html>