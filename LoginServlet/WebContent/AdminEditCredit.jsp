<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*" %> 
<%@page import="javax.servlet.*" %>
<%@page import="java.util.*, java.io.*" %> 
<%@page import="com.eintern.hibernateTest.* , javax.servlet.http.*, com.eintern.hibernate.*" %>

<% AuthTest test = (AuthTest)session.getAttribute("authorize");
	if(test == null){
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

//Instantiate new credApp
	CreditTest cred = new CreditTest();
		
	List <CreditApp> user = new ArrayList<CreditApp>();
	user = cred.showAllStats();
	request.setAttribute("CredResults", user);


 %>    
    
     
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<title>Admin Credit Edit</title>

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
            <li class="active"><a href="AdminHome.jsp">Home</a></li>
            <li><a href="#about">About</a></li>
            <li><a href="LogOut.jsp">Logout</a></li>
          </ul>
        </div><!-- /.nav-collapse -->
      </div><!-- /.container -->
    </nav><!-- /.navbar -->
	

	<h2 align="center">Hi <%= session.getAttribute("theName")%> </h2>	
			
	<div class="bs-example" >		
			
			<table class="table" >
				<tbody>
					<tr class="success">
						<th>Username</th>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Address</th>
						<th>Salary</th>
						<th>Credit Score</th>
						<th>Application Status</th>
						<th> Options</th>
					</tr>
			    	<c:forEach items="${CredResults}" var="row">
			        	<tr class="info"  >
			            	<td colspan="1" ><input  value="${row.userName}" readonly/></td>
			            	<td colspan="1">${row.firstName}</td>
			            	<td colspan="1">${row.lastName}</td>
			            	<td colspan="1">${row.address}</td>
			            	<td colspan="1">${row.salary}</td>
			            	<td colspan="1">${row.creditScore}</td>
			            	<td colspan="1">${row.pending}</td>
			            	<td colspan="1">	
			            	<!-- Form has to go inside for loop inorder for hidden value to attribute to each row -->
			            		<form  method="GET" action="UpdateCred.jsp">
					            	<input type="hidden" name="userId"  value="${row.userName}">
					            	<input type=submit id="edit"  name="edit"  value="Edit">
			        			</form>
			        			<form  method="POST" action="adminCreditpath">
			        				<input type="hidden" name="userId"  value="${row.userName}">
			        				<input type=submit id="delete" name="delete" value="Delete">
			        			</form>
			        		</td>	
			        	</tr>
			    	</c:forEach>
		    	</tbody>
			</table>
		
	</div>	
	

</body>
</html>