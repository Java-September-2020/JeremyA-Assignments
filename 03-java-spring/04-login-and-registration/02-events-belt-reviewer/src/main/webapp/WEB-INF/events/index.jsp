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
			<form id="logout" action="/logout">
					<input type="submit" value="Logout"/>
			</form>
			<hr/>
			<h3>This page works by the way.</h3>
			<%-- <div class="float float-left">
				<h3>Tv-Shows</h3>
				<table class="table table-hover">
					<thead>
						<tr class="text-secondary">
							<th>Show</th>
							<th>Network</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${tvshow}" var="tvshow">
							<tr>
								<td>
									<a href="/tvshows/${tvshow.id}">${tvshow.title}</a>
								</td>
								<td>
									<p>${ tvshow.network }</p>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<form action="/tvshows/new">
					<input type="submit" value="Add New Show"/>
				</form>
			</div> --%>
		</div>
	</body>
</html>