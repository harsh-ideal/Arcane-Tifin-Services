package org.apache.jsp.AdminZone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import myPack.DatabaseManager;
import java.util.Date;
import java.text.SimpleDateFormat;

public final class response_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 
    if(request.getParameter("submit")!=null){
        
        String comp=request.getParameter("txtmobile");
        String resp=request.getParameter("txtresponse");
        String type=request.getParameter("txttype");
        SimpleDateFormat sm=new SimpleDateFormat();
        String dt=sm.format(new Date());
        String cmd="insert into tbl_response(response,user_id,type,rdt) values('"+resp+"','"+comp+"','"+type+"','"+dt+"')";
        DatabaseManager db=new DatabaseManager();
        if(db.MyInsertUpdateDelete(cmd))
        {
            out.print("<script>alert('Send Response');window.location='ViewComplain.jsp'</script>");
        }
        else
        {
            out.print("<script>alert('Unable to Send');window.location='ViewComplain.jsp'</script>");
        }
    }

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Change Password</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div >\r\n");
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
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("         ");

                    String id=request.getParameter("up");
                    String cmd2="select * from tb_complain where sn='"+id+"'";
                     DatabaseManager db=new DatabaseManager();
                    ResultSet rs2=db.DisplayAllRecords(cmd2);
                    
      out.write("\r\n");
      out.write("                    <div class=\"container-fluid\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-sm-12\">\r\n");
      out.write("                <div class=\"col-sm-4\"></div>\r\n");
      out.write("                <div class=\"col-sm-4\">\r\n");
      out.write("                    <form action=\"response.jsp\" method=\"post\">\r\n");
      out.write("                         ");
 
                    while(rs2.next())
{
      out.write("  <input type=\"hidden\" name=\"txttype\" value=\"");
      out.print(rs2.getString("type"));
      out.write("\">\r\n");
      out.write("                        S.No.:\r\n");
      out.write("                        <input readonly type=\"text\" value=\"");
      out.print(rs2.getString("Sn"));
      out.write("\" name=\"txtno\" class=\"form-control\">\r\n");
      out.write("                        This is Complain Id\r\n");
      out.write("                        <input  Readonly type=\"text\" value=\"");
      out.print(rs2.getString("mobile"));
      out.write("\" name=\"txtmobile\" class=\"form-control\">\r\n");
      out.write("                        ");
}
      out.write("\r\n");
      out.write("                        Give a response:\r\n");
      out.write("                        <textarea cols=\"24\" rows=\"2\"  name=\"txtresponse\" class=\"form-control\"></textarea>\r\n");
      out.write("                        <br>\r\n");
      out.write("                      \r\n");
      out.write("                        <input type=\"submit\" class=\"form-control btn-info\" name=\"submit\" value=\"Send Response\">\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("                  <div class=\"col-sm-4\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
