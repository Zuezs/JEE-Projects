<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="oracle.jdbc.OracleDriver" %>
<%@page import="oracle.sql.*" %> 
<%@page import="oracle.jdbc.driver.*" %> 
<%@page import="java.sql.*" %>  
  <!DOCTYPE html>
  <html>
  <head>
  
  </head>
  <body>
  
  	<%
	String email = request.getParameter("email");
	Connection conn = null;
	Statement stmt = null;
	ResultSet rset = null;
	try{
	
		
		Class.forName("oracle.jdbc.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "System", "manager");
		int result = 0;
		
		String sql = "SELECT USERNAME FROM AUTH WHERE USERNAME = '"+email+"' " ;
		
		stmt = conn.createStatement();
		rset = stmt.executeQuery(sql);
		
		result = rset.getRow();
		if(result == 0){
			out.println(result);
			}else{
				out.println(result);
			}
	}catch(Exception e){
		e.printStackTrace();
	}
	
	 %>

	<div id="dt_table">
		<table border='4' cellpadding='6' cellspacing='3' width="300px">
			<tr bgcolor="66FF00">
			<th>Email Address</th>
			</tr>
			<tr>
			<% while(rset.next()) {
			
				 out.print(rset.getString("USERNAME")); 
			 } %>
			</tr>
			
		</table></div>
  
  
  
  </body>
  
  </html>  
    
   