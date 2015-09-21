<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="WEB-INF/lib/tld/struts-html.tld" prefix="h"%>
<!DOCTYPE html>
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Insert title here</title>
	</head>
	<body>
		<h:form action="/order/history.do">
			<h:errors/>
			<label>Name:</label><h:text property="name"/>
			<h:submit value="Check order history"/>
		</h:form>
	</body>
</html>