<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.uc.web.controller.RideController" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
         .container {
    background-color: #f2f2f2;
    border-radius: 5px;
    padding: 20px;
    margin: 20px auto;
    width: 60%;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
}
</style>
</head>
<body>
 <div class="container">

            <label for="driver-name">Driver Name:</label>
            <p>${bookedTaxi.getDriverName() }</p>
            <label for="vehicle-number">Vehicle Number:</label>
            <p>${bookedTaxi.getVehicleNumber() }</p>
            <label for="car-Type">CarType:</label>
            <p>${bookedTaxi.carType }</p> 
            <label for="car-Model">CarModel:</label>
            <p>${bookedTaxi.carModel}</p> 
            <label for="estimated_time">Time of Arrival:</label>
            <p>${bookedTaxi.estimated_time}</p> 
            <p></p>
</div>
</body>

</html>