<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>First Exercise</title>
<link rel="stylesheet" href="CSS/ExerciseFirst.css">
</head>
<body>
<h1></h1>
<div class='maindiv'>
<fieldset>
    <legend>my html form</legend>
  
<div class='left col-sm-6' style="margin-left: 10%;">
<div class='right1'>
<label for="login">text</label>
<input type="text" id="name" name="name" value=""><br>
</div>
<div class='right3'>
		   <label for="labelgender" style="margin: 10% 10% 10% 10%;">Radio</label><br>
			
				  <label for="male" class="normalfontweight">Male</label>
				   <input type="radio" id="male" name="gender" value=""><br>
				     <label for="female" class="normalfontweight">Female</label>
				  <input type="radio" id="female" name="gender" value="">
	</div>
	
	</div>
	<div class='left col-sm-6'>
		<div class='right2'>
<label for="labelage">checkbox</label><br>
  <label for="age1" class="normalfontweight">chow chow </label>
			 <input type="checkbox" id="age1" name="age1" value=""><br>
			 <label for="age2" class="normalfontweight">labrador  </label>
			  <input type="checkbox" id="age2" name="age2" value=""><br>
			 <label for="age3" class="normalfontweight">Usky</label>
			  <input type="checkbox" id="age3" name="age3" value=""><br>
			    <label for="age3" class="normalfontweight">berger allemend</label>
			  <input type="checkbox" id="age3" name="age3" value=""><br>
			    <label for="age3" class="normalfontweight">Caniche</label>
			  <input type="checkbox" id="age3" name="age3" value=""><br>
	</div>
	<div class='right4'>	
			 <label for="anymsg" class='floatleft'>TextArea</label><br>
				<textarea name="message" rows="4" cols="4" style="margin: 12% 11% 8% -40%;"></textarea>
				<br>
				</div>
				</div>
				<div class='center'>
				
			 <label for="labelage" class='floatleft' style='margin:1% 0% 1% 5%;'>ListBox</label><br>
			 	 <select id="city" name="select" style='float: left; margin-left: 2%;'>
				  <option value="option1">option1</option>
				  <option value="option2">option2</option>
				  <option value="option3">option3</option>
				</select><br>
				
				</div>	 
				<div class='submit'>
				<input type="submit" value="Submit Info" class='btnsubmit'>	
				</div>
</div>
 </fieldset>
</body>
</html>