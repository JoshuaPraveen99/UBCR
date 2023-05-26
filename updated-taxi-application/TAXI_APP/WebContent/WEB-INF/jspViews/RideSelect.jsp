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
            .icon{
                width: 75px;
                display: inline-block;
                transition:filter 0.5s ease-in-out;
            }
            .SUV{
                width:75px;
                transform: scaleX(-1);
                transition:filter 0.5s ease-in-out;
          
            }
            .time{
                margin-top:-20px;
                margin-left:17px;
            }
            .SUV:hover{
               filter: invert(100%);
            }
            .icon:hover{
                filter: invert(100%);
            }
             .text{
                display: inline-block;
                margin-left: 0px;
                vertical-align:35px ;
                font-weight: bolder;
            }
</style>
</head>
<body>
 <c:if test="${not empty finalTaxi}">
  <c:forEach var="bean" items="${finalTaxi}">
    <div class="bean-container">
      <a class="sendId" href="beanDetails.html?id=${bean.taxi_id}">  
        <label for="driver-name">Driver Name:</label>
        <p>${bean.getDriverName()}</p>
        <label for="vehicle-number">Vehicle Number:</label>
        <p>${bean.getVehicleNumber()}</p>
        <label class="text" for="car-Type">CarType:</label>
        <c:choose>
          <c:when test="${bean.carType eq 'Sedan'}">
            <img src="Sedan.png" class="icon"><p class="text">SEDAN</p>
          </c:when>
          <c:when test="${ bean.carType eq 'SUV'}">
            <img src="SUV.png" class="SUV"><p class="text">SUV</p>
          </c:when>
          <c:when test="${bean.carType eq 'Hatchback'}">
            <img src="Hatchback.png" class="icon"><p class="text">HATCHBACK</p>
          </c:when>
          <c:otherwise>
            <p>HI</p>
          </c:otherwise>
        </c:choose>
        <br>
        <label for="car-Model">CarModel:</label>
        <p>${bean.carModel}</p> 
        <label for="estimated_time">Time of Arrival:</label>
        <p>${bean.estimated_time}</p> 
      </a>
    </div>
  </c:forEach>
</c:if>

<c:if test="${not empty message}">
  <a href="${pageContext.request.contextPath}/ProcessMessage.html">${message}</a>
</c:if>

</body>
</html>