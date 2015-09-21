<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %> 
   
<!DOCTYPE html>
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Purchase Histroy</title>
	</head>
	<body>
		<h1>Order History</h1>
		<table>
			<logic:iterate id="item" name="orders">
				<tr>
					<td><bean:write name="item"/></td>
				</tr>	
			</logic:iterate>
		</table>
	</body>
</html>