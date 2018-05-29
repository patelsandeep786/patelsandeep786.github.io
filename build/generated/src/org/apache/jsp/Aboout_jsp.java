package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Aboout_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>LIFE-LINE........................</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link  rel=\"stylesheet\" href=\"About.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <nav>\n");
      out.write("                <img class=\"image1\" src=\"heart.jpg\" width=\"200\" height=\"60\" >\n");
      out.write("                <a href=\"logout.jsp\"><button class=\"buttonlogin\"><b>LOGOUT</b></button></a>\n");
      out.write("                \n");
      out.write("                <h1>LIFE-LINE</h1>\n");
      out.write("               <ul>\n");
      out.write("                    <li><a class=\"homeblue\" href=\"index.html\">HOME</a></li>\n");
      out.write("                    <li><a class=\"homeblue\" href=\"myaccount1.jsp\">MY ACCOUNT</a></li>\n");
      out.write("\n");
      out.write("                    <li><a class=\"homered\" href=\"Aboutus.html\">ABOUT US</a></li>\n");
      out.write("                    <li><a class=\"homeblue\" href=\"Htd.html\">HOW TO DONATE</a></li>\n");
      out.write("                    <li><a class=\"homeblue\" href=\"contactus.html\">CONTACT US</a></li>\n");
      out.write("                    \n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        <div class=\"divider\">\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"image\" >\n");
      out.write("            \n");
      out.write("            <div class=\"Aboutus\">\n");
      out.write("                    <h1>About Us</h1>\n");
      out.write("                    <p id=\"content\">Life-Line is aimed at promoting the awareness of blood donation among the public. It is committed to stay ahead of all linguistic-rational-religious-political differences and shall be fully focusing its objectives in health care activities.\n");
      out.write(" </p>\n");
      out.write("        </div> \n");
      out.write("        </div>\n");
      out.write("        \n");
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
