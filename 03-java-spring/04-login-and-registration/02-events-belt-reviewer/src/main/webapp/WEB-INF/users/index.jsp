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
		<link rel="stylesheet" type="text/css" href="/css/main.css">	
		<meta charset="ISO-8859-1">
	<title>Events</title>
</head>
	<body>
		<div id="wrapper" class="text-dark">
			<h2 id="welcome">Welcome</h2>
			<br>
			<form:form id="register" action="/" method="post" modelAttribute="user">
				<h3 >Register</h3>
				<br>
			    <div class="form-group">
			        <form:label path="firstName">First Name</form:label>
			        <form:errors id="errors" path="firstName"/>
			        <form:input class="form-control" path="firstName" />
			    </div>
			    <div class="form-group">
			        <form:label path="lastName">Last Name</form:label>
			        <form:errors id="errors" path="lastName"/>
			        <form:input class="form-control" path="lastName" />
			    </div>
			    <div class="form-group">
			        <form:label path="email">Email</form:label>
			        <form:errors id="errors" path="email"/>
			        <form:input type="email" class="form-control" path="email" />
			    </div>
			    <p id="location">Location</p>
			    <div id="city" class="form-group">
			        <form:errors id="errors" path="city"/>
			        <form:input class="form-control" path="city" />
			    </div>
			    <div id="state" class="form-group">
			        <form:errors id="errors" path="state"/>
			        <form:select path="state">
					<c:forEach items="${ states }" var="state">
						<option value="${ state }">${ state }</option>
					</c:forEach>
					</form:select>
			    </div>
			    <div class="form-group">
			        <form:label path="password">Password</form:label>
			        <form:errors id="errors" path="password"/>
			        <form:password class="form-control" path="password" />
			    </div>
			    <div class="form-group">
			        <form:label path="passwordConfirmation">Confirm Password</form:label>
			        <form:errors id="errors" path="passwordConfirmation"/>
			        <form:password class="form-control" path="passwordConfirmation" />
			    </div>
			    <input type="submit" value="Register"/>
			</form:form>
			<form id="login" action="/login" method="post">
				<h3>Login</h3>
				<br>
				<span id="errors">${ error }</span>
				<div class="form-group">
					<label for="email">Email</label>
					<input name="email" id="email" class="form-control" />
				</div>
				<div class="form-group">
			        <label for="password">Password</label>
			        <input type="password" name="password" id="password" class="form-control" />		        
			    </div>
			    <input type="submit" value="Login"/>
			</form>
		</div>
	</body>
</html>