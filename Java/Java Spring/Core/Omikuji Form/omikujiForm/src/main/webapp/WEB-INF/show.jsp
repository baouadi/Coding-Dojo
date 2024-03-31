<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show an Omikuji!</title>
<link href="/css/login.css" rel="stylesheet">
</head>
<body>
  <div class="container">
        <h1>Your Omikuji Result</h1>
        <p>${fortune}</p>
    </div>
  <a href="/omikuji">Go back</a>
</body>
</html>