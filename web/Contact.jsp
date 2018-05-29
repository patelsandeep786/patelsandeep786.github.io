<html>
    <head>
        <title>Contact us</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="Contact.css">
    </head>
    <body>
         <header>
            <nav>
                <img class="image1" src="heart.jpg" width="200" height="60" >
                                <a href="logout.jsp"><button class="buttonlogin"><b>LOGOUT</b></button></a>

                
                <h1>LIFE-LINE</h1>
               <ul>
                    <li><a class="homeblue" href="session.jsp">HOME</a></li>
                          <li><a class="homeblue" href="myaccount1.jsp">MY ACCOUNT</a></li>

                    <li><a class="homeblue" href="About.jsp">ABOUT US</a></li>
                    <li><a class="homeblue" href="How.jsp">HOW TO DONATE</a></li>
                    <li><a class="homered" href="Contact.jsp">CONTACT US</a></li>
                     
                </ul>
            </nav>
        </header>
        <div class="divider">
        </div>
        <div class="image" >
            <div class="contact-title">
                <h1>CONTACT US</h1>
                <h2>WE ARE READY TO SERVE YOU!!!!!!!!</h2>
            </div>
            <div class="contact-form">
                <form id="contact" method="post" action="">
                    
                 <input name="name" type="text" class="form-control" placeholder="Your Name" required><br>
                 
                 <input name="email" type="email" class="form-control" placeholder="Email-Id" required><br>
                    
                 <textarea name="message" class="form-control" placeholder="Your Message"  rows="5" required></textarea><br>
                   
                 <input  type="submit" class="form-control submit" value="SEND MESSAGE"><br>
                 
                </form>
            </div>
        </div>    
       
    </body>
</html>
