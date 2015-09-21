<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.eintern.hibernateTest.* , javax.servlet.http.*" %>
<% AuthTest test = (AuthTest)session.getAttribute("authorize");
	if(test == null){
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	String email = request.getParameter("userId");
 %>    
    
    
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Editing</title>
	
	<script src="http://code.jquery.com/jquery-1.9.0.js"></script>
	<script src="http://code.jquery.com/jquery-migrate-1.2.1.js"></script>

	<!-- Bootstrap core CSS -->
    <link href="bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="signin.css" rel="stylesheet">
    
    
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
	<style type="text/css">
    .bs-example{
    	margin: 20px;
    }
	</style>
	
	
	<script type="text/javascript">
		function checkForm(){
					var add = document.getElementById("address");
					var credit = document.getElementById("credit");
					var fname = document.getElementById("fname");
					var lname = document.getElementById("lname");
					var salary = document.getElementById("salary");
					
					
					if(add.value.length == "" || add.value.length == null){
						alert("You must insert a address!");
						add.focus();
						//return false;
					}
					if(credit.value.length == "" || credit.value.length == null){
						alert("You must insert a Credit Score!");
						credit.focus();
						//return false;
					}
					if(fname.value.length == "" || fname.value.length == null){
						alert("You must insert a First Name!");
						fname.focus();
						//return false;
					}
					if(lname.value.length == "" || lname.value.length == null){
						alert("You must insert a Last Name!");
						lname.focus();
						//return false;
					}
					if(salary.value.length == "" || salary.value.length == null){
						alert("You must insert a Salary!");
						salary.focus();
						//return false;
					}
				}	
		</script>



</head>
<body>

	<div class="bs-example">
		<h2 class="form-signin">Edit Credit App of </h2>
		<form  method="GET" action="adminCreditpath">
			<table class="table">
				<tr class="success">
						<th>Username</th>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Address</th>
						<th>Salary</th>
						<th>Credit Score</th>
						<th>Option</th>
					</tr>
				<tr class="info">
					<td  colspan="1"><input type="text" name="Uname" id="Uname" value="<%=email %>" readonly></td>
				
				
					<td  colspan="1"><input type="text" name="fname" id="fname" required pattern="\w+"></td>
				
		
					<td  colspan="1"><input type="text" name="lname" id="lname" required pattern="\w+"></td>
				
					<td  colspan="1"><input type="text" name="address" id="address" ></td>
				
					<td  colspan="1"><input type="number" name="salary" id="salary" required pattern="\w+"></td>
				
					<td  colspan="1"><input type="number" name="credit" id="credit" required pattern="\w+" min="350" max="850"></td>
				
					<td colspan="1"><input  type="submit"  name="submit" onclick="checkForm()"/></td>
				
				</tr>
			</table>
		</form>
	</div>



</body>
</html>