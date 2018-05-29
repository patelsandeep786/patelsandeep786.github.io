package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Scanner;
import java.sql.*;

public final class insertion1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Insertion Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

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
 
      out.write("\n");
      out.write(" \n");
      out.write("<script>\n");
      out.write("    window.alert(\"Registered Successfully!!!!!\");\n");
      out.write("</script>\n");
      out.write("\n");
      out.write(" ");
      if (true) {
        _jspx_page_context.forward("login.html");
        return;
      }
      out.write('\n');
      out.write(' ');

        }
        else
        {

      out.write("\n");
      out.write("<script>\n");
      out.write("    window.alert(\"Not Registered Successfully!!!!!\");\n");
      out.write("</script>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "registration.html", out, false);
      out.write('\n');
      out.write(' ');
        
            
        }
        con.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        
    
         
      out.write("\n");
      out.write("            \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
