<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" type="text/css" href="/css/main.css">	
		<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
			rel="stylesheet" >
		<meta charset="ISO-8859-1">
	<title>Events</title>
</head>
	<body>
		<div id="wrapper" class="text-dark">
			<h2 id="welcome-ninja">Welcome, Ninja</h2>
			<p>Here are some of the events in your state:</p>
			<%-- <form id="logout" action="/logout">
					<input type="submit" value="Logout"/>
			</form> --%>
			<table>
				<thead>
					<th>Name</th>
					<th>Date</th>
					<th>Location</th>
					<th>Host</th>
					<th>Action/Status</th>
				</thead>
				<tbody>
				<c:forEach items="${userStates}" var="event">
					<tr>
						<td><a href="/events/${event.id}">${event.name }</a></td>
						<td>${ event.eventDate }</td>
						<td>${ event.city }</td>
						<td>${ event.eventCreator.firstName }</td>
					</tr>
				</c:forEach>
				</tbody>
			</table>
			<br>
			<p>Here are some of the events in other states.</p>
			
		</div>
	</body>
</html>