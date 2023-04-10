<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
				<form:form method="post" modelAttribute="location" action="${pageContext.request.contextPath}/bookRide.html">
					<form:select id="pickUp_Location" path="key">
						<form:option label="--Select PickUp  Location--" value="" />
						<form:options items="${pickUp_Location}"></form:options>c
						<input type="Submit" value=Submit/>
					</form:select>
					</form:form>
</body>
</html>