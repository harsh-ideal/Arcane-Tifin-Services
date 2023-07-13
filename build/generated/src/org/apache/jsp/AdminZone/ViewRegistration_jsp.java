package org.apache.jsp.AdminZone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import myPack.DatabaseManager;

public final class ViewRegistration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/AdminZone/header.jsp");
    _jspx_dependants.add("/AdminZone/Footer.jsp");
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
      out.write("        <link href=\"../css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"../css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function(){\n");
      out.write("                $(\"#example\").DataTable();\n");
      out.write("                \n");
      out.write("            })\n");
      out.write("            </script>\n");
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
      out.write("    <script src=\"../js/jquery-3.3.1.min.js\"></script>\n");
      out.write("    <script  src=\"../js/bootstrap.min.js\"></script>\n");
      out.write("    <link href=\"../js/akash.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <script src=\"../js/akash.js\" type=\"text/javascript\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"col-sm-12\">\n");
      out.write("                <div class=\"col-sm-9\"></div>\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                     <a href=\"Dashboard.jsp\" class=\"btn btn-dblue btn-lg\" role=\"button\"><span class=\"glyphicon glyphicon-user glyphsize\"></span> <br /><span class=\"glyphicon glyphicon-list green\"></span>Dashboard</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>   \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-12\">\n");
      out.write("                <div class=\"col-sm-2\"></div>\n");
      out.write("                <div class=\"col-sm-8\" style=\"margin-top: 3%\">\n");
      out.write("                    <h3 class='text-center text-warning'>View Contact Details</h3>\n");
      out.write("                    <hr style=\"height: 2px;background: orangered;width:50%\">\n");
      out.write("                    <table class='table table-responsive table-bordered' id=\"example\">\n");
      out.write("                        <thead style=\"background: orangered;color: white\">\n");
      out.write("                            <tr>\n");
      out.write("                                <th>SN.</th><th>Name</th><th>Email</th><th>Mobile</th>\n");
      out.write("                                <th>Message</th><th>Date</th><th>Delete</th><th>EDIT</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                    ");

                    String cmd="select * from tb_contact";
                    DatabaseManager db=new DatabaseManager();
                    ResultSet rs=db.DisplayAllRecords(cmd);
                    while(rs.next())
                    {
                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(rs.getString("cid"));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString("name"));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString("email"));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString("mobile"));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString("massage"));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString("cdt"));
      out.write("</td>\n");
      out.write("                            <td>\n");
      out.write("    <a href=\"Enquirydelete.jsp?del=");
      out.print(rs.getString("cid"));
      out.write("\"> \n");
      out.write("        <span class='fa fa-trash-o'></span>\n");
      out.write("    </a>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <a href=\"Enquiryupdate.jsp?up=");
      out.print(rs.getString("cid"));
      out.write("\">\n");
      out.write("                                <span class='fa fa-edit'></span>\n");
      out.write("                                </a>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                            \n");
      out.write("                            ");

                        
                    }        
                    
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-2\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("                     <div style=\"height: 240px\"></div>\n");
      out.write("                    \n");
      out.write("                    <div>\n");
      out.write("            ");
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
      out.write("                            <img src=\"../img/Logo.png\">\n");
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
