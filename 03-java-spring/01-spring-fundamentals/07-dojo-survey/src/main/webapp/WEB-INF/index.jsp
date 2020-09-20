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
	<title>Survey</title>
</head>
	<body>
		<div id="wrapper">
			<form method="post" action="/survey">
				<p>Name: <input type="text" id="input-1" name="name"/></p>
				<p>Dojo Location: 
					<select name="location" id="input-2">
					  <option>San Jose</option>
					  <option>Mountain View</option>
					  <option>Dallas</option>
					  <option>Mars</option>
					</select>
				</p>
				<p>Favorite Language: 
					<select name="language" id="input-3">
					  <option>Java</option>
					  <option>Rust</option>
					  <option>Swift</option>
					  <option>Python</option>
					</select>
				</p>
				<p id="commentword">Comment (optional):</p>	
				<textarea id="comment" name="comment"></textarea>
				<br>				
				<input type="submit" id="submit" value="Submit"/>
			</form>	
		</div>
	</body>
</html>