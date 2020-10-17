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
			<h2 id="welcome-ninja">Welcome, Ninja ${ user.firstName }</h2>
			<h3>Here are some of the events in your state of ${user.state}:</h3>
			<%-- <form id="logout" action="/logout">
					<input type="submit" value="Logout"/>
			</form> --%>
			<table>
				<thead>
					<th>Name</th>
					<th>Date</th>
					<th>City</th>
					<th>Host</th>
					<th>Action/Status</th>
				</thead>
				<tbody>
				<c:forEach items="${userStates}" var="event">
					<tr>
						<td><a href="/events/${event.id}">${event.name }</a></td>
						<td>${ event.date }</td>
						<td>${ event.city }</td>
						<td>${ event.eventCreator.firstName }</td>
						<td>
							<c:choose>
								<c:when test="${event.eventCreator.id == user.id}">
									<a href="/events/${event.id}/edit">Edit</a>
									<a href="/events/delete/${event.id}">Delete</a>
								</c:when>
								<c:otherwise>
									<c:choose>
										<c:when test="${event.usersJoined.contains(user)}">
											<span>Joined <a href="/events/${event.id}/cancel">Cancel</a></span>
										</c:when>
										<c:otherwise>
											<a href="/events/${event.id}/join">Join</a>
										</c:otherwise>
									</c:choose>
								</c:otherwise>
							</c:choose>
						</td>
					</tr>
				</c:forEach>
				</tbody>
			</table>
			<br>
			<h3>Here are some of the events in other states.</h3>
			<table>
				<thead>
					<th>Name</th>
					<th>Date</th>
					<th>City</th>
					<th>State</th>
					<th>Host</th>
					<th>Action/Status</th>
				</thead>
				<tbody>
				<c:forEach items="${otherStates}" var="event">
					<tr>
						<td><a href="/events/${event.id}">${event.name }</a></td>
						<td>${ event.date }</td>
						<td>${ event.city }</td>
						<td>${ event.state }</td>
						<td>${ event.eventCreator.firstName }</td>
						<td>
							<c:choose>
								<c:when test="${event.eventCreator.id == user.id}">
									<a href="/events/${event.id}/edit">Edit</a>
									<a href="/events/delete/${event.id}">Delete</a>
								</c:when>
								<c:otherwise>
									<c:choose>
										<c:when test="${event.usersJoined.contains(user)}">
											<span>Joined <a href="/events/${event.id}/cancel">Cancel</a></span>
										</c:when>
										<c:otherwise>
											<a href="/events/${event.id}/join">Join</a>
										</c:otherwise>
									</c:choose>
								</c:otherwise>
							</c:choose>
						</td>
					</tr>
				</c:forEach>
				</tbody>
			</table>
			<div class="new-event float float-right">
				<p>Plan an Event:</p>
				<form:form action="/events" method="post" modelAttribute="event">
					<form:hidden value="${ user.id }" path="eventCreator"/>
					<div class="form-group">
						<form:label path="name">Name</form:label>
						<form:errors path="name"></form:errors>
						<form:input class="form-control" path="name"></form:input>
					</div>
					<div class="form-group">
						<form:label path="date">Date</form:label>
						<form:errors path="date"></form:errors>
						<form:input class="form-control" path="date"></form:input>
					</div>
					 <div class="form-group">
				        <form:label path="city">City</form:label>
				        <form:errors path="city"/>
				        <form:input class="form-control" path="city" />
				    </div>
				    <div class="form-group">
				        <form:label path="state">State</form:label>
				        <form:errors path="state"/>
						<form:select class="form-control" path="state">
						<c:forEach items="${ states }" var="state">
							<option value="${ state }">${ state }</option>
						</c:forEach>
						</form:select>
				    </div>
				    <input type="submit" value="Create Event"/>
			</form:form>
			</div>
		</div>
	</body>
</html>