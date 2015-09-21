<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="/WEB-INF/lib/tld/struts-html.tld" prefix="h" %>
 <%@ taglib uri="/WEB-INF/lib/tld/struts-logic.tld" prefix="l" %>  
 <%@ taglib uri="/WEB-INF/lib/tld/struts-bean.tld" prefix="b" %>
<!DOCTYPE html>
<html>
<head>
<title>Struts?</title>
</head>
<body>
	<h1>Yo Son</h1>
	<l:messagesPresent>	
		<ul>
			<l:iterate id="error">
				<li>
					<b:write name="error"/>
				</li>
			</l:iterate>
		</ul>
	</l:messagesPresent>
	<h:form action="/order/submit.do">
		Name:<h:text property="name"></h:text>
		Toppings:<h:text property="toppings"></h:text>
		<h:submit value="Submit"/>
	</h:form>	 
</body>
</html>