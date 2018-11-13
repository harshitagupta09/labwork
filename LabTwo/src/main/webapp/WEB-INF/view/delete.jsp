<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Delete Operation</h1>
	<f:form method="post" action="delTrainee" modelAttribute="t">

	Please enter trainee ID:
	<f:input path="tid" />
		<f:errors path="tid"></f:errors>


		<input type="submit" value="delete" />

	</f:form>
</body>
</html>