package org.apache.jsp.UserZone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import myPack.DatabaseManager;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.sql.ResultSet;
import myPack.DatabaseManager;

public final class complain_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/UserZone/header.jsp");
    _jspx_dependants.add("/UserZone/footer.jsp");
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

    String id=session.getAttribute("uid")+"";
    if(id!=null)
      {
        if(request.getParameter("complain")!=null)
       {
        String msg=request.getParameter("textmsg");
        SimpleDateFormat sm=new SimpleDateFormat();
        String dt=sm.format(new Date());
        String cmd="insert into tb_complain(mobile,complain,cdt,type) values('"+ id +"','"+msg+"','"+dt+"','user')";
        
        DatabaseManager db1=new DatabaseManager();
        if(db1.MyInsertUpdateDelete(cmd))
        {
            out.print("<script>alert('Complain save succesfuly')</script>");
        }
        else
        {
            out.print("<script>alert('Unable to save')</script>");
        }
       }     
      
    
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("         <div class=\"row\">\n");
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
      out.write("         <div class=\"col-sm-12\">\n");
      out.write("            <div class=\"row text-center\" style=\"color: red;font-size: 25px;padding: 1%;font-weight: bold;\">\n");
      out.write("                Complain<i class=\"fa fa-smile-o fa-spin\"></i>\n");
      out.write("            </div>\n");
      out.write("        </div><br><br><br><br><br>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-3\"></div>\n");
      out.write("            <div class=\"col-sm-6\">\n");
      out.write("                <form action=\"complain.jsp\" method=\"post\">\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <i class=\"input-group-addon\"><span class=\"fa fa-info\"></span></i>\n");
      out.write("                        <textarea placeholder=\"Write Your complain here\" rows=\"3\" cols=\"24\" class=\"form-control\" name=\"textmsg\"></textarea>\n");
      out.write("                    </div><br>\n");
      out.write("                    <input type=\"submit\" class=\"btn form-control btn-danger \" value=\"Submit Complain\" name=\"complain\">\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("         <div style=\"height: 250px;\"></div>\n");
      out.write("        <div>\n");
      out.write("       ");
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
      out.write("           <div class=\"row\" style=\" color:white; background-color:grey;\">\n");
      out.write("                 <div class=\"col-sm-12\">\n");
      out.write("                     <div class=\"col-sm-1\"></div>\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <br><img src=\"../img/Logo.png\" style=\"height:58px\" class=\"img img-responsive\" >\n");
      out.write("                        <br>\n");
      out.write("                        <h4 style=\"color:white;\">Address:MM 45 ,Sector L,<br> Aliganj,Lucknow<br> Pin Code-226024</h4>\n");
      out.write("                      \n");
      out.write("                    </div>\n");
      out.write("                     <div class=\"col-sm-1\"></div>\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <h3><b>&nbsp;&nbsp;&nbsp;&nbsp;Top Link</b></h3><br>\n");
      out.write("                        \n");
      out.write("                       <ul style=\"list-style-type:none\">\n");
      out.write("                           <li><a href=\"myProfile.jsp\" style='color:white; font-size: 18px;'>My Profile</a></li>\n");
      out.write("                           <li><a href=\"AChangePassword.jsp\" style='color:white; font-size: 18px;'>Change Password</a></li>\n");
      out.write("                           <li><a href=\"complain.jsp\" style='color:white; font-size: 18px;'>Complain</a></li>\n");
      out.write("                           <li><a href=\"Dashboard.jsp\" style='color:white; font-size: 18px;'>DAshboard</a></li>\n");
      out.write("                           <li><a href=\"feedback.jsp\" style='color:white; font-size: 18px;'>Feedback</a></li>\n");
      out.write("                           <li><a href=\"Listofdistributer.jsp\" style='color:white; font-size: 18px;'>List Of Distributer</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                           \n");
      out.write("                    </div>\n");
      out.write("                     <div class=\"col-sm-1\"></div>\n");
      out.write("                     <div class=\" col-sm-3\">\n");
      out.write("                         <h3><b>Contact Details:</b></h3><br>\n");
      out.write("                         <i class=\"fa fa-instagram\" style='font-size: 18px;'> <b>Instagram: </b>@harsh_ideal</i><br><br>\n");
      out.write("                         <i class=\"fa fa-envelope\" style='font-size: 18px;'> <b>Email: </b>harshideal2002@gmail.com</i><br><br>\n");
      out.write("                         <i class=\"fa fa-phone-square\" style='font-size: 18px;'> <b>Mobile No.: </b>96965885355,9889585355</i><br><br>\n");
      out.write("                     </div>\n");
      out.write("                 </div>\n");
      out.write("           </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");

      }
    else
        {
                response.sendRedirect("../login.jsp");      
        }
    
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
