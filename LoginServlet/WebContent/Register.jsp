<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="oracle.jdbc.OracleDriver" %>
<%@page import="oracle.sql.*" %> 
<%@page import="oracle.jdbc.driver.*" %> 
<%@page import="java.sql.*" %> 
<%@page import="javax.servlet.*" %>
<%@page import="java.util.*, java.io.*" %> 
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Registration Page</title>
	<script src="http://code.jquery.com/jquery-1.9.0.js"></script>
	<script src="http://code.jquery.com/jquery-migrate-1.2.1.js"></script>

<!-- Bootstrap core CSS -->
    <link href="bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="signin.css" rel="stylesheet">



	<script>
			function checkForm(){
				var pass1 = document.getElementById("Pass");
				var pass2 = document.getElementById("Pass2");
				var first = document.getElementById("firstN");
				var last = document.getElementById("lastN");
				var mail = document.getElementById("mail");
				
				if(pass1.value != pass2.value){
					alert("Passwords must be the same!");
					pass1.focus();
					
				}
				if(first.value.length == "" || first.value.length == null){
					alert("You must insert a First Name!");
					first.focus();
					//return false;
				}
				if(last.value.length == "" || last.value.length == null){
					alert("You must insert a Last Name!");
					last.focus();
					//return false;
				}
				if(mail.value.length == "" || mail.value.length == null){
					mail.focus();
					//return false;
				}
				if(mail.value == pass1.value){
					alert("Your Email && Password cannot be the same!");
					pass1.focus();
					//return false;
				}
				if(pass1.value.length == "" || pass1.value.length == null || pass2.value.length == "" || pass2.value.length == null){
					alert("You must insert a Password!");
					pass1.focus();
					//return false;
				}
			}	
		</script>
		
		 <script type="text/javascript">
		
		$(document).ready(function(){
		
			$('#mail').focusout(avail);
			
		});
		
		
		function avail(){
			//console.log("The value of input: " + $('#mail').val());
			$.ajax({
				type: 'GET',
				url: 'registerServletpath',
				 data:  {
				 	userName : $('#mail').val()
				 },
				 success : function(responseText){
				 	$('#message').html(responseText);
				 }
			}); 
		}
		</script>

</head>
<body>
	
		<div class="container">
		
			<form class="form-signin" method="POST" action="registerServletpath">
				
				<h2 class="form-sigin-heading">Registration Form</h2>
				<table>
					
					<tr>
						<td colspan="2"><input class="form-control" type="text" required pattern="\w+" id="firstN" name="firstname" placeholder="First Name"/></td>
					</tr>
					<tr>
						<td colspan="2"><input class="form-control" type="text" required pattern="\w+" id="lastN" name="lastname" placeholder="Last Name"/></td>
					</tr>
					<tr>
						<td colspan="2"><label style="color:red" id="message"></label></td>
					</tr>
					<tr>
						<td colspan="2"><input class="form-control" type="email" required id="mail" name="email" placeholder="Email address"/></td>
					</tr>
					<tr>
						<td colspan="2"><label style="color:green" >Password: 7 Characters: 1 Upper Case 1 Special Character</label></td>
					</tr>
					<tr>
						<td><input class="form-control" type="password" required pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{7,}" id="Pass" name="password" onchange="confirm_password.pattern = this.value; "  placeholder="Password"/></td>
					</tr>
					<tr>
						
						<td colspan="2"><input class="form-control"  type="password" id="Pass2" required pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{7,}" name="confirm_password" placeholder="Confirm Password"/></td>
					</tr>
					<tr>
						<td  align="center" colspan="2"> <input class="form-control" type="submit" onclick="checkForm()" name="Submit"/></td>
				
					</tr>
				</table>
			</form>
		</div>	
	
</body>
</html>