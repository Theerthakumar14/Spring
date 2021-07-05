<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student-reg</title>
</head>
<body>
	<h1>Reg Form</h1>

	<form action="student.do" method="get">
		<pre>
		StudentName:<input type="text" name="studentName" value="studentName">
		PhoneNo:<input type="number" name="phoneNo" value="phoneNo">
		<label>Gender</label>
		<input type="radio" name="gender" value="Male">Male
		<input type="radio" name="gender" value="Female">Female
		<input type="radio" name="gender" value="others">others
		
		Date Of Birth:<input type="date" name="dateOfBirth"
				value="dateOfBirth">
		
		email:<input type="email" name="email" value="email">
		Password:<input type="password" name="password" value="password"
				minLength="6">
		
		<label>Choose a course</label>
		<select name="course">
		<optionvalue"">choose a course</option>
		<option value="JAVA">JAVA</option>
		<option value="SQL">SQL</option>
		<option value="Frameworkz">Frameworkz</option>
					
		</select>
		<input type="submit" value="Submit">


		</pre>


	</form>
	<h2>${display}</h2>

</body>
</html>