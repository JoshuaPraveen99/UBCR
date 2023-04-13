<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.uc.web.controller.RideController" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Select A Ride</title>
<style>
            @import url('https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css');
         .container {
    background-color: #f2f2f2;
    border-radius: 5px;
    padding: 20px;
    margin: 20px auto;
    width: 60%;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
}

.row {
    display: flex;
    margin-bottom: 10px;
}

.col-3 {
    flex-basis: 30%;
    text-align: right;
    margin-right: 20px;
}

.col-9 {
    flex-basis: 70%;
}

label {
    font-weight: bold;
    margin-right: 10px;
}

i {
    margin-right: 10px;
}

.fas {
    font-size: 18px;
    color: #666;
}

/* Conditional CSS for Car Type Icons */

.fas.fa-car-side {
    color: black;
}

.fas.fa-truck-pickup {
    color: black;
}

.fas.fa-car {
    color:  black;
}
</style>
</head>
<body>
<div class="container">
            <div class="row">
                <div class="col-3">
                    <i class="fas fa-user"></i>
                    <label for="driver-name">Driver Name:</label>
                </div>
                <div class="col-9">
                    <p>${finalTaxi.getDriverName()}></p>
                </div>
            </div>
            <div class="row">
                <div class="col-3">
                    <i class="fas fa-car"></i>
                    <label for="vehicle-name">Vehicle Name:</label>
                </div>
                <div class="col-9">
                    <p>${finalTaxi.getVehicleNumber()}</p>
                </div>
            </div>
                <div class="col-9">
                    <span th:text="${finalTaxi.getCarType()}"></span>
                    <!-- Conditional clause to display different car icons -->
                    <!-- Sedan -->
                    <i th:if="${finalTaxi.carType == 'Sedan'}" class="fas fa-car-side"></i>
                    <!-- SUV -->
                    <i th:if="${finalTaxi.carType == 'SUV'}" class="fas fa-truck-pickup"></i>
                    <!-- Hatchback -->
                    <i th:if="${finalTaxi.carType == 'Hatchback'}" class="fas fa-car"></i>
                </div>
            </div>
        </div>
</body>
</html>