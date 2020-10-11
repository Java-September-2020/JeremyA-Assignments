<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>   
<!DOCTYPE html>
<html>
	<head>
	<link rel="stylesheet" type="text/css" href="/css/main.css">
		<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
			rel="stylesheet" 
			integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" 
			crossorigin="anonymous">
		<meta charset="ISO-8859-1">
	<title><c:out value="${tvshow.title}"/></title>
</head>
	<body>
		<div id="wrapper" class="text-secondary">
			<h2><c:out value="${tvshow.title}"/></h2>
			<br>
			<form:form method="post" action="/tvshows/${tvshow.id}/edit" modelAttribute="newShow">
				<input type="hidden" name="_method" value="put">
			    <div class="form-group">
			    <form:label path="title">Title
			    <form:errors path="title"/>
			    <form:input class="form-control" 
			    value="${tvshow.title}"
			    path="title"/></form:label>
			    </div>
			    <div class="form-group">
			    <form:label path="network">Network
			    <form:errors path="network"/>
			    <form:input class="form-control"
			    value="${tvshow.network}"
			    path="network"/></form:label>
			    </div>
			    <br>
			    <input type="submit" value="Update"/>
			</form:form>
			<br>
			<form:form action="/tvshows/${tvshow.id}/delete" method="post">
			        <input type="hidden" name="_method" value="delete">
			    	<input type="submit" value="Delete"/>
		</form:form>
		</div>
	</body>
</html>