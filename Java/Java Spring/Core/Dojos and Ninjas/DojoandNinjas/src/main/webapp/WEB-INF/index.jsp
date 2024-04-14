<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- Formatting (dates) -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
          rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
          crossorigin="anonymous">
    <title>Select Dojo</title>
</head>
<body style="margin: 10vw;">

<div class="container">
    <p>
        <a href="/dojo/new" class="btn btn-primary mr-3">Create New Dojo</a>
    </p>
    <p>
        <a href="/ninja/new" class="btn btn-primary">Create New Ninja</a>
    </p>
</div>

<div class="container">
    <h1>Select a Ninja Dojo:</h1>
    <div class="container">
        <select id="selectDojo" class="form-select form-select-lg mb-3" aria-label=".form-select-lg example">
            <c:forEach var="dojo" items="${dojos}">
                <option value="${dojo.id}">${dojo.name}</option>
            </c:forEach>
        </select><br>

        <table id="ninjaTable" class="table table-striped">
            <thead>
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Age</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="ninja" items="${ninjas}">
                <tr data-dojo-id="${ninja.id}"> <!-- Here we use ninja.id directly -->
                    <td>${ninja.firstname}</td>
                    <td>${ninja.lastname}</td>
                    <td>${ninja.age}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>

<script>
    document.getElementById("selectDojo").addEventListener("change", function() {
        var selectedDojoId = this.value;
        var rows = document.querySelectorAll("#ninjaTable tbody tr");

        rows.forEach(function(row) {
            var dojoId = row.getAttribute("data-dojo-id");
            if (selectedDojoId === "" || selectedDojoId === dojoId) {
                row.style.display = "";
            } else {
                row.style.display = "none";
            }
        });
    });
</script>

</body>
</html>
