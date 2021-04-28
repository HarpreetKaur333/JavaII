<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exercise 3.5</title>
<link rel="stylesheet" href="CSS/ExerciseFirst.css">
</head>
<body>
<h4>Exercise 3.5</h4>
	
	<fieldset>
    <legend style="margin-left:0px;" class="legend">Exercise 3.5</legend>
    
	<form action="./ServletsExercise3Point5" method="post" class="regfrm">
		<label>UserName <input type="text" name="username" class="txtbox"> </label><br>
		<label>Password <input type="password" name="password" class="txtbox"> </label><br>
		
			<button type="submit" class="submitbtn">Login </button>
	</form>
	</fieldset>
</body>
</html>