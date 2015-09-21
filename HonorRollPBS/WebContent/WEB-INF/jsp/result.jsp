<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Spring MVC</title>
</head>
<body>
	<h3>Submitted Student Information</h3>
	<table>
		<tr>
			<td>ID</td>
			<td>${id}</td>
		</tr>
		<tr>
			<td>First Name</td>
			<td>${firstName}</td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td>${lastName}</td>
		</tr>
		<tr>
			<td>Email</td>
			<td>${email}</td>
		</tr>
		<tr>
			<td>Address</td>
			<td>${address}</td>
		</tr>
		<tr>
			<td>Age</td>
			<td>${age}</td>
		</tr>
		<tr>
			<td>Grade</td>
			<td>${grade}</td>
		</tr>
		<tr>
			<td>Sex</td>
			<td>${sex}</td>
		</tr>
	</table>
</body>
</html>