<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />

<title>Search for a ride</title>
<link rel="preconnect" href="https://fonts.googleapis.com" />
<link rel="preconnect" href="https://fonts.gstatic.com" />
<link
	href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500&display=swap"
	rel="stylesheet" />
<link
	href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined"
	rel="stylesheet" />
<link href="./styles.css" rel="stylesheet" />
<style>
.left {
	margin-left: -500px;
}


select:focus {
	outline: 0;
	border-color: green;
	font-family: sans-serif;
}

select {
	padding: 20px 30px;
	width: 400px;
	gap: 2px;
	border-radius: 10px;
}

.up {
	margin-top: -15px;
}

/* Set the background color of the dropdown options */
  #pickUp_Location option {
    
    font-size: 17px;
  }

  /* Set the text color of the dropdown options */
  #pickUp_Location option:not(:first-child) {
  
    background:rgba(0,0,0,0.3);
    color: black;
    backdrop-filter: blur(50px);
  }
  

  /* Set the hover background color of the dropdown options */
  #pickUp_Location option:hover {
    background-color: #bac2c1;
  }
  
  #DropOff_Location option {
    background:rgba(0,0,0,0.3);
    font-size: 17px;
    backdrop-filter: blur(10px);
  }

  /* Set the text color of the dropdown options */
  #DropOff_Location option:not(:first-child) {
    
    color: black;
    
  }
  

  /* Set the hover background color of the dropdown options */
  #DropOff_Location option:hover {
    background-color: #bac2c1;
  }

  
  
</style>
<script src="https://kit.fontawesome.com/c118d74b64.js"
	crossorigin="anonymous"></script>
</head>
<body>
	<nav class="navbar"> <img src="LOGO.png" width="60px"
		height="60px">
	<button onclick="toggleMenu()" class="burger"></button>
	<button class="button">Home</button>
	<div class="dropdowns">
		<div class="dropdown">
			<button class="button">
				Company <img src="chevron.svg" />
			</button>
			<div class="dropdown-menu">
				<button>About Us</button>
				<button>Blogs</button>
				<button>Testimonies</button>
				<button>Contact Us</button>
			</div>
		</div>
	</div>
	<button class="button">Safety</button>
	<button class="button" id="left">Help</button>
    <div class="profile" >
    <div class="img_container">
    <img src="profile.jpg"  id="image">
    </div>
    <div id="slider" >
        <div class="profileText">
            <p class="maintext">John Wick</p>
        </div>
    
        <div class="myprofile childs">
            <i class="fa-solid fa-user"></i><p class="text" >My Profile</p>
            <a href="/logout"></a>
        </div>
        <div class="myrides childs">
            <i class="fa-solid fa-car"></i><p class="text">My Rides</p>
        </div>
        <div class="mytransactions childs">
            <i class="fa-solid fa-money-bill-transfer"></i><p class="text">Transactions</p>
        </div>
        <div class="logout childs">
            <i class="fa-solid fa-right-from-bracket"></i><p class="text">Log Out</p>
        </div>
    </div>
    </div>

	</nav>
	<div class="container">
		<div class="options">
			<a class="option" id="ride-button" style="text-decoration: none;"
				href="#"><i class="fa-solid fa-car" id="car" aria-hidden="true"></i><b>Ride</b></a>
			<a class="option" id="drive-button" style="text-decoration: none;"
				href="#"><i class="fa-solid fa-id-card"></i><b>Drive &
					Deliver</b></a>
		</div>
		<div class="form" id="ride-form">
			<h1>
				<b>Request a ride now</b>
			</h1>
			<br>
			<!-- <input type="text" placeholder="Enter the pickup location"><br><br>
          <input type="text" placeholder="Enter the destination"><br><br>-->

			<div class="up">
				<form:form id="LocationForm" method="POST" modelAttribute="formlocations" action="${pageContext.request.contextPath }/validateSession.html">
				 		<form:select id="pickUp_Location" path="pickUpKey">
						<form:option label="--Select PickUp  Location--" value="-1"/>
						<form:options id="formOptions" items="${pickUp_Location}"></form:options>
					</form:select>
					<br><br>
					<br>
					<form:select id="DropOff_Location" path="dropOffKey">
						<form:option label="--Select DropOff  Location--" value="-1"/>
						<form:options items="${dropOff_Location}"></form:options>
					</form:select>
					<br><br>
					<br>
					</form:form>
					
			</div>
					<button type="submit" id="RequestButton">Request Now</button>
				
			
			<!--  <button id="request" onClick=submit()>Request Now</button>-->
			<button id="schedule">Schedule Later</button>
			<!-- Ride form HTML goes here -->
		</div>
		<div class="form" id="drive-form">
			<!-- Drive & Deliver form HTML goes here -->
			<h1>
				<b>Get in the driver's seat and get paid now</b>
			</h1>
			<br>
			<p>Drive on the platform with the largest network of active
				riders.</p>
			<br>
			<button id="drive" onClick=redirectToProviderSignUpPage()>Sign
				up to drive</button>
			<br>
			<br>
			<br> <a href="#" id="learn">Learn more about driving and
				delivering</a>
		</div>
	</div>
	<script>
      const toggleMenu = () => document.body.classList.toggle("open");
      const rideButton = document.getElementById('ride-button');
const driveButton = document.getElementById('drive-button');
const rideForm = document.getElementById('ride-form');
const driveForm = document.getElementById('drive-form');

// To submit the form
//-------------------
 
const form = document.getElementById("LocationForm");
const RequestNowButton = document.getElementById("RequestButton");
RequestNowButton.addEventListener("click",function(){ //click event listener
	form.submit();
});


window.onload=function(){
  var form=document.getElementById('ride-form');
  form.style.display="block";
}

rideButton.addEventListener('click', () => {
  rideForm.style.display = 'block';
  driveForm.style.display = 'none';
});

driveButton.addEventListener('click', () => {
  rideForm.style.display = 'none';
  driveForm.style.display = 'block';
});

function getContextPath() {
	   return "<%=request.getContextPath()%>";
	}


}
/*let image=document.querySelectorAll(".image")[0];
let ImageToggle=documnet.getElementById(".imageToggle");
let hide = document.querySelectorAll(".hide")[0];
let profileToggle=document.getElementById(".profileToggle");
let slider = document.querySelectorAll(".slider")[0];

image.addEventListener("mouseenter", ()=> {
     slider.classList.add("hide");
     image.classList.add("imageToggle");
});*/
const image = document.getElementById('image');
const slider=document.getElementById("slider");
const profile = document.querySelector('.profile');
const img_container=document.querySelector(".img_container");


profile.addEventListener('mouseover', () => {
  image.style.transform = 'translateX(-150px)';
  slider.style.display = 'block';
  img_container.classList.add('change');
});

profile.addEventListener('mouseout', () => {
  image.style.backgroundColor = 'inherit'; // Reset background color
  image.style.transform = 'translateX(0)';
  slider.style.display = 'none';
  img_container.classList.remove('change'); // Remove the class for additional properties
});






    </script>
</body>
</html>
	