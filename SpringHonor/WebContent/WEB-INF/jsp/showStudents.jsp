<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student list</title>
</head>
<body>
	<table>
	<c:forEach items="${student}" var="row">
		<tr>
			<td>ID</td>
			<td>${row.studentId}</td>
		</tr> 
		<tr>
			<td>First Name</td>
			<td>${row.firstName}</td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td>${row.lastName}</td>
		</tr>
		<tr>
			<td>Email</td>
			<td>${row.email}</td>
		</tr>
		<tr>
			<td>Address</td>
			<td>${row.address}</td>
		</tr>
		<tr>
			<td>Age</td>
			<td>${row.age}</td>
		</tr> 
		<tr>
			<td>Grade</td>
			<td>${row.grade}</td>
		</tr>
		<tr>
			<td>Sex</td>
			<td>${row.sex}</td>
		</tr> 
		<tr>
			<td>Role</td>
			<td>${row.studentRole}</td>
		</tr> 
		<tr>
			<td>
				<form  method="GET" action="editStudent.yogibear">
					<input type="hidden" name="editStudent"  value="${row.studentId}">
					<input type="submit" id=${row.studentId}  name="edit"  value="Edit">
			    </form>
			</td> 
			<td>   
			    <form  method="GET" action="deleteStudent.yogibear">
			        <input type="hidden" id="delete" name="deleteStudent"  value="${row.studentId}" />
			        <input type="submit" name="delete" value="${row.studentId}" />
			    </form>
			</td>
		</tr>
		</c:forEach>
	</table>
	
	
	<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal" data-whatever="@mdo">Open modal for @mdo</button>
</body>
</html>