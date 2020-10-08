<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
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
		<h1>What Is Your Question?</h1>
		<br>
		<form:form action="/question" action="/tag" method="post" modelAttribute="question" modelAttribute="tag">
			<div class="form-group">
		        <form:label path="question">Question</form:label>
		        <form:errors path="question"/>
		        <form:input class="form-control" path="question"/>
		    </div>
		    <div class="form-group">
		        <form:label path="subject">Tags</form:label>
		        <form:errors path="subject"/>
		        <form:input class="form-control" path="subject"/>
		    </div>
		    <button>Submit</button>
		</form:form>
	</div>
</body>
</html>