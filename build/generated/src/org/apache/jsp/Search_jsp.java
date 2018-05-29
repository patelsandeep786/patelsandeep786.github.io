package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.*;

public final class Search_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Main Page..............</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"search.css\">\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("         <header>\n");
      out.write("            <nav>\n");
      out.write("                <img class=\"image1\" src=\"heart.jpg\" width=\"200\" height=\"60\" >\n");
      out.write("                <a href=\"index.html\"><button class=\"button\"><b>GO TO SEARCH PAGE</b></button></a>\n");
      out.write("                \n");
      out.write("                <a href=\"index1.html\"><button class=\"buttonlogin\"><b>GO TO HOME PAGE</b></button></a>\n");
      out.write("                \n");
      out.write("                <h1>LIFE-LINE</h1>\n");
      out.write("               </nav>\n");
      out.write("            \n");
      out.write("        </header>\n");
      out.write("        \n");
      out.write("        <div class=\"divider\">\n");
      out.write("        </div>\n");
      out.write("         <div class=\"image\" >\n");
      out.write("           \n");
      out.write("             <h3>DONORS-LIST</h3>\n");
      out.write("        <div class=\"main\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("            <form id=\"formmed\">\n");
      out.write("                <table>\n");
      out.write("                     <tr>\n");
      out.write("\t\t\t\t<th>Name</th>\n");
      out.write("                                <th>Available/Unavailable</th>\n");
      out.write("                                <th>Mobile No</th>\n");
      out.write("                                <th>Email ID</th>\n");
      out.write("                                <th>Address</th>\n");
      out.write("        </tr>\n");
      out.write("              \n");
      out.write("        ");
      String bg=request.getParameter("Blood_Group");
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
            
        
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("       \n");
      out.write("        <tr>\n");
      out.write("           \n");
      out.write("                <td>");
      out.print(rs.getString("Full_Name"));
      out.write("</td>\n");
      out.write("        \t<td>");
      out.print(rs.getString("Availability"));
      out.write("</td>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("                <td>");
      out.print(rs.getString("Mobile_no"));
      out.write("</td>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t<td>");
      out.print(rs.getString("Email_id"));
      out.write("</td>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t<td>");
      out.print(rs.getString("Address"));
      out.write("</td>\n");
      out.write("\t</tr>\n");
      out.write("                     \t\t\n");
      out.write("\t\t\n");

        }
}
         catch(Exception e)
        {
            e.printStackTrace();
        } 
         
        
      out.write("\n");
      out.write("                </table>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("                 </div>\n");
      out.write("      </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
