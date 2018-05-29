
<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
         String uid=request.getParameter("Email_id");
        String pass=request.getParameter("Password");
        
        
    
      
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank","root","");
        PreparedStatement pst=con.prepareStatement(
                "select * from lifeline where Email_id=?"
                +"and Password=?");
        pst.setString(1, uid);
        pst.setString(2, pass);
        ResultSet rs=pst.executeQuery();
        if(rs.isBeforeFirst())
        {
            session =request.getSession(true);
            session.setAttribute("Email_id",uid);
 %>
 <jsp:forward page="myaccount1.jsp"></jsp:forward>
 <%
        }
        else
        {
%>
<script>
    window.alert("Invalid Emailid or password");
</script>
<jsp:include page="login.html"></jsp:include>
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
