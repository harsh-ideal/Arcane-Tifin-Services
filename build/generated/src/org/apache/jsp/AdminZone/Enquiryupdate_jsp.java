package org.apache.jsp.AdminZone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import myPack.DatabaseManager;
import java.sql.ResultSet;

public final class Enquiryupdate_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");

if(session.getAttribute("uid")!=null && session.getAttribute("uid")!="")
{
   out.print(session.getAttribute("uid"));

      out.write('\n');
 
    if(request.getParameter("submit")!=null){
        String name=request.getParameter("textname");
        String email=request.getParameter("textemail");
        String mobile=request.getParameter("textmobile");
        String msg=request.getParameter("textmsg");
        String upid=request.getParameter("up");
        SimpleDateFormat sm=new SimpleDateFormat();
        String dt=sm.format(new Date());
        String cmd="update tb_contact set name='"+name+"',email='"+email+"',mobile='"+mobile+"',massage='"+msg+"',cdt='"+dt+"' where cid='"+upid+"'";
        DatabaseManager db=new DatabaseManager();
        if(db.MyInsertUpdateDelete(cmd))
        {
            out.print("<script>alert('Update succesfuly');window.location='ViewRegistration.jsp'</script>");
        }
        else
        {
            out.print("<script>alert('Unable to update')</script>");
        }
    }

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
      out.write("        ");

                    String upid=request.getParameter("up");
                    String cmd1="select * from tb_contact where cid='"+upid+"'";
                     DatabaseManager db=new DatabaseManager();
                    ResultSet rs1=db.DisplayAllRecords(cmd1);
                    
      out.write("\n");
      out.write("              \n");
      out.write("                    \n");
      out.write("                    <div class=\"col-sm-12\">\n");
      out.write("            <div class=\"row text-center\" style=\"color: red;font-size: 25px;padding: 1%;font-weight: bold;\">\n");
      out.write("                Edit Contact Info<i class=\"fa fa-smile-o fa-spin\"></i>\n");
      out.write("            </div>\n");
      out.write("        </div><br><br><br><br><br>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-3\"></div>\n");
      out.write("            <div class=\"col-sm-6\">\n");
      out.write("                            ");
 while(rs1.next()){
      out.write("\n");
      out.write("                            <form action=\"#\" method=\"post\">\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <label for=\"na\" class=\"form-control\">Name:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   </label>\n");
      out.write("                        <i class=\"input-group-addon\"><span class=\"fa fa-user\"></span></i>\n");
      out.write("                        <input type=\"text\" id=\"na\" value=\"");
      out.print(rs1.getString("name"));
      out.write("\" class=\"form-control\" name=\"textname\">\n");
      out.write("                    </div><br>\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                       <label for=\"em\" class=\"form-control\">Email:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>\n");
      out.write("                        <i class=\"input-group-addon\"><span class=\"fa fa-phone fa-phone\"></span></i>\n");
      out.write("                        <input type=\"email\" id=\"em\" value=\"");
      out.print(rs1.getString("email"));
      out.write("\" class=\"form-control\" name=\"textemail\">\n");
      out.write("                    </div><br>\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <label for=\"mo\" class=\"form-control\">Mobile:&nbsp;&nbsp;&nbsp; </label>\n");
      out.write("                        <i class=\"input-group-addon\"><span class=\"fa fa-phone fa-phone\"></span></i>\n");
      out.write("                        <input type=\"tel\" id=\"mo\" value=\"");
      out.print(rs1.getString("mobile"));
      out.write("\" class=\"form-control\" name=\"textmobile\">\n");
      out.write("                    </div><br>\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <label for=\"sms\" class=\"form-control\">Message:</label>\n");
      out.write("                        <i class=\"input-group-addon\"><span class=\"fa fa-info\"></span></i>\n");
      out.write("                        <input id=\"sms\" value=\"");
      out.print(rs1.getString("massage"));
      out.write("\" class=\"form-control\" name=\"textmsg\">      \n");
      out.write("                    </div><br>\n");
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
