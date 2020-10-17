<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>   
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
			<h2><c:out value="${event.name}"/></h2>
			<form:form action="/events/${ event.id }" method="post" modelAttribute="event">
				<input type="hidden" name="_method" value="put">
				<form:hidden value="${ userId }" path="eventCreator"/>
				<div class="form-group">
					<form:label path="name">Name</form:label>
					<form:errors path="name"></form:errors>
					<form:input class="form-control" path="name"></form:input>
				</div>
				<div class="form-group">
					<form:label path="date">Date</form:label>
					<form:errors path="date"></form:errors>
					<form:input class="form-control"  path="date"></form:input>
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
						<c:choose>
							<c:when  test="${ state.equals(event.state) }">
								<option selected value="${ state }">${ state }</option>
							</c:when>
							<c:otherwise>
								<option value="${ state }">${ state }</option>
							</c:otherwise>
						</c:choose>
					</c:forEach>
					</form:select>
			    </div>
			    <input type="submit" value="Update"/>
			</form:form>
		</div>
	</body>
</html>