
    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fruit Store</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
<h1>Fruit Store</h1>
<table class="custom-table">
<tbody>
    <c:forEach var="fruit" items="${fruits}">
        <tr>
            <td>${fruit.name}</td>
            <td>${fruit.price}</td>
        </tr>
    </c:forEach>
</tbody>

</table>
</body>
</html>