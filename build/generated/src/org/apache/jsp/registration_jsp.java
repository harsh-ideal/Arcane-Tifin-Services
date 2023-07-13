package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Master_Page/header.jsp");
  }

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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"row\"> \n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title> Header</title>\n");
      out.write("    <style>\n");
      out.write("        .navbar-header a,.navbar-nav li a{\n");
      out.write("            color: Black;\n");
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
      out.write("        <div class=\"row\" style=\"height:16px; background-color:green;\">\n");
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
      out.write("        </div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-1\" style=\"background-color:red; height:50px\"></div>\n");
      out.write("            <div class=\"col-sm-2\">\n");
      out.write("            <img src=\"img/Logo.png\" style=\"height:55px\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-9\">\n");
      out.write("                <nav class=\"navbar navbar-expand-sm \" style=\"background-color:red\">\n");
      out.write("  <div class=\"container-fluid\" >\n");
      out.write("    <div class=\"navbar-header col-sm-4\">\n");
      out.write("        <a class=\"navbar-brand\" href=\"#\"></a>\n");
      out.write("    </div>\n");
      out.write("      <div class=\"col-sm-3\"></div>\n");
      out.write("    <ul class=\"nav navbar-nav nav-ifo\">\n");
      out.write("      <li class=\"active\"><a href=\"#\">Home</a></li>\n");
      out.write("      <li><a href=\"#\">Registration</a></li>\n");
      out.write("      <li><a href=\"#\">Login</a></li>\n");
      out.write("      <li><a href=\"#\">About Us</a></li>\n");
      out.write("      <li><a href=\"#\">Contact Us</a></li>\n");
      out.write("      <li><a href=\"#\">Top List</a></li>\n");
      out.write("      <li><a href=\"#\">Join us</a></li>\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("   \n");
      out.write("            \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-12\">\n");
      out.write("            <div class=\"row text-center\" style=\"color: red;font-size: 25px;padding: 1%;font-weight: bold;\">\n");
      out.write("                Register Here<i class=\"fa fa-smile-o fa-spin\"></i>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-3\"></div>\n");
      out.write("            <div class=\"col-sm-6\">\n");
      out.write("                <form action=\"post\" method=\"#\">\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <i class=\"input-group-addon\"><span class=\"fa fa-building\"></span></i>\n");
      out.write("                        <input type=\"text\" placeholder=\"Enter your Tifin Service's name here\" class=\"form-control\">\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <i class=\"input-group-addon\"><span class=\"fa fa-user\"></span></i>\n");
      out.write("                        <input type=\"text\" placeholder=\"Enter name here\" class=\"form-control\">\n");
      out.write("                    </div><br>\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <i class=\"input-group-addon\"><span class=\"fa fa-phone fa-phone\"></span></i>\n");
      out.write("                        <input type=\"tel\" placeholder=\"Enter mobile numbere here\" class=\"form-control\">\n");
      out.write("                    </div><br>\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <i class=\"input-group-addon\"><span class=\"fa fa-envelope\"></span></i>\n");
      out.write("                        <input type=\"email\" placeholder=\"Enter email here\" class=\"form-control\">\n");
      out.write("                    </div><br>\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <i class=\"input-group-addon\"><span class=\"fa fa-code\"></span></i>\n");
      out.write("                        <input type=\"text\" placeholder=\"Enter pin code here\" class=\"form-control\">\n");
      out.write("                    </div><br>\n");
      out.write("                    \n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <i class=\"input-group-addon\"><span class=\"fa fa-location-arrow\"></span></i>\n");
      out.write("                        <textarea name=\"add\" placeholder=\"Enter Address here\" rows=\"4\" cols=\"40\" class=\"form-control\"></textarea>\n");
      out.write("                    </div><br>\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <i class=\"input-group-addon\"><span class=\"fa fa-info\"></span></i>\n");
      out.write("                        <textarea type=\"text\" placeholder=\"Write Description of your service\" rows=\"4\" cols=\"40\" class=\"form-control\"></textarea>\n");
      out.write("                    </div><br>\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <i class=\"input-group-addon\"><span class=\"fa fa-key fa-spin\"></span></i>\n");
      out.write("                        <input type=\"password\" placeholder=\"Enter password here\" class=\"form-control\">\n");
      out.write("                    </div><br>\n");
      out.write("                    <input type=\"submit\" class=\"btn form-control btn-danger \" value=\"Register\">\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-3\"></div>\n");
      out.write("        </div>\n");
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
