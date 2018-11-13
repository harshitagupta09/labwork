<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Login Page</h1>
	
	<f:form method="post" action="getRecord" modelAttribute="admin">

	Username:
	<f:input path="uname"/>
	<f:errors path="uname"></f:errors><br>
	Password:
	<f:input path="password"/>
	<f:errors path="password"></f:errors><br>
	
	
	<input type="submit" value="Submit"/>
</f:form>
	
</body>
</html>