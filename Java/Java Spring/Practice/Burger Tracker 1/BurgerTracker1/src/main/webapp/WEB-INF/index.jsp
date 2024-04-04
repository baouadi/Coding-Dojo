<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<title>Burger King</title>
</head>
<body>
<h1>Burger Tracker</h1>
 <table border="1">
        <tr>
            <th>Burger Name</th>
            <th>Restaurant Name</th>
            <th>Rating</th>
        </tr>
        <c:forEach items="${burger}" var="burger">
            <tr>
                <td>${burger.bname}</td>
                <td>${burger.rname}</td>
                <td>${burger.rating}</td>
            </tr>
        </c:forEach>
    </table>
    
    <h2>Add a Burger</h2>
     <form:form action="/" method="post" modelAttribute="burger">
    <form:label path="bname">Burger Name:</form:label>
    <form:input path="bname"/><br/>
     
    <form:label path="rname">Restaurant Name:</form:label>
    <form:input path="rname"/><br/>
     
    <form:label path="rating">Rating:</form:label>
    <form:input path="rating" type="number" min="0" max="5"/><br/>   
     
    <form:label path="note">Note:</form:label>
    <form:textarea path="note" cols="25" rows="5"/><br/>
         
    <form:button>Register</form:button>
    <form:errors path="*" cssClass="error-message" />
</form:form>

</body>
</html>