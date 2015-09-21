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
			<td>${student.studentId}</td>
		</tr> 
		<tr>
			<td>First Name</td>
			<td>${student.firstName}</td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td>${student.lastName}</td>
		</tr>
		<tr>
			<td>Email</td>
			<td>${student.email}</td>
		</tr>
		<tr>
			<td>Address</td>
			<td>${student.address}</td>
		</tr>
		<tr>
			<td>Age</td>
			<td>${student.age}</td>
		</tr> 
		<tr>
			<td>Grade</td>
			<td>${student.grade}</td>
		</tr>
		<tr>
			<td>Sex</td>
			<td>${student.sex}</td>
		</tr> 
		<tr>
			<td>Role</td>
			<td>${student.studentRole}</td>
		</tr> 
	</table>
	
	<a href="index.jsp">Go Back Home</a>
</body>
</html>