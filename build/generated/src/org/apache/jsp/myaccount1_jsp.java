package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class myaccount1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title> My Account | Life-Line</title>\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"one.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"myaccount1.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<header>\n");
      out.write("\t\t<h1>Life-Line</h1>\n");
      out.write("\t\t<nav>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<ul> <li><a class=\"homeblue\" href=\"session.jsp\">HOME</a></li>\n");
      out.write("                        <ul> <li><a class=\"homered\" href=\"myaccount1.jsp\">MY ACCOUNT</a></li>\n");
      out.write("                            \n");
      out.write("                    <li><a class=\"homeblue\" href=\"Aboout.jsp\">ABOUT US</a></li>\n");
      out.write("                    <li><a class=\"homeblue\" href=\"How.jsp\">HOW TO DONATE</a></li>\n");
      out.write("                    <li><a class=\"homeblue\" href=\"Contact.jsp\">CONTACT US</a></li>\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("\t\t\t<a href=\"logout.jsp\"><button id=\"b1\">LogOut</button></a>\n");
      out.write("\t\t</nav>\n");
      out.write("\t</header>\n");
      out.write("\t\n");
      out.write("\t<div id=\"one\"></div>\n");
      out.write("\n");
      out.write("\t<div class=\"main\">\n");
      out.write("\t\t<img class=\"img1\" src=\"bg17.gif\">\n");
      out.write("\t\t<div id=\"mone\">\n");
      out.write("\t\t\t<img class=\"one1\" src=\"fac.jpg\">\n");
      out.write("\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div id=\"mtwo\">\n");
      out.write("                    \n");
      out.write("                    <h1 id=\"medpred\">Profile Information</h1>\n");
      out.write("\t\t\t<hr><br>\n");
      out.write("\t\t\t<table id=\"table1\">\n");
      out.write("\t\t\t\t\n");
      out.write("        ");
     
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
            
            
          
      out.write("\n");
      out.write("           \t    <tr>\n");
      out.write("\t\t\t\t\t<td>Name</td>\n");
      out.write("\t\t\t\t\t<td>");
      out.print(rs.getString("Full_Name"));
      out.write("</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td>EmailId</td>\n");
      out.write("\t\t\t\t\t<td>");
      out.print(rs.getString("Email_id"));
      out.write("</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td>Blood Group</td>\n");
      out.write("\t\t\t\t\t<td>");
      out.print(rs.getString("Blood_Group"));
      out.write("</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td>Mobile No</td>\n");
      out.write("\t\t\t\t\t<td>");
      out.print(rs.getString("Mobile_no"));
      out.write("</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td>City</td>\n");
      out.write("\t\t\t\t\t<td>");
      out.print(rs.getString("City"));
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("\t\t\t\t\t<td>Address</td>\n");
      out.write("\t\t\t\t\t<td>");
      out.print(rs.getString("Address"));
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("\t\t\t\t\t<td>Availability</td>\n");
      out.write("\t\t\t\t\t<td>");
      out.print(rs.getString("Availability"));
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                       \t\t\n");
      out.write("\t\t\n");

        } 
        }
}
         catch(Exception e)
        {
            e.printStackTrace();
        } 
         
        
      out.write("\n");
      out.write("             </table>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
