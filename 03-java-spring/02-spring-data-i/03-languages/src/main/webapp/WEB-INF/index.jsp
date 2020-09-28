<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
	rel="stylesheet" 
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" 
	crossorigin="anonymous">
<link rel="stylesheet" href="css/main.css" />
<title>Licenses</title>
</head>
<body>
	<div class="container">
		<br>
		<h1>New Person</h1>
		<br>
		<table class="table table-hover">
			<thead>
				<tr>
					<th>Name</th>
					<th>Creator</th>
					<th>Version</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${ languages }" var="lang">
				<tr>
					<td><a href="/languages/${ lang.id }">${ lang.name }</a></td>
					<td>${ lang.creator }</td>
					<td>${ lang.currentVersion }</td>
					<td>
						<a href="/languages/edit/${lang.id}">Edit</a>
						<a href="/languages/delete/${lang.id}">Delete</a>
					</td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
		<br>
		<h3>New Language</h3>
		
		<form:form action="/" method="post" modelAttribute="language">
		    <div class="form-group">
		        <form:label path="name">Language Name</form:label>
		        <form:errors path="name"/>
		        <form:input class="form-control" path="name"/>
		    </div>
		    <div class="form-group">
		        <form:label path="creator">Creator</form:label>
		        <form:errors path="creator"/>
		        <form:input class="form-control" path="creator"/>
		    </div>
			<div class="form-group">
		        <form:label path="currentVersion">Current Version</form:label>
		        <form:errors path="currentVersion"/>
		        <form:input class="form-control" path="currentVersion"/>
		    </div>
		    <input type="submit" value="Submit"/>
		</form:form>
		
	</div>
</body>
</html>