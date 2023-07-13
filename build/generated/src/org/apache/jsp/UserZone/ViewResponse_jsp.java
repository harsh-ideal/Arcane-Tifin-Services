package org.apache.jsp.UserZone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import myPack.DatabaseManager;
import java.sql.ResultSet;
import myPack.DatabaseManager;

public final class ViewResponse_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/UserZone/../UserZone/header.jsp");
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

if(session.getAttribute("uid")!=null || session.getAttribute("uid")!="")
{
    out.print(session.getAttribute("uid"));

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("            ");
      out.write("\n");
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
      out.write("        <div class=\"row\" style=\"height:18px; background-color: red; color:white\">\n");
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
      out.write("            <div class=\"col-sm-2\" style=\"box-shadow:5px  red;\">\n");
      out.write("            <img src=\"../img/Logo.png\" style=\"height:55px\" class=\"img img-responsive\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-1\"></div>\n");
      out.write("            <div class=\"col-sm-9\">\n");
      out.write("                <nav class=\"navbar navbar-expand-sm \" style=\"float:right\">\n");
      out.write(" \n");
      out.write("    \n");
      out.write("      \n");
      out.write("      \n");
      out.write("    <ul class=\"nav navbar-nav nav-ifo leest\">\n");
      out.write("        <li class=\"active\" >");

                    String id1=session.getAttribute("uid")+"";
                    
                    String cmd1="select * from tb_registration_cust where mobile='"+id1+"'";
                    DatabaseManager db=new DatabaseManager();
                    ResultSet rs=db.DisplayAllRecords(cmd1);
                    while(rs.next())
                    {
                        
      out.write("<a href=\"myProfile.jsp?up=");
      out.print(rs.getString("mobile"));
      out.write("\" style=\"box-shadow:6px 8px pink;\"> <span class=\"fa fa-home\"></span>My Profile</a></li>\n");
      out.write("                          ");
}
      out.write("\n");
      out.write("       <li><a href=\"Dashboard.jsp\" style=\"box-shadow:6px 8px pink;\"><span class=\"fa fa-inf\"></span> Dashboard</a></li>\n");
      out.write("       <li><a href=\"Listofdistributer.jsp\" style=\"box-shadow:6px 8px pink;\"><span class=\"fa fa-shopping-cart\"></span> Distributer</a></li>\n");
      out.write("       <li><a href=\"feedback.jsp\" style=\"box-shadow:6px 8px pink;\"><span class=\"fa fa-phone-square\"></span>Feedback</a></li>\n");
      out.write("       <li><a href=\"complain.jsp\" style=\"box-shadow:6px 8px pink;\"><span class=\"fa fa-long-arrow-down\"></span>Complain</a></li>\n");
      out.write("      <li><a href=\"AChangePassword.jsp\" style=\"box-shadow:6px 8px pink;\"><span class=\"fa fa-credit-card\"></span>Change password</a></li>\n");
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
      out.write("        <div class=\"container-fluid\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-12\">\n");
      out.write("                <div class=\"col-sm-2\"></div>\n");
      out.write("                <div class=\"col-sm-8\" style=\"margin-top: 3%\">\n");
      out.write("                    <h3 class='text-center text-warning'>View Response Detail</h3>\n");
      out.write("                    <hr style=\"height: 2px;background: orangered;width:50%\">\n");
      out.write("                    <table class='table table-responsive table-bordered' id=\"example\">\n");
      out.write("                        <thead style=\"background: orangered;color: white\">\n");
      out.write("                            <tr>\n");
      out.write("                                <th>SN.</th><th>Mobile</th>\n");
      out.write("                                <th>Complain</th><th>Date</th><th>Type</th><th>Response Status</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                    ");

                    String cmd="select * from tb_complain,tbl_response where tb_complain.mobile=tbl_response.user_id and tb_complain.sn=tbl_response.refer";
                    DatabaseManager db1=new DatabaseManager();
                    ResultSet rs1=db1.DisplayAllRecords(cmd);
                    while(rs1.next())
                    {
                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(rs1.getString("sn"));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs1.getString("mobile"));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs1.getString("complain"));
      out.write("</td>\n");
      out.write("                             <td>");
      out.print(rs1.getString("response"));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs1.getString("cdt"));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs1.getString("type"));
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");

                    }
                        
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-2\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("          <div style=\"height: 240px\"></div>\n");
      out.write("    </body>\n");
      out.write("   \n");
      out.write("</html>\n");

}
else
{
response.sendRedirect("../login.jsp");
}

      out.write('\n');
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
