<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
			<h1><c:out value="${tvshow.title}"/></h1>
			<h4>Network: <strong><c:out value="${tvshow.network}"/></strong></h4>
			<br>
			<form action="/tvshows/${tvshow.id}/edit">
					<input type="submit" value="Edit"/>
			</form>
			<br>
			<form id="rate" class="form-group" method="post">
				<p id="rating">Leave A Rating:</p>
			    <input id="rating-input" class="form-control" type="number" step="0.01" name="rating">
			    <input id="rating-button" type="submit" value="Rate"/>
		    </form>
		</div>
	</body>
</html>