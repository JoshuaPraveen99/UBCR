<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
body {
			font-family: Arial, sans-serif;
			background: linear-gradient(to bottom right, #CBE4DE, #2C3333);
		}
		h2 {
			text-align: center;
			color: #CBE4DE;}
		p	{
			colour: #CBE4DE;
			}
.container {
			margin: 100px auto;
			width: 400px;
			background-color: #2C3333;
			padding: 20px;
			border-radius: 10px;
			box-shadow: 0 0 10px rgba(0,0,0,0.3);
		}
.form     {width: 100%;
			padding: 12px 20px;
			margin: 8px 0;
			display: inline-block;
			border: 1px solid #ccc;
			border-radius: 4px;
			box-sizing: border-box;
			}
					.register {
			text-align: center;
			color:#CBE4DE;
			margin-top: 10px;
		}
		.register a {
			text-decoration: none;
			color: #CBE4DE;
			transition: color 0.3s;
		}
		
		.register a:hover {
			color: #0E8388;
			transform: translateY(-2px);
            transition: all 0.3s ease-in-out;
		}
		th {
  			color: #CBE4DE;
  			font-size: 18px;
		}
		input[type=submit]{
			background-color: #CBE4DE;
			color: CBE4DE;
			padding: 14px 20px;
			margin: 8px 0;
			border: none;
			border-radius: 4px;
			cursor: pointer;
			width: 100%;
			font-size: 16px;
			transition: background-color 0.3s;
		}
		input[type=submit]:hover {
			background-color: #2E4F4F;
		}
		input[type=submit]{
             animation: pulse 1s ease-in-out infinite;
        }

        @keyframes pulse {
        0% { transform: scale(1); }
        50% { transform: scale(1.1); }
        100% { transform: scale(1); }
        
}
@keyframes slideIn {
  0% {
    transform: translateX(-50px);
    opacity: 0;
  }
  100% {
    transform: translateX(0);
    opacity: 1;
  }
}

form {
  animation: slideIn 0.5s ease-in-out;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <div class='container'>
	<center>
		<h2>Provider Login Page</h2>
		<div class='form'>
		<form:form modelAttribute="providerLoginBean" method="POST"
			action="ValidateProviderLogin.html">
			<br>
			<table>
				<tr>
					<th style="colour: #CBE4DE;">Username</th>
					<td><form:input path="userName" required="required"/></td>
				</tr>
				<tr>
					<th style="colour: #CBE4DE;">Password</th>
					<td><form:input path="password" required="required"/></td>
				</tr>
			</table>
			<br>
			<br>
			<input type="submit" value="Login">
			<spring:hasBindErrors name="providerLoginBean">
				<h2>All errors</h2>
				<form:errors path="*" />
			</spring:hasBindErrors>
		</form:form>
		</div>
		<br> <br>
		<p>${message}</p>
		<div class="register">
			Wanna join our team? <a href="${pageContext.request.contextPath}/showProviderRegPage.html">Register</a>
		</div>
	</center>
	
	</div>
</body>
</html>