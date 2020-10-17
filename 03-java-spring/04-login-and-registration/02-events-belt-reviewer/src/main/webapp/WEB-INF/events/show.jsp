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
		
	<title><c:out value="${event.name}"/></title>
</head>
	<body>
		<div id="wrapper" class="text-secondary">
			<h1><c:out value="${event.name}"/></h1>
			<div class="event-detail">
				<h4>Host: ${event.eventCreator.firstName}</h4>
				<h4>Date: ${event.date}</h4>
				<h4>Location: ${event.city}, ${event.state}</h4>
				<h4>Attending: ${event.usersJoined.size()}</h4>
				<table class="table table-hover">
					<thead>
						<tr>
							<th>Name</th>
							<th>Location</th>
						</tr>
					</thead>
					<tbody>
					<c:forEach items="${ event.usersJoined }" var="user">
						<tr>
							<td>${ user.firstName } ${ user.lastName }</td>
							<td>${ user.city }, ${ user.state }</td>
						</tr>
					</c:forEach>
					</tbody>
				</table>
			</div>
			<div class="messages">
				<h3>Message Wall</h3>
				<div class="messages">
				<c:forEach items="${ event.messages }" var="message">
					<p>${ message.messagesCreator.firstName } says: ${ message.comment }</p>
				</c:forEach>
				</div>
				<form action="/events/${ event.id }/comment" method="post">
					<div class="form-group">
						<label for="comment">Add Comment</label>
						<span>${ error }</span>
						<textarea name="comment" id="comment" class="form-control"></textarea>
						<input type="submit" value="Submit"/>
					</div>
				</form>
			</div>
		</div>
	</body>
</html>