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
.bean-container {
  display: block;
  background-color: #f9f9f9;
  border: 1px solid #ddd;
  border-radius: 4px;
  padding: 10px;
  margin-bottom: 10px;
  text-decoration: none;
  color: #333;
}

.bean-container:hover {
  background-color: #e9e9e9;
}
</style>
</head>
<body>
  <c:if test="${not empty taxi }">
  <c:forEach var="bean" items="${finalTaxi}">
  <div class="bean-container">
  <a class="sendId" href="beanDetails.html?id=${bean.taxi_id }" >  
            <label for="driver-name">Driver Name:</label>
            <p>${bean.getDriverName() }</p>
            <label for="vehicle-number">Vehicle Number:</label>
            <p>${bean.getVehicleNumber() }</p>
            <label for="car-Type">CarType:</label>
            <p>${bean.carType }</p> 
            <label for="car-Model">CarModel:</label>
            <p>${bean.carModel}</p> 
            <label for="estimated_time">Time of Arrival:</label>
            <p>${bean.estimated_time}</p> 
  </a>
  </div>
</c:forEach>
</c:if>
<c:if test="${not empty message }">
 <a href="ProcessMessage">${message }</a>
 </c:if>

</body>
</html>