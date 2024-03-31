<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix ="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Count</title>
</head>
<body>
<p>Y have visited <a href="#">https://your_server </a><c:out value="${count}"/> times.</p>
<a href="http://localhost:8080">Test another visit?</a>
</body>
</html>