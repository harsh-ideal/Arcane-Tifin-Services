package org.apache.jsp.Distributer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import myPack.DatabaseManager;

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
      out.write("    <link href=\"../css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"../css/bootstrap-theme.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"../css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"../css/hover.css\">\n");
      out.write("      <script src=\"../js/jquery-3.3.1.min.js\"></script>\n");
      out.write("    <script  src=\"../js/bootstrap.min.js\"></script>\n");
      out.write("   \n");
      out.write(" \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("        <div class=\"row\" style=\"height:18px; background-color:red; color:white\">\n");
      out.write("            <div class=\"col-sm-12\">\n");
      out.write("            <div class=\"col-sm-1\"></div>\n");
      out.write("            <div class=\"col-sm-2\">\n");
      out.write("                <i class=\"fa fa-facebook\"><b>Facebook:</b>Harsh Srivastva</i>\n");
      out.write("             \n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-3\">\n");
      out.write("                <i class=\"fa fa-envelope\"><b>Email:</b>harshideal2002@gmail.com</i>\n");
      out.write("            \n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-2\">\n");
      out.write("                <i class=\"fa fa-instagram\"><b>Instagram:</b>@harsh_ideal</i>\n");
      out.write("            \n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-1\"></div>\n");
      out.write("            <div class=\"col-sm-3\">\n");
      out.write("                <b>Our Website Work 24*7</b>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        \n");
      out.write("       \n");
      out.write("        <div class=\"col-sm-12\">\n");
      out.write("            <div class=\"col-sm-1\" style=\" height:55px\"></div>\n");
      out.write("            <div class=\"col-sm-2\"style=\"box-shadow:5px  red;\">\n");
      out.write("            <img src=\"../img/Logo.png\" style=\"height:55px\" class=\"img img-responsive\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-1\"></div>\n");
      out.write("            <div class=\"col-sm-8\">\n");
      out.write("                <nav class=\"navbar navbar-expand-sm \" style=\"float:right\">\n");
      out.write(" \n");
      out.write("    \n");
      out.write("      \n");
      out.write("      \n");
      out.write("    <ul class=\"nav navbar-nav nav-ifo leest\">\n");
      out.write("        <li class=\"active\" ><a href=\"myProfile.jsp\" style=\"box-shadow:6px 8px pink;\"><span class=\"fa fa-home\"></span>My Profile</a></li>\n");
      out.write("       <li><a href=\"Dashboard.jsp\" style=\"box-shadow:6px 8px pink;\"><span class=\"fa fa-inf\"></span> Dashboard</a></li>\n");
      out.write("       <li><a href=\"viewfeedback\" style=\"box-shadow:6px 8px pink;\"><span class=\"fa fa-phone-square\"></span>View Feedback</a></li>\n");
      out.write("       <li><a href=\"complain.jsp\" style=\"box-shadow:6px 8px pink;\"><span class=\"fa fa-long-arrow-down\"></span>Complain</a></li>\n");
      out.write("      <li><a href=\"AchangePassword.jsp\" style=\"box-shadow:6px 8px pink;\"><span class=\"fa fa-credit-card\"></span>Change password</a></li>\n");
      out.write("      <li><a href=\"../index.jsp\" style=\"box-shadow:5px 8px pink;\"><span class=\"fa fa-list\"></span> Logout</a></li>\n");
      out.write("    </ul>\n");
      out.write("                    </nav>\n");
      out.write("  </div>\n");
      out.write("  </div>\n");
      out.write("            \n");
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
