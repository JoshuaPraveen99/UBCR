<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">
    <style>

body {
    background-color: #d7f7ff;
    font-family: Arial, Helvetica, sans-serif;
}

.wrapper {
    background-color: #fff;
    width: 500px;
    padding: 25px;
    margin: 25px auto 0;
    box-shadow: 0px 0px 20px rgba(0, 0, 0, 0.5);
    border-radius: 10px;
    overflow: hidden;
}

.wrapper h2 {
    background-color: #fcfcfc;
    color: #21cdd3;
    font-size: 24px;
    padding: 10px;
    margin-bottom: 8px;
    text-align: center;
    border: 1px dashed #21cdd3;
}

.wrapper h4 {
    padding-bottom: 5px;
    color: #21cdd3;
}

.input_group {
    margin-bottom: 8px;
    width: 100%;
    position: relative;
    display: flex;
    flex-direction: row;
    padding: 5px 0;
}

.input_box {
    width: 100%;
    margin-right: 12px;
    position: relative;
}

.input_box:last-child {
    margin-right: 0;
}

.input_box .name {
    padding: 14px 10px 14px 50px;
    width: 100%;
    background-color: #fcfcfc;
    border: 1px solid #0003;
    outline: none;
    letter-spacing: 1px;
    transition: 0.3s;
    border-radius: 3px;
    color: #333;
}

.input_box .name:focus, .dob:focus {
    -webkit-box-shadow: 0 0 2px 1px #21cdd3;
    -moz-box-shadow: 0 0 2px 1px #21cdd3;
    box-shadow: 0 0 2px 1px #21cdd3;
    border: 1px solid #21cdd3;
}

.input_box .icon {
    width: 48px;
    display: flex;
    justify-content: center;
    align-items: center;
    position: absolute;
    top: 0px;
    left: 0px;
    bottom: 0px;
    color: #333;
    background-color: #f1f1f1;
    border-radius: 2px 0 0 2px;
    transition: 0.3s;
    font-size: 20px;
    pointer-events: none;
    border: 1px solid #00000003;
    border-right: none;
}

.name:focus+.icon {
    background-color: #21cdd3;
    color: #fff;
    border-right: 1px solid #21cdd3;
    border: none;
    transition: 1s;
}


.radio {
    display: none;
}

.input_box label {
    width: 50%;
    padding: 13px;
    background-color: #fcfcfc;
    display:inline-block;
    float:right;
    text-align: center;
    border: 1px solid #c0bfbf;
}

.input_box label:first-of-type {
    border-top-left-radius: 3px;
    border-bottom-right-radius: 3px;
    border-right: none;
}

.input_box label:last-of-type {
    border-top-right-radius: 3px;
    border-bottom-right-radius: 3px;
}

.radio:checked+label {
    background-color: #21cdd3;
    color: #fff;
    transition: 0.5s;
}

.input_box button {
    width: 100%;
    background-color: #21cdd3;
    border: none;
    color: #fff;
    padding: 15px;
    border-right: 4px;
    font-size: 16px;
    transition: all 0.3s ease;
    border-radius: 8px;
}

.input_box button:hover {
    cursor: pointer;
    background-color: #05b1a3;
}
*{
                margin:0;
                padding:0;
                box-sizing: border-box;
                font-family: 'Poppins',sans-serif;
            }
            .btn{
                padding: 10px 60px;
                background:#fff;
                border:0;
                outline:none;
                cursor:pointer;
                font-size:22px;
                font-weight: 500;
                border-radius: 30px;
            }
            .popup{
                width:400px;
                background: #fff;
                border-radius: 6px;
                position:absolute;
                top:0;
                left:50%;
                transform:translate(-50%,-50%) scale(0.1);
                text-align: center;
                padding:0 30px 30px;
                color:#333;
                visibility: hidden;
                transition:transform 0.4s, top 0.4s;
            }
            .popup img{
                width:100px;
                margin-top:-50px;
                border-radius: 50%;
                box-shadow: 0 2px 5px rgba(0,0,0,0.2);
            }
            .popup h2{
                font-size: 38px;
                font-weight:500;
                margin: 30px 0 10px;
            }
            .popup button{
                width:100%;
                margin-top:50px;
                padding:10px 0;
                background:#6fd649;
                color:#fff;
                border:0;
                outline:none;
                font-size: 18px;
                border-radius:4px;
                cursor:pointer;
                box-shadow:0 5px 5px rgba(0,0,0,0.2);

            }
            .open-page{
                visibility:visible ;
            }
            .open-popup{
                display: block;
                visibility:visible;
                top:50%;
                transform: translate(-50%,-50%) scale(1);
                text-align:center;

            }
            .close-popup{
                visibility:hidden;
            }
 </style>
</head>
<body>
 <div class="wrapper" id="wrap">
        <h2>Payment Form</h2>
        <form action="" method="post">
            <!--Account Information Start-->
            <h4>Account</h4>
            <div class="input_group">
                <div class="input_box">
                    <input type="text" placeholder="Full Name" required class="name">
                    <i class="fa fa-user icon"></i>
                </div>
                <div class="input_box">
                    <input type="text" placeholder="Name on Card" required class="name">
                    <i class="fa fa-user icon"></i>
                </div>
            </div>
            <div class="input_group">
                <div class="input_box">
                    <input type="email" placeholder="Email Address" required class="name">
                    <i class="fa fa-envelope icon"></i>
                </div>
            </div>
            <div class="input_group">

            </div>

            <!--Account Information End--

            <!--Payment Details Start-->
            <div class="input_group">
                <div class="input_box">
                    <h4>Payment Details</h4>
                    <input type="radio" name="pay" class="radio" id="bc1" checked>
                    <label for="bc1"><span>
                            <i class="fa fa-cc-visa"></i> Credit Card</span></label>
                    <input type="radio" name="pay" class="radio" id="bc2">
                    <label for="bc2"><span>
                            <i class="fa fa-cc-paypal"></i> Debit Card</span></label>
                </div>
            </div>
            <div class="input_group">
                <div class="input_box">
                    <input type="tel" name="" class="name" placeholder="Card Number 1111-2222-3333-4444" required>
                    <i class="fa fa-credit-card icon"></i>
                </div>
            </div>
            <div class="input_group">
                <div class="input_box">
                    <input type="tel" name="" class="name" placeholder="CVV" required>
                    <i class="fa fa-user icon"></i>
                </div>
            </div>
            <div class="input_group">
                <div class="input_box">
                    <div class="input_box">
                        <input type="number" placeholder="Exp Month" required class="name">
                        <i class="fa fa-calendar icon" aria-hidden="true"></i>
                    </div>
                </div>
                <div class="input_box">
                    <input type="number" placeholder="Exp Year" required class="name">
                    <i class="fa fa-calendar-o icon" aria-hidden="true"></i>
                </div>
            </div>

            <!--Payment Details End-->

            <div class="input_group">
                <div class="input_box">
                    <button type="submit" class="btn" onclick="openPopup()">PAY NOW</button>
                </div>
            </div>

        </form>
    </div>
    <div class="container" id="container">
        <div class="popup" id="popup">
            <img src="tick.png">
            <h2>Thank You!</h2>
            <p>Your Payment is Successful.</p>
            <button type="button" onclick="closePopup()">Download Recipt</button>
        </div>
    </div>
    <script>
        let popup=document.getElementById("popup");
        let wrap=document.getElementById("wrap");
        let container=document.getElementById("container");
        function openPopup(){
              container.classList.add("open-page");
              popup.classList.add("open-popup");
              wrap.classList.add("close-popup");
        }
        function closePopup(){
        	 window.location.href = "${pageContext.request.contextPath}/TaxiDetails.html";
              
        }
     </script>

</body>

</body>
</html>