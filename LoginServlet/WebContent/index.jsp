<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
	
	<!-- Pre Loader -->
	
	<!-- <link href="tomatoes.css" rel="stylesheet">
	<script src="js/index.js"></script> -->
	
 <!-- Bootstrap core CSS -->
    <link href="bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="signin.css" rel="stylesheet">

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
          </ul>
        </div><!-- /.nav-collapse -->
      </div><!-- /.container -->
    </nav><!-- /.navbar -->
	
	<!-- Stuff after preloader -->	
		 <div class="container">
			<form class="form-signin" method="POST" action="loginServletpath">
				<h2 align="center" class = "form-signin-heading">Please sign in</h2>
				
				Username: <input type="text" name="username" class="form-control"/><br/>
				Password: <input type="password" name="password"  class="form-control"/><br/>
				<input type="submit" name="Submit" class="form-control"/><br/>
			
				<p align="center">Need to register? <a href="Register.jsp">Click Here!</a></p>
			
			</form>
		</div>

</body>
</html>