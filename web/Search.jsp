
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>

<html>
    <head>
        <title>Main Page..............</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="search.css">
    </head>
    
    <body>
        
         <header>
            <nav>
                <img class="image1" src="heart.jpg" width="200" height="60" >
                <a href="index.html"><button class="button"><b>GO TO SEARCH PAGE</b></button></a>
                
                <a href="index1.html"><button class="buttonlogin"><b>GO TO HOME PAGE</b></button></a>
                
                <h1>LIFE-LINE</h1>
               </nav>
            
        </header>
        
        <div class="divider">
        </div>
         <div class="image" >
           
             <h3>DONORS-LIST</h3>
        <div class="main">
        
        
            <form id="formmed">
                <table>
                     <tr>
				<th>Name</th>
                                <th>Available/Unavailable</th>
                                <th>Mobile No</th>
                                <th>Email ID</th>
                                <th>Address</th>
        </tr>
              
        <%      String bg=request.getParameter("Blood_Group");
             String city=request.getParameter("City");
            
         try{
            

            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank","root", ""); 
            PreparedStatement ps = con.prepareStatement("Select * from lifeline where Blood_Group=? and City=?" );
           
            ps.setString(1,bg);
            ps.setString(2,city);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()==true)
        {
            
        %>
        
        
       
        <tr>
           
                <td><%=rs.getString("Full_Name")%></td>
        	<td><%=rs.getString("Availability")%></td>
				
					
                <td><%=rs.getString("Mobile_no")%></td>
					
		<td><%=rs.getString("Email_id")%></td>
					
		<td><%=rs.getString("Address")%></td>
	</tr>
                     		
		
<%
        }
}
         catch(Exception e)
        {
            e.printStackTrace();
        } 
         
        %>
                </table>
            </form>
        </div>
                 </div>
      </body>
</html>


