package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class logout_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<title> LOGIN | Life-Line</title>\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"one.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"logout.css\">\n");
      out.write("        ");

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
           
      out.write("\n");
      out.write("      \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<header>\n");
      out.write("\t\t<h1>Life-Line</h1>\n");
      out.write("\t\t<nav>\n");
      out.write("\t\t\t<ul> <li><a class=\"homered\" href=\"index1.html\">HOME</a></li>\n");
      out.write("                    <li><a class=\"homeblue\" href=\"Aboutus.html\">ABOUT US</a></li>\n");
      out.write("                    <li><a class=\"homeblue\" href=\"Htd.html\">HOW TO DONATE</a></li>\n");
      out.write("                    <li><a class=\"homeblue\" href=\"contactus.html\">CONTACT US</a></li>\n");
      out.write("                    </ul>\n");
      out.write("\t\t\t<a href=\"login.html\">\n");
      out.write("\t\t\t<button id=\"b1\">LogIn</button></a>\n");
      out.write("\t\t<a href=\"registration.html\"><button id=\"b2\">Register</button></a>\n");
      out.write("\t\t</nav>\n");
      out.write("\t</header>\n");
      out.write("\t<div id=\"one\"></div>\n");
      out.write("\n");
      out.write("\t<div class=\"main\">\n");
      out.write("\t\t<div class=\"log\">\n");
      out.write("\t\t\t<img class=\"mark\" src=\"mark1.gif\">\n");
      out.write("\t\t\t<h2>You Have Succesfully Logged Out !!!</h2>\n");
      out.write("\t\t\t<h2>Thank You for your time...</h2>\n");
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
