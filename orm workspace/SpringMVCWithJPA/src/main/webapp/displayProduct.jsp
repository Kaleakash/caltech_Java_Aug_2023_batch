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
<h2>All Product Details</h2>
<ul>
	<core:forEach items="${sessionScope.products}" var="product">
		<li>
		Product Id : <core:out value="${product.getPid()}"></core:out>
		Product Name : <core:out value="${product.getPname()}"></core:out>
		Product Price : <core:out value="${product.getPrice()}"></core:out>
		</li>
	</core:forEach>
</ul>
<br/>
<a href="index.jsp">Back</a>
</body>
</html>