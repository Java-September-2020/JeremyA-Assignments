<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 

<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" type="text/css" href="/css/main.css">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" 
    integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" 
    crossorigin="anonymous">

<meta charset="ISO-8859-1">
<title>Create Tv Show</title>
</head>
<body>
	<div id="wrapper">
		<h2>Create new show</h2>
			<form:form action="/tvshows/new" method="post" modelAttribute="newShow">
			    <form:hidden path="showsAdder" value="${user.id}" />
				<div class="form-group">
					<form:label path="title">Title</form:label>
					<form:errors path="title"></form:errors>
					<form:input class="form-control" path="title"></form:input>
				</div>
				<div class="form-group">
					<form:label path="network">Network</form:label>
					<form:errors path="network"></form:errors>
					<form:input class="form-control" path="network"></form:input>
				</div>
			    	<input type="submit" value="Create"/>
		</form:form>
		
	</div>
</body>
</html>