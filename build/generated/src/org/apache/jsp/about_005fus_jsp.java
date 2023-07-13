package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_005fus_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Master_Page/header.jsp");
    _jspx_dependants.add("/Master_Page/footer.jsp");
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
      out.write("        <div >\n");
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
      out.write("        <div class=\"row\" style=\"height:18px; background-color:gray; color:black\">\n");
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
      out.write("            <img src=\"img/Logo.png\" style=\"height:55px\" class=\"img img-responsive\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-2\"></div>\n");
      out.write("            <div class=\"col-sm-7\">\n");
      out.write("                <nav class=\"navbar navbar-expand-sm \" style=\"float:right\">\n");
      out.write(" \n");
      out.write("    \n");
      out.write("      \n");
      out.write("      \n");
      out.write("    <ul class=\"nav navbar-nav nav-ifo leest\">\n");
      out.write("        <li class=\"active\" ><a href=\"index.jsp\" style=\"box-shadow:6px 8px pink;\"><spna class=\"fa fa-home\"></spna> Home</a></li>\n");
      out.write("       <li><a href=\"about_us.jsp\" style=\"box-shadow:6px 8px pink;\"><spna class=\"fa fa-inf\"></spna> About Us</a></li>\n");
      out.write("       <li><a href=\"contact_us.jsp\" style=\"box-shadow:6px 8px pink;\"><spna class=\"fa fa-phone-square\"></spna> Contact Us</a></li>\n");
      out.write("       <li><a href=\"login.jsp\" style=\"box-shadow:6px 8px pink;\"><spna class=\"fa fa-long-arrow-down\"></spna> Login</a></li>\n");
      out.write("      <li><a href=\"registration.jsp\" style=\"box-shadow:6px 8px pink;\"><spna class=\"fa fa-credit-card\"></spna> Registration</a></li>\n");
      out.write("      <li ><a href=\"top_list.jsp\" style=\"box-shadow:5px 8px pink;\"><spna class=\"fa fa-list\"></spna> Top List</a></li>\n");
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
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <br><br><br><div class=\"container-fluid\">\n");
      out.write("            <div class=\"row \">\n");
      out.write("        <div class=\"col-sm-12\" style=\"color: red;font-size: 35px;font-weight: bold; text-align: center\">\n");
      out.write("            \n");
      out.write("                About Us<i class=\"fa fa-smile-o fa-spin\"></i>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("            <div class=\"col-sm-12\">\n");
      out.write("                <div class=\"col-sm-3\"></div>\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><h4>Good food!<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Good Life<i class=\"fa fa-smile-o\"></i></h4></li>\n");
      out.write("                        <li><h4>Fresh food at your fingertips<i class=\"fa fa-hand-o-up\"></i></h4></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <p style=\"font-size:18px; text-align: justify;\">\n");
      out.write("                        <br>Hello, Welcome to Arcane Tiffin Service. This website is made for your convenience.\n");
      out.write("                        ATS help you to find a good and healthy food at your doorstep.If you are Distributor then we help you to expand your business.This is a platform where distributor and customer are connected.<br>\n");
      out.write("\n");
      out.write("<br>Motive of this website is to help those people who stay out of station. Or those people who need food.\n");
      out.write("This platform are also help to distributer to expand our business.\n");
      out.write("                        </p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("            </div>\n");
      out.write("         <div style=\"height: 250px;\"></div>\n");
      out.write("        <div>\n");
      out.write("      ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("       \n");
      out.write("       \n");
      out.write("    </head>\n");
      out.write("       \n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("           <div class=\"row\" style=\"background-color:grey;\">\n");
      out.write("                 <div class=\"col-sm-12\">\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                            <img src=\"img/Logo.png\">\n");
      out.write("                        <br>\n");
      out.write("                        <h4>Address:MM 45 ,Sector L,<br><br> Aliganj,Lucknow<br><br> Pin Code-226024</h4>\n");
      out.write("                      \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                        <h3><b>Top Link</b></h3><br>\n");
      out.write("                        \n");
      out.write("                       <ul style=\"list-style-type:none\">\n");
      out.write("                           <li><a href=\"index.jsp\"style='color:black; font-size: 18px;'>Home</a></li>\n");
      out.write("                           <li><a href=\"login.jsp\"style='color:black; font-size: 18px;'>Login</a></li>\n");
      out.write("                           <li><a href=\"top_list.jsp\"style='color:black; font-size: 18px;'>Top List</a></li>\n");
      out.write("                           <li><a href=\"about_us.jsp\"style='color:black; font-size: 18px;'>About Us</a></li>\n");
      out.write("                           <li><a href=\"contact_us.jsp\"style='color:black; font-size: 18px;'>Contact Us</a></li>\n");
      out.write("                           <li><a href=\"registration.jsp\"style='color:black;font-size: 18px;'>Registration</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                           \n");
      out.write("                    </div>\n");
      out.write("                     <div class=\" col-sm-4\">\n");
      out.write("                         <h3><b>Contact Details:</b></h3><br>\n");
      out.write("                         <i class=\"fa fa-instagram\" style='color:black; font-size: 18px;'> <b>Instagram: </b>@harsh_ideal</i><br><br>\n");
      out.write("                         <i class=\"fa fa-envelope\" style='color:black; font-size: 18px;'> <b>Email: </b>harshideal2002@gmail.com</i><br><br>\n");
      out.write("                         <i class=\"fa fa-phone-square\" style='color:black; font-size: 18px;'> <b>Mobile No.: </b>96965885355,9889585355</i><br><br>\n");
      out.write("                     </div>\n");
      out.write("                 </div>\n");
      out.write("           </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </body>\n");
      out.write("    \n");
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
