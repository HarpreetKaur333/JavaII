<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exercise 4.2</title>
<link rel="stylesheet" href="CSS/ExerciseFirst.css">
</head>
<body>
<h4>Exercise 4.2</h4>
	
	<fieldset>
    <legend style="margin-left:0px;" class="legend">login page</legend>
    
	<form action="./Exercise4Point2" method="post" class="regfrm">
		<label>Enter the UserName <input type="text" name="username" class="txtbox" style="margin: 0px 10px 10px 40px;"> </label><br>
		<label>Remember my user: <input type="checkbox" name="chkRememberme" value="Rememberme" style="margin:3px 13px 14px 40px;"></label><br>
	
			<button type="submit" class="submitbtn" style="margin-left:280px">Login </button>
	</form>
	</fieldset>
</body>
</html>