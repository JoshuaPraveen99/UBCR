<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<html>
<head>
<meta name="HomePage" content="width=device-width", initial-scaler="1.0">
<title>UR Cabs</title>
<link rel="stylesheet" href="home.css">
<style>
	*{
		margin: 0;
		padding: 0;
		box-sizing: border-box;
		font-family: 'Poppins',sans-serif;
	}

	.home{
		width: 100%;
		height:100vh;
		background-image: linear-gradient(rgba(12,3,51,0.3),rgba(12,3,51,0.3));
		position: relative;
		padding: 0 5%;
		display: flex;
		align-items: center;
		justify-content: center;
	}

	nav{
		width: 100%;
		position: absolute;
		top: 0;
		left: 0;
		padding: 20px 8%;
		display: flex;
		align-items: center;
		justify-content: space-between;
	}

	nav .logo{
		margin-left: -80px;
		width: 80px;
	}

	nav ul li{
		list-style: none;
		display: inline-block;
		margin-left: 40px;
	}

	nav ul li a{
		text-decoration: none;
		color: whitesmoke;
		font-size: 16px;
	}

	.content{
		text-align: center;
	}

	.content h1{
		font-size: 120px;
		color: whitesmoke;
		font-weight: 600;
		transition: 0.5s;
	}
	.content h1:hover{
		-webkit-text-stroke:2px whitesmoke;
		color: transparent;
	}

	.content a{
		text-decoration: none;
		backdrop-filter: blur(10px);
		display: inline-block;
		color: whitesmoke;
		font-size: 18px;
		border: 2px solid whitesmoke;
		padding: 14px 70px;
		border-radius: 50px;
		margin-top: 20px;
	}

	.video{
		position: absolute;
		right:0;
		bottom:0;
		z-index: -1;
	}
	@media (min-aspect-ratio: 16/9){
		.video{
			width: 100%;
			height: auto;
		}
	}

	@media (max-aspect-ratio: 16/9){
		.video{
			width: auto;
			height: 100%;
		}
	}

</style>
</head>
<body>
	<div class="home">

		<video autoplay loop muted plays-inline class="video">
			<source src="home_bg.mp4" type="video/mp4">
		</video>

		<nav >
			<img src="home_logo.png" class="logo">
			<ul>
				<li><a href="#">Home</a></li>
				<li><a href="#">About Us</a></li>
				<li><a href="#">Contact</a></li>
				<li><a href="#">Our Services</a></li>
			</ul>
		</nav>
		<div class="content">
			<h1>Taxi for hire</h1>
			<a href="${pageContext.request.contextPath }/populateLocations.html">Book Now!</a>	
		</div>
	</div>
</body>
</html>