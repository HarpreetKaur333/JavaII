<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exercise 3.3 Web Application</title>
<link rel="stylesheet" href="CSS/ExerciseFirst.css">
</head>
<body>
<h4>Exercise 3.3 Web Application</h4>
	
	<fieldset>
    <legend style="margin-left:0px;" class="legend">Registration</legend>
    
    <labal>You can register via this form: </labal>
	<form action="./DisplayInfo3point3Exercise" method="post" class="regfrm">
		<label>Last Name  <input type="text" name="lastname" class="txtbox"> </label><br>
		<label>First Name <input type="text" name="firstname" class="txtbox"> </label><br>
		<label class="lbl">Course </label>
			<select name="course" class="ddlist">
			<option value="JavaII">JavaII</option>
			<option value="python">Python</option>
			<option value="dotnet">DotNet</option>
			</select>
			<input type="radio" name="time" value="Evening"> Evening
			<input type="radio" name="time" value="Day"> Day&nbsp;&nbsp;&nbsp;&nbsp;
			Session Winter <input type="checkbox" name="ChkSession" value="Winter" />
			Session Summer <input type="checkbox" name="ChkSession" value="Summer" />
			<br>
			<button type="submit" class="submitbtn">Registration </button>
	</form>
	</fieldset>
	
	
	
</body>
</html>