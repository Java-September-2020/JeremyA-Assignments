<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
	rel="stylesheet" 
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" 
	crossorigin="anonymous">
<link rel="stylesheet" href="css/main.css" />
<title>Questions & Answers</title>
</head>
<body>
	<div class="container">
		<br>
		<h1>Questions Dashboard</h1>
		<br>
		<table>
			<thead>
				<tr>
					<th>Questions</th>
					<th>Tags</th>
				</tr>
			</thead>
			<tbody>	
				<c:forEach items="${allQuestions}" var="questions">
					<tr>
						<td><a href="/questions/${questions.id}">${questions.question }</a></td>
						<td>
							<c:choose>
								<c:when test="${tags.subject != null}">
								${tags.subject}
								</c:when>
								<c:otherwise>
								Does Not Have Tag
								</c:otherwise>
							</c:choose>
						</td>
					</tr>
				</c:forEach>			
			</tbody>
		</table>
		<br>
		<a href="/questions/new">New Question</a>
		<br>
	</div>
</body>
</html>