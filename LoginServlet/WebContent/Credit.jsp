<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.eintern.hibernateTest.* , javax.servlet.http.*" %>
<% AuthTest test = (AuthTest)session.getAttribute("authorize");
	if(test == null){
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}


 %>    
    
    
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Credit Application</title>
	
	<script src="http://code.jquery.com/jquery-1.9.0.js"></script>
	<script src="http://code.jquery.com/jquery-migrate-1.2.1.js"></script>

<!-- Bootstrap core CSS -->
    <link href="bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="signin.css" rel="stylesheet">
    
    <script>
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

	<nav class="navbar navbar-fixed-top navbar-inverse">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">Credit Manangment Application</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="Success.jsp">Home</a></li>
            <li><a href="#about">About</a></li>
            <li><a href="LogOut.jsp">Logout</a></li>
          </ul>
        </div><!-- /.nav-collapse -->
      </div><!-- /.container -->
    </nav><!-- /.navbar -->


	<div class="container">
		<form class="form-signin" method="POST" action="creditServletpath">
			<table>
				<tr>
					<td colspan="2"><input class="form-control" type="text" required pattern="\w+" id="email" name="email" value="<%= session.getAttribute("theName")  %>" placeholder=" <%= session.getAttribute("theName")  %>" readonly/></td>
				</tr>
				<tr>
					<td colspan="2"><input class="form-control" type="text" required pattern="\w+" id="fname" name="fname" placeholder="First Name"/></td>
				</tr>
				<tr>
					<td colspan="2"><input class="form-control" type="text" required pattern="\w+" id="lname" name="lname" placeholder="Last Name"/></td>
				</tr>
				<tr>
					<td colspan="2"><input class="form-control" type="text" required id="address" name="address" placeholder="Address"/></td>
				</tr>
				<tr>
					<td colspan="2"><input class="form-control" type="number" required pattern="\w+" id="salary" name="salary" placeholder="Salary"/></td>
				</tr>
				<tr>
					<td colspan="2"><input class="form-control" type="number" required pattern="\w+" id="credit" name="credit" min="350" max="850" placeholder="Credit Score"/></td>
				</tr>
				<tr>
					<td  align="center" colspan="2"> <input class="form-control" type="submit" onclick="checkForm()" name="Submit"/></td>
				</tr>
			</table>
		</form>
	</div>

</body>
</html>