<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

				<form method="POST" action="/bookRide.html">
					<select name="pickUp_Location" id="pickUp_Location">
						<option value="" disabled selected>Select PickUp Location</option>
						<c:forEach items="${pickUp_Location}" var="location">
							<option id="pickUp_Dropdown" value="${location}">${location}</option>
						</c:forEach>
					</select>
					</form>
</body>
</html>