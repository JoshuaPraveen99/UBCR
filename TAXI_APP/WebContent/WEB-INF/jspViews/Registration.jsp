<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
<style>
.error {
	color: #ff0000;
	font-style: italic;
}
body {
			font-family: Arial, sans-serif;
			background-color: #f5f5f5;
		}
		
		h1 {
			text-align: center;
			color: #333;
			margin-top: 50px;
		}
		
		form {
			max-width: 600px;
			margin: 0 auto;
			padding: 20px;
			background-color: #fff;
			border-radius: 10px;
			box-shadow: 0px 0px 20px rgba(0,0,0,0.2);
		}
		
		label {
			display: inline-block;
			margin-bottom: 10px;
			color: #333;
		}
		
		input[type="text"],
		input[type="tel"],
		input[type="email"],
		input[type="password"] {
			display: block;
			width: 100%;
			padding: 10px;
			margin-bottom: 20px;
			border-radius: 5px;
			border: none;
			background-color: #f5f5f5;
			color: #333;
			box-sizing: border-box;
		}
		
		input[type="file"] {
			margin-bottom: 20px;
		}
		
		input[type="submit"] {
			display: block;
			width: 100%;
			padding: 10px;
			background-color: #333;
			color: #fff;
			border: none;
			border-radius: 5px;
			cursor: pointer;
		}
		
		input[type="submit"]:hover {
			background-color: #555;
		}
</style>
</head>
<body>
		<h1>Registration Form</h1>
	<form action="${pageContext.request.contextPath }/RegistrationSuccess.html" method="post" enctype="multipart/form-data">
		<label for="C_NAME">Customer Name:</label>
		<input type="text" id="C_NAME" name="C_NAME" required>

		<label for="contact">Contact Number:</label>
		<input type="text" id="Contact" name="Contact" required>

		<label for="email">Email:</label>
		<input type="email" id="email" name="email" required>
		
		<label for="Address">Address:</label>
		<input type="text" id="Address" name="Address" required>

		<label for="photo">Upload Photo:</label>
		<input type="file" id="Photo" name="Photo" accept="image/*" required><br>

		<label for="username">Username:</label>
		<input type="text" id="username" name="username" required>

		<label for="password">Password:</label>
		<input type="password" id="password" name="password" required>

		<input type="submit" value="Register">
	</form>
</body>
</html>