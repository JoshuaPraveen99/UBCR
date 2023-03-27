<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/trail/save/image.html" method="post" enctype="multipart/form-data">
<label for="photo">Upload Photo:</label>
		<input type="file" id="Photo" name="image" accept="image/*" required><br>
		<input type="submit" value="Register">
	</form>
	<p>${response}</p>
</body>
</html>