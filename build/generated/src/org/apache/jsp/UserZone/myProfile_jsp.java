package org.apache.jsp.UserZone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import myPack.DatabaseManager;
import java.sql.ResultSet;

public final class myProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/UserZone/header.jsp");
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
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
      out.write("       <li><a href=\"feedback.jsp\" style=\"box-shadow:6px 8px pink;\"><span class=\"fa fa-phone-square\"></span>Feedback</a></li>\n");
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
      out.write("\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("              \n");
      out.write("                    \n");
      out.write("                    <div class=\"col-sm-12\">\n");
      out.write("            <div class=\"row text-center\" style=\"color: red;font-size: 25px;padding: 1%;font-weight: bold;\">\n");
      out.write("                My Profile<i class=\"fa fa-smile-o fa-spin\"></i>\n");
      out.write("            </div>\n");
      out.write("        </div><br><br><br><br><br>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-3\"></div>\n");
      out.write("            <div class=\"col-sm-6\">\n");
      out.write("                \n");
      out.write("                            ");
 
                                String upid=request.getParameter("up");
                    String cmd1="select * from tb_registration_cust where mobile='"+upid+"'";
                     DatabaseManager db=new DatabaseManager();
                    ResultSet rs1=db.DisplayAllRecords(cmd1);
                                 while(rs1.next())
                            {
                            
      out.write("\n");
      out.write("                             <form action=\"contact_us.jsp\" method=\"post\">\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <label for=\"na\" class=\"form-control\">Name:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   </label>\n");
      out.write("                        <i class=\"input-group-addon\"><span class=\"fa fa-user\"></span></i>\n");
      out.write("                        <input type=\"text\" id=\"na\" value=\"");
      out.print(rs1.getString("name"));
      out.write("\" class=\"form-control\" readonly name=\"textname\">\n");
      out.write("                    </div><br>\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                       <label for=\"em\" class=\"form-control\">Email:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>\n");
      out.write("                        <i class=\"input-group-addon\"><span class=\"fa fa-phone fa-phone\"></span></i>\n");
      out.write("                        <input type=\"email\" id=\"em\" value=\"");
      out.print(rs1.getString("email"));
      out.write("\" class=\"form-control\" readonly name=\"textemail\">\n");
      out.write("                    </div><br>\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <label for=\"mo\" class=\"form-control\">Mobile:&nbsp;&nbsp;&nbsp; </label>\n");
      out.write("                        <i class=\"input-group-addon\"><span class=\"fa fa-phone fa-phone\"></span></i>\n");
      out.write("                        <input type=\"tel\" id=\"mo\" value=\"");
      out.print(rs1.getString("mobile"));
      out.write("\" class=\"form-control\" readonly name=\"textmobile\">\n");
      out.write("                    </div><br>\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <label for=\"sms\" class=\"form-control\">Pin:</label>\n");
      out.write("                        <i class=\"input-group-addon\"><span class=\"fa fa-info\"></span></i>\n");
      out.write("                        <input id=\"sms\" value=\"");
      out.print(rs1.getString("pin"));
      out.write("\" class=\"form-control\" readonly name=\"textmsg\">      \n");
      out.write("                    </div><br>\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <label for=\"adr\" class=\"form-control\">Address:</label>\n");
      out.write("                        <i class=\"input-group-addon\"><span class=\"fa fa-info\"></span></i>\n");
      out.write("                        <input id=\"adr\" value=\"");
      out.print(rs1.getString("addr"));
      out.write("\" class=\"form-control\" readonly name=\"textmsg\">      \n");
      out.write("                    </div><br>\n");
      out.write("                    <input type=\"submit\" class=\"btn form-control btn-danger \" value=\"Edit\" name=\"edit\">\n");
      out.write("                    <input type=\"submit\" class=\"btn form-control btn-danger \" value=\"Update\" name=\"submit\">\n");
      out.write("                </form>\n");
      out.write("                            ");

                            }
                            
      out.write("\n");
      out.write("                    \n");
      out.write("            </div>\n");
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
