<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Inscription Page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <h1>Welcome!</h1>
        <p>Join our growing community!</p>
        <div class="row">
            <div class="col">
                <div class="table-responsive">
                    <form:form action="/register" method="post" modelAttribute="newUser">
                        <table class="table">
                            <thead>
                                <tr>
                                    <th colspan="2" class="text-center">Register</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td><label for="userName">User Name</label></td>
                                    <td><form:input path="userName" id="userName" class="form-control" /></td>
                                </tr>
                                <tr>
                                    <td><label for="email">Email</label></td>
                                    <td><form:input type="email" path="email" id="email" class="form-control" /></td>
                                </tr>
                                <tr>
                                    <td><label for="password">Password</label></td>
                                    <td><form:input type="password" path="password" id="password" class="form-control" /></td>
                                </tr>
                                <tr>
                                    <td><label for="confirmPassword">Confirm Password</label></td>
                                    <td><form:input type="password" path="confirmPassword" id="confirmPassword" class="form-control" /></td>
                                </tr>
                            </tbody>
                        </table>
                        <button type="submit" class="btn btn-primary">Register</button>
                    </form:form>
                </div>
            </div>
        </div>
        <div class="row mt-4">
            <div class="col">
                <div class="table-responsive">
                    <form:form action="/login" method="post" modelAttribute="newLogin">
                        <table class="table">
                            <thead>
                                <tr>
                                    <th colspan="2" class="text-center">Login</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td><label for="loginEmail">Email</label></td>
                                    <td><form:input type="email" path="email" id="loginEmail" class="form-control" /></td>
                                </tr>
                                <tr>
                                    <td><label for="loginPassword">Password</label></td>
                                    <td><form:input type="password" path="password" id="loginPassword" class="form-control" /></td>
                                </tr>
                            </tbody>
                        </table>
                        <button type="submit" class="btn btn-primary">Login</button>
                    </form:form>
                </div>
            </div>
        </div>
    </div>
</body>

</html>
