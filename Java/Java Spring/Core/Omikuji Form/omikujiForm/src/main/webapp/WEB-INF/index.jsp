<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix ="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>omikuji</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
<div class="container">
<div><h1>Send an Omikuji!</h1></div>
<form action="/omikuji/process" method="post">
	<div>
		<label for="number">Pick any number from 5 to 25</label><br/>
		<input class="num" type="number" name="number"/>
	</div>
	
	<div>
		<label for="">Enter the name of any city</label><br/>
		<input type="text" name="city"/>
	</div>
	
	<div>
		<label for="">Enter the name of any real person</label><br/>
		<input type="text" name="realPerson"/>
	</div>
	
	<div>
		<label for="">Enter professional endeavor or hobby</label><br/>
		<input type="text" name="hobby"/>
	</div>
	
	<div>
		<label for="">Enter any type of living thing</label><br/>
		<input type="text" name="livingThing"/>
	</div>
	<div>
		<label for="">Say something nice to someone:</label><br/>
		<textarea name="something"  cols="40"rows="5"></textarea>
	</div>
	
	<div>
		<p>Send and show a friend!</p>
		
		<input class="button" type="submit" value="Send"/>
	</div>
	</form>
</div>
</body>
</html>
