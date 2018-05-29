package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Contact us</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Contact.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <header>\n");
      out.write("            <nav>\n");
      out.write("                <img class=\"image1\" src=\"heart.jpg\" width=\"200\" height=\"60\" >\n");
      out.write("                                <a href=\"logout.jsp\"><button class=\"buttonlogin\"><b>LOGOUT</b></button></a>\n");
      out.write("\n");
      out.write("                \n");
      out.write("                <h1>LIFE-LINE</h1>\n");
      out.write("               <ul>\n");
      out.write("                    <li><a class=\"homeblue\" href=\"index.html\">HOME</a></li>\n");
      out.write("                          <li><a class=\"homeblue\" href=\"myaccount1.jsp\">MY ACCOUNT</a></li>\n");
      out.write("\n");
      out.write("                    <li><a class=\"homeblue\" href=\"Aboutus.html\">ABOUT US</a></li>\n");
      out.write("                    <li><a class=\"homeblue\" href=\"Htd.html\">HOW TO DONATE</a></li>\n");
      out.write("                    <li><a class=\"homered\" href=\"contactus.html\">CONTACT US</a></li>\n");
      out.write("                     \n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        <div class=\"divider\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"image\" >\n");
      out.write("            <div class=\"contact-title\">\n");
      out.write("                <h1>CONTACT US</h1>\n");
      out.write("                <h2>WE ARE READY TO SERVE YOU!!!!!!!!</h2>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"contact-form\">\n");
      out.write("                <form id=\"contact\" method=\"post\" action=\"\">\n");
      out.write("                    \n");
      out.write("                 <input name=\"name\" type=\"text\" class=\"form-control\" placeholder=\"Your Name\" required><br>\n");
      out.write("                 \n");
      out.write("                 <input name=\"email\" type=\"email\" class=\"form-control\" placeholder=\"Email-Id\" required><br>\n");
      out.write("                    \n");
      out.write("                 <textarea name=\"message\" class=\"form-control\" placeholder=\"Your Message\"  rows=\"5\" required></textarea><br>\n");
      out.write("                   \n");
      out.write("                 <input  type=\"submit\" class=\"form-control submit\" value=\"SEND MESSAGE\"><br>\n");
      out.write("                 \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>    \n");
      out.write("       \n");
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
