<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>List of orders</title>
	</head>
	<body>
		<p> Offer: "${offer}"</p>
		
		<table>
			<tr>
				<th>Name</th><th>Toppings</th>
			</tr>
			<tr>

			</tr>
			<c:forEach items="${orders}" var="o">
				<tr>
					<td>${o.name}</td>
					<td>${o.toppings}</td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>