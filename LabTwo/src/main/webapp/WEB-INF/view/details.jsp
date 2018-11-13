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

<h1>Enter trainee details</h1>

	<f:form method="post" action="newTrainee" modelAttribute="t">

	Trainee Name:
	<f:input path="tname"/>
	<f:errors path="tname"></f:errors><br>
	Trainee Location:
	<f:radiobutton path="tlocation" value="Chennai" label="Chennai"/>
	<f:radiobutton path="tlocation" value="Banglore" label="Banglore"/>
	<f:radiobutton path="tlocation" value="Mumbai" label="Mumbai"/>
	<f:radiobutton path="tlocation" value="Pune" label="Pune"/><br>
	
	
	Trainee Domain:
	<f:select path="tdomain" name="course" id="dropdown">
	<option value="dropdown">Please Select</option>
	<option value="JEE Cloud">JEE Cloud</option>
	<option value="SAP">SAP</option>
	<option value="BI">BI</option>
	</f:select>
	
	<input type="submit" value="Add Trainee"/>
</f:form>

</body>
</html>