<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />

    <title>Navbar 1</title>
    <link rel="preconnect" href="https://fonts.googleapis.com" />
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
    <link
      href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500&display=swap"
      rel="stylesheet"
    />
    <link
      href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined"
      rel="stylesheet"
    />
    <link href="./styles.css" rel="stylesheet" />
    <script src="https://kit.fontawesome.com/c118d74b64.js" crossorigin="anonymous"></script>
  </head>
  <body>
    <nav class="navbar">
      <img src="LOGO.png" width="60px" height="60px">
      <button onclick="toggleMenu()" class="burger"></button>
      <button class="button" >Home</button>
      <div class="dropdowns">
        <div class="dropdown">
          <button class="button">
            Company
            <img src="chevron.svg" />
          </button>
          <div class="dropdown-menu">
            <button>About Us</button>
            <button>Blogs</button>
            <button>Testimonies</button>
            <button>Contact Us</button>
          </div>
        </div>
		</div>
          <button class="button">
            Safety
          </button>
          <button class="button" id="right">
            Help
          </button>
          <div class="dropdowns">
        <div class="dropdown">
          <button class="button">
            Login
          </button>
          <div class="dropdown-menu">
            <button onClick=redirectToCustomerLoginPage()>Customer Login</button>
            <button onClick=redirectToProviderLoginPage()>Provider Login</button>
          </div>
        </div>
		</div>
		<div class="dropdowns">
         <div class="dropdown">
          <button class="button" >
            SignUp
          </button>
          <div class="dropdown-menu" id="Signup">
            <button onClick=redirectToCustomerSignUpPage()>Customer SignUp</button>
            <button onClick=redirectToProviderSignUpPage()>Provider SignUp</button>
          </div>
        </div>
		</div>
    </nav>
    <div class="container">
      <div class="options">
        <a class="option" id="ride-button" style="text-decoration: none;" href="#"><i class="fa-solid fa-car" id="car" aria-hidden="true"></i><b>Ride</b></a>
        <a class="option" id="drive-button"  style="text-decoration: none;"  href="#"><i class="fa-solid fa-id-card"></i><b>Drive & Deliver</b></a>
      </div>
      <div class="form" id="ride-form">
          <h1><b>Request a ride now</b></h1><br>
          <input type="text" placeholder="Enter the pickup location"><br><br>
          <input type="text" placeholder="Enter the destination"><br><br>
          <button id="request">Request Now</button>
          <button id="schedule">Schedule Later</button>
        <!-- Ride form HTML goes here -->
      </div>
      <div class="form" id="drive-form"> 
        <!-- Drive & Deliver form HTML goes here -->
        <h1><b>Get in the driver's seat and get paid now</b> </h1><br>
        <p>Drive on the platform with the largest network of active riders.</p><br>
        <button id="drive" onClick=redirectToProviderSignUpPage()>Sign up to drive</button><br><br><br>
        <a href="#" id="learn">Learn more about driving and delivering</a>
      </div>
    </div>
    <script>
      const toggleMenu = () => document.body.classList.toggle("open");
      const rideButton = document.getElementById('ride-button');
const driveButton = document.getElementById('drive-button');
const rideForm = document.getElementById('ride-form');
const driveForm = document.getElementById('drive-form');

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

function redirectToCustomerLoginPage() {
    window.location.href = "${pageContext.request.contextPath}/ShowLoginPage.html";
}

function redirectToProviderLoginPage() {
    window.location.href = "${pageContext.request.contextPath}/showProviderLoginPage.html";
}

function redirectToCustomerSignUpPage() {
    window.location.href = "${pageContext.request.contextPath}/customerRegistration.html";
}

function redirectToProviderSignUpPage() {
    window.location.href = "${pageContext.request.contextPath}/showProviderRegPage.html";
}
    </script>
  </body>
</html>
