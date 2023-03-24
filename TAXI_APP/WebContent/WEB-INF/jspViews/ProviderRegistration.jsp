<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
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
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
		<h1>Provider Details Registration Form</h1>
	<form:form modelAttribute="providerRegBean" method="POST" enctype="multipart/form-data"
				action="${pageContext.request.contextPath}/addProvider.html">
	<table>
	
	<tr>
		<th>Provider Name:</th>
		<td><form:input path="name" required="required"/></td>
	</tr>
	
	<tr>
		<th>Provider Email:</th>
		<td><form:input path="email" required="required"/></td>
	</tr>
	
	<tr>
		<th>Contact:</th>
		<td><form:input path="contact" required="required"/></td>
	</tr>
	
	<tr>
		<th>Address:</th>
		<td><form:input path="address" required="required"/></td>
	</tr>
	
	<tr>
		<td><label for="photo">Provider Photo:</label>
		    <input type="file" id="Photo" name="provider_Photo" accept="image/*" required="required">
		</td>
	</tr>
	
	<tr>
		<th>UserName:</th>
		<td><form:input path="userName" required="required"/></td>
	</tr>
	
	<tr>
		<th>Enter a password:</th>
		<td><form:input path="password" required="required"/></td>
	</tr>
	
	<tr>
		<th>carType:</th>
		<td><form:input path="carType" required="required"/></td>
	</tr>
	
	<tr>
		<th>carModel:</th>
		<td><form:input path="carModel" required="required"/></td>
	</tr>
	
	<tr>
		<th>Registration Number:</th>
		<td><form:input path="regNum" required="required"/></td>
	</tr>
	
	<tr>
		<td><label for="photo">Car Photo:</label>
		    <input type="file" id="Photo" name="car_Photo" accept="image/*" required="required">
		</td>
	</tr>
	
	<tr>
		<th>License Number:</th>
		<td><form:input path="licenseNo" required="required"/></td>
	</tr>
	
	<tr>
		<td><label for="photo">License Photo:</label>
		    <input type="file" id="Photo" name="license_Photo" accept="image/*" required="required">
		</td>
	</tr>
	
	<tr>
		<th>RC Number:</th>
		<td><form:input path="rcNum" required="required"/></td>
	</tr>
	
	<tr>
		<td><label for="photo">RC Photo:</label>
		    <input type="file" id="Photo" name="rc_Photo" accept="image/*" required="required">
		</td>
	</tr>
	
	</table>
	<input type="submit" value="Register">
	
	<spring:hasBindErrors name="providerRegBean">
				<h2>All errors</h2>
				<form:errors path="*" />
			</spring:hasBindErrors>
			
	</form:form >
</body>
</html>