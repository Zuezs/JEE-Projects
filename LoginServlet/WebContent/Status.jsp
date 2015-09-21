<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.eintern.hibernateTest.* , javax.servlet.http.* , com.eintern.hibernate.*" %>

<% AuthTest test = (AuthTest)session.getAttribute("authorize");
	if(test == null){
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	CreditApp user = new CreditApp();

	CreditTest cred = new CreditTest();
	CreditApp app = new CreditApp();
	
	app = cred.showStatus((String)session.getAttribute("theName")); 

	request.setAttribute("Status", app);

 %>    
     
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Credit Status</title>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
	
	
	<!-- <script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
	<script src="pretty-doughtnut.js"></script>
	<script src="http://cdnjs.cloudflare.com/ajax/libs/Chart.js/1.0.1/Chart.min.js"></script>
	
	new stuff
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<script src="js/jquery.diagram.js"></script> -->
	

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


	<div class="bs-example">
		<h2 class="form-signin">Status of Application</h2>
		
			<table class="table">
				<tr class="success">
						<th>Username</th>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Address</th>
						<th>Salary</th>
						<th>Credit Score</th>
						<th>Application Status</th>
					</tr>
					<%-- <c:forEach items="${Status}" var="row"> --%>
			        	<tr class="info"  >
			            	<td colspan="1" ><input  value='<%=session.getAttribute("theName") %>' readonly/></td>
			            	<td colspan="1"><%=app.getFirstName() %></td>
			            	<td colspan="1"><%=app.getLastName() %></td>
			            	<td colspan="1"><%=app.getAddress() %></td>
			            	<td colspan="1"><%=app.getSalary() %></td>
			            	<td colspan="1"><%=app.getCreditScore() %></td>
			            	<td colspan="1"><%=app.getPending() %></td>
			        	</tr>
			    	<%-- </c:forEach> --%>
			</table>
	
	</div>
	
			
	
	
	
</body>
</html>