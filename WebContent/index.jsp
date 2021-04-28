<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="tag" %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>	
</head>
<body>

	<form action="" method="post">
		<input type="text" name="email" placeholder="Email"><br><br>
		<input type="text" name="pass" placeholder="Password"><br><br>
		<button type="submit">Login</button>
	</form>


	<tag:if test='${error != null}'>
		<h3 style="color:red;">${error}</h3>
	</tag:if>

	
	
</body>
</html>