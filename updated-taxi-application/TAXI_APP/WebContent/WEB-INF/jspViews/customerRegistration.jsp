<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
<body>
		<h1>Registration Form</h1>
	<form:form modelAttribute="registrationBean" method="POST" enctype="multipart/form-data"
				action="addNewCustomer.html">
	<table>
	
	<tr>
		<th>CustomerName:</th>
		<td><form:input path="C_NAME" required="required"/></td>
	</tr>
	
	<tr>
		<th>Customer Email:</th>
		<td><form:input path="email" required="required"/></td>
	</tr>
	
	<tr>
		<th>Contact:</th>
		<td><form:input path="Contact" required="required"/></td>
	</tr>
	
	<tr>
		<th>Address:</th>
		<td><form:input path="Address" required="required"/></td>
	</tr>
	
	<tr>
		<td><label for="photo">Customer Photo:</label>
		    <input type="file" id="Photo" name="customer_Image" accept="image/*" required="required">
		</td>
	</tr>
	
	<tr>
		<th>UserName:</th>
		<td><form:input path="username" required="required"/></td>
	</tr>
	
	<tr>
		<th>Enter a password:</th>
		<td><form:input path="password" required="required"/></td>
	</tr>
	
	</table>
	<input type="submit" value="Register">
	
	<spring:hasBindErrors name="registrationBean">
				<h2>All errors</h2>
				<form:errors path="*" />
			</spring:hasBindErrors>
			
	</form:form >

</body>
</html>