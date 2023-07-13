package org.apache.jsp.AdminZone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import myPack.DatabaseManager;

public final class AChangePassword_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/AdminZone/header.jsp");
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

      out.write('\n');

if(session.getAttribute("aid")!=null && session.getAttribute("aid")!="")
{
   out.print(session.getAttribute("aid"));

      out.write('\n');

    if(request.getParameter("submit")!=null)
    {
String id=session.getAttribute("aid")+"";
String oldpass=request.getParameter("txtoldpass");
String newpass=request.getParameter("txtnewpassword");
String cpass=request.getParameter("txtconfirmpassword");
if(newpass.equals(cpass))
{
    String cmd="update tbl_login set password='"+newpass+"' where userid='"+id+"' and password='"+oldpass+"'";
    DatabaseManager db=new DatabaseManager();
    if(db.MyInsertUpdateDelete(cmd))
           out.print("<script>alert('password change successfully')</script>"); 
    else
        out.print("<script>alert('Invalid password')</script>");
}
else
   out.print("<script>alert('Newpassword and confirm password not match')</script>"); 
    }

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Change Password</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"row\">\n");
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
      out.write("        body{\n");
      out.write("            font-family: 'Titillium Web', sans-serif;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Titillium+Web:wght@200&display=swap\" rel=\"stylesheet\">\n");
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
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-12\">\n");
      out.write("                <div class=\"col-sm-4\"></div>\n");
      out.write("                <div class=\"col-sm-4\">\n");
      out.write("                    <form action=\"AChangePassword.jsp\" method=\"post\">\n");
      out.write("                        Enter Old Password\n");
      out.write("                        <input type=\"password\" name=\"txtoldpass\" class=\"form-control\">\n");
      out.write("                        Enter New Password\n");
      out.write("                        <input type=\"password\" name=\"txtnewpassword\" class=\"form-control\">\n");
      out.write("                        Enter Confirm Password\n");
      out.write("                        <input type=\"password\" name=\"txtconfirmpassword\" class=\"form-control\">\n");
      out.write("                        <br>\n");
      out.write("                        <input type=\"submit\" class=\"form-control btn-info\" name=\"submit\" value=\"Change Password\">\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                  <div class=\"col-sm-4\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
