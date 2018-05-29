
<%@page import="java.util.Scanner"%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insertion Page</title>
    </head>
    <body>
        <%
           String name=request.getParameter("Full_Name");
        String bg=request.getParameter("Blood_Group");
          String mob=request.getParameter("Mobile_no");
        String city=request.getParameter("City");
          String mail=request.getParameter("Email_id");
        String uid=request.getParameter("Address");
          String password=request.getParameter("Password");
        String availability=request.getParameter("Availability");
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank","root","");
        out.println("connection done");
            PreparedStatement pst=con.prepareStatement("insert into lifeline values(?,?,?,?,?,?,?,?)");
        pst.setString(1,name);
        pst.setString(2,bg);
        pst.setString(3,mob);
        pst.setString(4,city);
        pst.setString(5,mail);
        pst.setString(6,uid);
        pst.setString(7,password);
        pst.setString(8,availability);
      
        int count = pst.executeUpdate();
            
            if(count > 0)
            {
 %>
 
<script>
    window.alert("Registered Successfully!!!!!");
</script>

 <jsp:forward page="login.html"></jsp:forward>
 <%
        }
        else
        {
%>
<script>
    window.alert("Not Registered Successfully!!!!!");
</script>
<jsp:include page="registration.html"></jsp:include>
 <%        
            
        }
        con.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        
    
         %>
            
    </body>
</html>
