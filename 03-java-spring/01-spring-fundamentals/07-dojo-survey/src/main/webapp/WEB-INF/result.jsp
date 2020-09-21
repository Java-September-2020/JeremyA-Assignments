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
		<link rel="stylesheet" href="css/result.css">
	<title>Survey</title>
</head>
	<body>
		<div id="wrapper">	
			<form>
				<div id="result">
					<h3>Submitted Info:</h3>
					<br>
					<p >Name: 
						<span id="result-1">
						<c:out value="${ name }"/>
						</span>
					</p>
					<br>
					<p>Dojo Location: 
						<span id="result-2">
						<c:out value="${ location }"/>
						</span>
					</p>
					<br>
					<p>Favorite Language: 
						<span id="result-3">
						<c:out value="${ language }"/>
						</span>
					</p>
					<br>
					<p>Comment: 
						<span id="result-4">
						<c:out value="${ comment }"/>
						</span>
					</p>
				</div>
				<!-- Below button for aesthetic purposes -->
				<input type="submit" id="back" value="Back"/>
			</form>
		</div>
	</body>
</html>