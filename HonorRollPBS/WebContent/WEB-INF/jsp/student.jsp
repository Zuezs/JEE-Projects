<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"  %>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Spring MVC</title>
</head>
<body>
	<h3>Student Information</h3>
	<f:form method="POST" action="/HonorRollPBS/addStudent">
		<table>
			<tr>
				<td><f:label path="id">Id</f:label></td>
				<td><f:input path="id"/></td>
			</tr>
			<tr>
				<td><f:label path="firstName">First Name</f:label></td>
				<td><f:input path="firstName"/></td>
			</tr>
			<tr>
				<td><f:label path="lastName">Last Name</f:label></td>
				<td><f:input path="lastName"/></td>
			</tr>
			<tr>
				<td><f:label path="email">Email</f:label></td>
				<td><f:input path="email"/></td>
			</tr>
			<tr>
				<td><f:label path="address">Address</f:label></td>
				<td><f:input path="address"/></td>
			</tr>
			<tr>
				<td><f:label path="age">Age</f:label></td>
				<td><f:input path="age"/></td>
			</tr>
			<tr>
				<td><f:label path="grade">Grade</f:label></td>
				<td><f:input path="grade"/></td>
			</tr>
			<tr>
				<td><f:label path="sex">Sex</f:label></td>
				<td><f:input path="sex"/></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="Submit" />
				</td>
			</tr>
		</table>
	</f:form>
</body>
</html>