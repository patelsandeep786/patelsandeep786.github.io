<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
	<title> My Account | Life-Line</title>
	<link rel="stylesheet" type="text/css" href="one.css">
	<link rel="stylesheet" type="text/css" href="myaccount1.css">
</head>
<body>
	<header>
		<h1>Life-Line</h1>
		<nav>
			
			<ul> <li><a class="homeblue" href="session.jsp">HOME</a></li>
                        <ul> <li><a class="homered" href="myaccount1.jsp">MY ACCOUNT</a></li>
                            
                    <li><a class="homeblue" href="Aboout.jsp">ABOUT US</a></li>
                    <li><a class="homeblue" href="How.jsp">HOW TO DONATE</a></li>
                    <li><a class="homeblue" href="Contact.jsp">CONTACT US</a></li>
                    </ul>

			<a href="logout.jsp"><button id="b1">LogOut</button></a>
		</nav>
	</header>
	
	<div id="one"></div>

	<div class="main">
		<img class="img1" src="bg17.gif">
		<div id="mone">
			<img class="one1" src="fac.jpg">
		
		</div>

		<div id="mtwo">
                    
                    <h1 id="medpred">Profile Information</h1>
			<hr><br>
			<table id="table1">
				
        <%     
         try{
             session= request.getSession(false);
             if(session!=null)
             {
                 String us=(String)session.getAttribute("Email_id");
                
           
           
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank","root", ""); 
            PreparedStatement ps = con.prepareStatement("Select * from lifeline where Email_id=?" );
           ps.setString(1, us);
 
            ResultSet rs=ps.executeQuery();
          
            while(rs.next()==true)
        {
            
            
          %>
           	    <tr>
					<td>Name</td>
					<td><%=rs.getString("Full_Name")%></td>
				</tr>

				<tr>
					<td>EmailId</td>
					<td><%=rs.getString("Email_id")%></td>
				</tr>

				<tr>
					<td>Blood Group</td>
					<td><%=rs.getString("Blood_Group")%></td>
				</tr>

				<tr>
					<td>Mobile No</td>
					<td><%=rs.getString("Mobile_no")%></td>
				</tr>

				<tr>
					<td>City</td>
					<td><%=rs.getString("City")%></td>
                                </tr>
                                <tr>
					<td>Address</td>
					<td><%=rs.getString("Address")%></td>
                                </tr>
                                <tr>
					<td>Availability</td>
					<td><%=rs.getString("Availability")%></td>
                                </tr>


                       		
		
<%
        } 
        }
}
         catch(Exception e)
        {
            e.printStackTrace();
        } 
         
        %>
             </table>
		</div>
	</div>
</body>
</html>