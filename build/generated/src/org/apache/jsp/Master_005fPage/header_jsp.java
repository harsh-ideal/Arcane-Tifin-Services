package org.apache.jsp.Master_005fPage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title> Header</title>\n");
      out.write("    <style>\n");
      out.write("        .leest li a{\n");
      out.write("            color: red;\n");
      out.write("            font-size: 16px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/bootstrap-theme.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/hover.css\">\n");
      out.write("      <script src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("    <script  src=\"js/bootstrap.min.js\"></script>\n");
      out.write("   \n");
      out.write(" \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("        <div class=\"row\" style=\"height:16px; background-color:black; color: lightgray\">\n");
      out.write("            <div class=\"col-sm-12\">\n");
      out.write("            <div class=\"col-sm-1\"></div>\n");
      out.write("            <div class=\"col-sm-1\">\n");
      out.write("            <i class=\"fa fa-facebook\">Facebook</i>\n");
      out.write("             \n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-1\">\n");
      out.write("            <i class=\"fa fa-envelope\">Email</i>\n");
      out.write("            \n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-1\">\n");
      out.write("            <i class=\"fa fa-instagram\">Instagram</i>\n");
      out.write("            \n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        \n");
      out.write("       \n");
      out.write("        <div class=\"col-sm-12\">\n");
      out.write("            <div class=\"col-sm-1\" style=\" height:55px\"></div>\n");
      out.write("            <div class=\"col-sm-2\">\n");
      out.write("            <img src=\"img/Logo.png\" style=\"height:55px\" class=\"img img-responsive\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-3\"></div>\n");
      out.write("            <div class=\"col-sm-6\">\n");
      out.write("                <nav class=\"navbar navbar-expand-sm \" style=\"float:right\">\n");
      out.write(" \n");
      out.write("    \n");
      out.write("      \n");
      out.write("      \n");
      out.write("    <ul class=\"nav navbar-nav nav-ifo leest\">\n");
      out.write("      <li class=\"active\" style=\"border-left: red;\"><a href=\"index.jsp\">Home</a></li>\n");
      out.write("      <li style=\"border-left:rigid red;\"><a href=\"registration.jsp\">Registration</a></li>\n");
      out.write("      <li style=\"border-left: red;\"><a href=\"login.jsp\">Login</a></li>\n");
      out.write("      <li style=\"border-left: red;\"><a href=\"about_us.jsp\">About Us</a></li>\n");
      out.write("      <li style=\"border-left: red;\"><a href=\"contact_us.jsp\">Contact Us</a></li>\n");
      out.write("      <li style=\"border-left: red;\"><a href=\"#\">Top List</a></li>\n");
      out.write("    </ul>\n");
      out.write("                    </nav>\n");
      out.write("  </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("   \n");
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
