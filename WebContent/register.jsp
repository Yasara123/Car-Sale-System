<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h1>Register</h1>
	<form action="RegisterServelet" method= "post">
		<fieldset>
		<legend>Registration Form</legend>
		<label>Email : </label> <input type="text" name="email"><br>
		<label>Name : </label> <input type="text" name="name"><br>
		<label>Password : </label> <input type="password" name="password"><br>
		<label>Confirm : </label> <input type="password" name="confirm"><br>
		<input type="submit" value="Register">
		</fieldset>
	</form>
	
</body>
</html>