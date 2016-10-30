<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Post A Car</title>
</head>
<body>
<% 

	//if(session.getAttribute("name")==null){
	//	response.sendRedirect("login.jsp"); //prevent unauthorized user to acess the file----this is for individual test
	//}
%>
	<h1>Post A Car</h1>
	<form action="PostCar" method="post"  >
		<fieldset>
		<legend>Car Form</legend>
		<label>Brand : </label> <input type="text" name="brand"/><br>
		<label>Model : </label> <input type="text" name="model"/><br>
		<label>Title : </label> <input type="text" name="title"/><br>
		<label>Description : </label> <input type="text" name="description"/><br>
		<label>Image : </label> <input type="file" name="image"/><br>
		<label>Price : </label> <input type="text" id="price" name="price"/><br>
		<input type="submit" value="Post">
		</fieldset>
	</form>
</body>
</html>