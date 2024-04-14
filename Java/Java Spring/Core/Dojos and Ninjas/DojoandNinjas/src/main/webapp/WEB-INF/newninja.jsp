<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<title>Create new Ninja</title>
</head>
<body style="margin:10vw;">
<div class="container">
<form:form action="/ninja/new" method="post" modelAttribute="ninja" class="mt-3">
			<form:select path="dojo"  class="form-select form-select-lg mb-3" aria-label=".form-select-lg example">
				<c:forEach var="dojo" items="${dojos}">
					<option value="${dojo.id}">${dojo.name}</option>
				</c:forEach>
			</form:select><br>
			<form:label path="firstname">Ninja First Name</form:label>
			<form:input type="text" path="firstname"/><br>
			<form:label path="lastname">Ninja last Name</form:label>
			<form:input type="text" path="lastname"/><br>
			<form:label path="age">Age</form:label>
			<form:input type="text" path="age"/><br>
		<button type="submit" class="btn btn-primary">Create</button>
		</form:form>
</div>
</body>
</html>