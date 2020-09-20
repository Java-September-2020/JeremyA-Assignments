<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 

<!DOCTYPE html>
<html>
	<head>
		<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
			rel="stylesheet" 
			integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" 
			crossorigin="anonymous">	
		<meta charset="ISO-8859-1">
		<link rel="stylesheet" href="css/main.css">
	<title>The Code</title>
</head>
	<body>
		<div id="wrapper">
			<form method="post" action="/findcode">
				<span>${ error }</span>
				<h3 id="question">What is the code?</h3>
				<input id="input" type="text" name="guess" placeholder="What is the code?" />
				<br>
				<input type="submit"id="submit" value="Try Code"/>
			</form>	
		</div>
	</body>
</html>