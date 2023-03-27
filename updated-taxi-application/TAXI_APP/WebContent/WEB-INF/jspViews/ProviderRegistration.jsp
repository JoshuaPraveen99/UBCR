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
			background: linear-gradient(to bottom right, #CBE4DE, #2C3333);
		}
		
		h1 {
			text-align: center;
			color: #2C3333;
			margin-top: 50px;
		}
		
		form {
			max-width: 600px;
			text-align: center;
			margin: 0 auto;
			padding: 20px;
			color: #CBE4DE;
			background-color: #2C3333;
			border-radius: 10px;
			box-shadow: 0px 0px 20px rgba(0,0,0,0.2);
		}
		
		label {
			display: inline-block;
			margin-bottom: 10px;
			color: #CBE4DE;
			text-align: center;
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
			color: #0f0f0f;
			box-sizing: border-box;
		}
		
		input[type="file"] {
			margin-bottom: 10px;
			text-align: center;
		}
		
		input[type="submit"] {
			display: block;
			width: 100%;
			padding: 10px;
			background-color: #CBE4DE;
			color: CBE4DE;
			border: none;
			border-radius: 5px;
			cursor: pointer;
			transition: background-color 0.3s ease-in-out; 
			animation: pulse 1s ease-in-out infinite;
		}
		
		input[type="submit"]:hover {
			background-color: #2E4F4F;
			text-align: center;
			colour: #CBE4DE;
			animation: pulse 1s ease-in-out infinite;
		}
		
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
		<h1>Provider Details Registration Form</h1>
	<form:form modelAttribute="regBean" method="POST" enctype="multipart/form-data"
				action="${pageContext.request.contextPath}/addNewProvider.html">
	<table>
	
	<tr>
		<th>Provider Name:</th>
		<td><form:input path="provider_Name" required="required"/></td>
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
		<td><form:input path="Address" required="required"/></td>
	</tr>
	
	<tr>
		<td><label for="photo">Provider Photo:</label>
		    <input type="file" id="Photo" name="provider_Image" accept="image/*" required="required">
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
		<td><form:input path="regNumber" required="required"/></td>
	</tr>
	
	<tr>
		<td><label for="photo">Car Photo:</label>
		    <input type="file" id="Photo" name="car_Image" accept="image/*" required="required">
		</td>
	</tr>
	
	<tr>
		<th>License Number:</th>
		<td><form:input path="licenseNum" required="required"/></td>
	</tr>
	
	<tr>
		<td><label for="photo">License Photo:</label>
		    <input type="file" id="Photo" name="license_Image" accept="image/*" required="required">
		</td>
	</tr>
	
	<tr>
		<th>RC Number:</th>
		<td><form:input path="rcNum" required="required"/></td>
	</tr>
	
	<tr>
		<td><label for="photo">RC Photo:</label>
		    <input type="file" id="Photo" name="rc_Image" accept="image/*" required="required">
		</td>
	</tr>
	
	</table>
	<input type="submit" value="Register">
	
	<spring:hasBindErrors name="RegBean">
				<h2>All errors</h2>
				<form:errors path="*" />
			</spring:hasBindErrors>
			
	</form:form >
</body>
</html>