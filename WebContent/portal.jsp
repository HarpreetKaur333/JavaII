<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to Portal page</h1>
<fieldset>
<legend>Home</legend>

<div style="text-align: center">
        <h1>Welcome to Portal</h1>
        <b>${user.email} (${user.password})</b>
        <br><br>
        <a href="Logout">Logout</a>
    </div>
</fieldset>
</body>
</html>