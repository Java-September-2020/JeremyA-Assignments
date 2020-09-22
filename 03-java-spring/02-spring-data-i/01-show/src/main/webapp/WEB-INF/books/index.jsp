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
	<title>Books</title>
</head>
	<body>
		<div id="wrapper">
			<h1>All Books</h1>
			<table>
			    <thead>
			        <tr>
			            <th>Title</th>
			            <th>Description</th>
			            <th>Language</th>
			            <th>Number of Pages</th>
			        </tr>
			    </thead>
			    <tbody>
			        <c:forEach items="${books}" var="book">
			        <tr>
			            <td><c:out value="${book.title}"/></td>
			            <td><c:out value="${book.description}"/></td>
			            <td><c:out value="${book.language}"/></td>
			            <td><c:out value="${book.numberOfPages}"/></td>
			        </tr>
			        </c:forEach>
			    </tbody>
			</table>
			<a href="/books/new">New Book</a>
		</div>
	</body>
</html>