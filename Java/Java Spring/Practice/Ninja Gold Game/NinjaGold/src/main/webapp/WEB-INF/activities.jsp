<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Ninja Gold Game Activities</title>
</head>
<body>
    <h1>Activities</h1>
    <p>Your gold: <c:out value="${ninjaGold}"/></p>
    <table>
        <tbody>
            <tr>
                <td>
                    <h3>Mine</h3>
                    <p>(earn 10-20 gold)</p>
                    <form action="/" method="post"><input class="button" type="submit" name="mine" value="Find Gold!"/></form>
                </td>
                <td>
                    <h3>Cave</h3>
                    <p>(earn 5-10 gold)</p>
                    <form action="/" method="post"><input class="button" type="submit" name="cave" value="Find Gold!"/></form>
                </td>
                <td>
                    <h3>House</h3>
                    <p>(earn 2-5 gold)</p> 
                    <form action="/" method="post"><input class="button" type="submit" name="home" value="Find Gold!"/></form>
                </td>
                <td>
                    <h3>Quest</h3>
                    <p>(earn/take 0-50 gold)</p>
                    <form action="/" method="post"><input class="button" type="submit" name="adventure" value="Find Gold!"/></form>
                </td>
            </tr>
        </tbody>
    </table>

    <h3>Activities:</h3>
    <c:forEach var="exploit" items="${exploits}">
        <c:if test="${exploit.contains('earned')}">
            <p style="color: green;"><c:out value="${exploit}"/></p>
        </c:if>
        <c:if test="${exploit.contains('lost')}">
            <p style="color: red;"><c:out value="${exploit}"/></p>
        </c:if>
    </c:forEach>
</body>
</html>

       
