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
	<f:form method="POST" action="addStudent.yogibear">
		<table>
			<%-- <tr>
				<td><f:label path="studentId">Id:</f:label></td>
				<td><f:input type="number" min="0" path="studentId"  /></td>
			</tr>  --%>
			<tr>
				<td><f:label path="firstName">First Name </f:label></td>
				<td><f:input path="firstName"/></td>
			</tr>
			<tr>
				<td><f:label path="lastName">Last Name</f:label></td>
				<td><f:input path="lastName"/></td>
			</tr>
			<tr>
				<td><f:label path="email">Email</f:label></td>
				<td><f:input type="email" path="email"/></td>
			</tr>
			<tr>
				<td><f:label path="address">Address</f:label></td>
				<td><f:input path="address"/></td>
			</tr>
			<tr>
				<td><f:label path="age">Age</f:label></td>
				<td><f:input type="number" min="0" path="age"/></td>
			</tr> 
			<tr>
				<td><f:label path="grade">Grade</f:label></td>
				<td><f:input type="number" min="0" path="grade"/></td>
			</tr>
			<tr>
				<td><f:label path="sex">Sex</f:label></td>
				<td>
					<f:radiobutton path="sex" value="M"/>Male
					<f:radiobutton path="sex" value="F"/>Female
				</td>
			</tr> 
			<tr>
				<td><f:label path="studentRole">Role</f:label></td>
				<td><f:input type="number" min="1" max="4" path="studentRole"  /></td>
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