<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title> LOGIN | Life-Line</title>
	<link rel="stylesheet" type="text/css" href="one.css">
	<link rel="stylesheet" type="text/css" href="logout.css">
        <%
     try{
             session= request.getSession(false);
             if(session!=null)
             {
                session.setAttribute("Email_id", null);
                session.invalidate();
             }
     }
             catch(Exception e)
                     {
                     
                     }
           %>
      
</head>
<body>
	<header>
		<h1>Life-Line</h1>
		<nav>
			<ul> <li><a class="homered" href="index1.html">HOME</a></li>
                    <li><a class="homeblue" href="Aboutus.html">ABOUT US</a></li>
                    <li><a class="homeblue" href="Htd.html">HOW TO DONATE</a></li>
                    <li><a class="homeblue" href="contactus.html">CONTACT US</a></li>
                    </ul>
			<a href="login.html">
			<button id="b1">LogIn</button></a>
		<a href="registration.html"><button id="b2">Register</button></a>
		</nav>
	</header>
	<div id="one"></div>

	<div class="main">
		<div class="log">
			<img class="mark" src="mark1.gif">
			<h2>You Have Succesfully Logged Out !!!</h2>
			<h2>Thank You for your time...</h2>
		</div>
	</div>
</body>
</html>