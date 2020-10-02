<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
	rel="stylesheet" 
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" 
	crossorigin="anonymous">
<link rel="stylesheet" href="css/main.css" />
<title>Licenses</title>
</head>
<body>
	<div class="container">
		<br>
		<h1>New Person</h1>
		<br>
		<form:form action="/persons" method="post" modelAttribute="person">
		<div class="form-group">
			<form:label path="firstName">First Name</form:label>
			<form:errors path="firstName"/>
			<form:input class="form-control" path="firstName"/>
		</div>
		<div class="form-group">
			<form:label path="lastName">Last Name</form:label>
			<form:errors path="lastName"/>
			<form:input class="form-control" path="lastName"/>
		</div>
		<br>
		<input type="submit" value="Create"/>
		</form:form>	
	</div>
</body>
</html>