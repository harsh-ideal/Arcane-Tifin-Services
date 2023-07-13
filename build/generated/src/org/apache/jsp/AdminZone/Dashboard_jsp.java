package org.apache.jsp.AdminZone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Dashboard</title>\n");
      out.write("        <link href=\"Dashboard.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"../css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"../js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("<section>\n");
      out.write("    <div class=\"row\">\n");
      out.write("\t\t<div class=\"col-md-12\">\n");
      out.write("\t\t\t<p>Admin needed a dashboard buttons for a project without having to make lots of different images to use as buttons, as the new CMS was going to be bootstrap based i decided to make them with glyphicons in custom sized buttons.</p>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\t<div class=\"row\">\n");
      out.write("\t\t<div class=\"col-md-12\">\n");
      out.write("            <div class=\"panel panel-primary\">\n");
      out.write("                <div class=\"panel-heading\">\n");
      out.write("                    <h3 class=\"panel-title\"><span class=\"glyphicon glyphicon-thumbs-up\"></span> Admin Dashboard</h3>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-12\">\n");
      out.write("                          <!-- grey -->\n");
      out.write("                          <a href=\"#\" class=\"btn btn-grey btn-lg\" role=\"button\"><span class=\"glyphicon glyphicon-cog glyphsize red\"></span> <br />Example<br />Button <span class=\"glyphicon glyphicon-cog black\"></span></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                          <!-- dblue -->\n");
      out.write("                          <a href=\"ViewRegistration.jsp\" class=\"btn btn-dblue btn-lg\" role=\"button\"><span class=\"glyphicon glyphicon-user glyphsize\"></span> <br />Contact <span class=\"glyphicon glyphicon-list green\"></span><br />List</a>\n");
      out.write("                          <a href=\"CustomerList.jsp\" class=\"btn btn-dblue btn-lg\" role=\"button\"><span class=\"glyphicon glyphicon-user glyphsize\"></span> <br />Customer <span class=\"glyphicon glyphicon-list yellow\"></span><br />List</a>\n");
      out.write("                          <a href=\"Dillerlist.jsp\" class=\"btn btn-dblue btn-lg\" role=\"button\"><span class=\"glyphicon glyphicon-user glyphsize\"></span> <br />Dealer &nbsp;<span class=\"glyphicon glyphicon-list red\"></span><br />List</a>\n");
      out.write("                          <a href=\"ViewComplain.jsp\" class=\"btn btn-dblue btn-lg\" role=\"button\"><span class=\"glyphicon glyphicon-user glyphsize\"></span> <br />Complain&nbsp;<span class=\"glyphicon glyphicon-warning-sign\"></span><br>List</a>\n");
      out.write("                          <a href=\"AChangePassword.jsp\" class=\"btn btn-dblue btn-lg\" role=\"button\"><span class=\"glyphicon glyphicon-user glyphsize\"></span> <br />Change&nbsp;<span class=\"glyphicon glyphicon-edit\"></span><br>Password</a>\n");
      out.write("                          \n");
      out.write("                          <a href=\"ViewFeedback.jsp\" class=\"btn btn-dblue btn-lg\" role=\"button\"><span class=\"glyphicon glyphicon-user glyphsize\"></span> <br />View&nbsp;<span class=\"glyphicon glyphicon-log-out\"></span>Feedback</a>\n");
      out.write("                          <a href=\"#\" class=\"btn btn-dblue btn-lg\" role=\"button\"><span class=\"glyphicon glyphicon-user glyphsize\"></span> <br />Add  &nbsp;<span class=\"glyphicon glyphicon-bell\"></span><br/>Notification</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                          <!-- dred -->\n");
      out.write("                          <a href=\"#\" class=\"btn btn-dred btn-lg\" role=\"button\"><span class=\"glyphicon glyphicon-calendar glyphsize\"></span> <br/>Add <span class=\"glyphicon glyphicon-plus green\"></span><br /> Appointment</a>\n");
      out.write("                          <a href=\"#\" class=\"btn btn-dred btn-lg\" role=\"button\"><span class=\"glyphicon glyphicon-calendar glyphsize\"></span> <br />Edit <span class=\"glyphicon glyphicon-edit yellow\"></span><br />Appointment</a>\n");
      out.write("                          <a href=\"#\" class=\"btn btn-dred btn-lg\" role=\"button\"><span class=\"glyphicon glyphicon-calendar glyphsize\"></span> <br/>Delete <span class=\"glyphicon glyphicon-minus red\"></span><br /> Appointment</a>\n");
      out.write("                          <a href=\"#\" class=\"btn btn-dred btn-lg\" role=\"button\"><span class=\"glyphicon glyphicon-calendar glyphsize\"></span> <br/>View <span class=\"glyphicon glyphicon-eye-open\"></span><br />Diary</a>\n");
      out.write("                          <a href=\"#\" class=\"btn btn-dred btn-lg\" role=\"button\"><span class=\"glyphicon glyphicon-calendar glyphsize\"></span> <br/>Manage <br /> Diary</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                          <!-- dgreen -->\n");
      out.write("                          <a href=\"#\" class=\"btn btn-dgreen btn-lg\" role=\"button\"><span class=\"glyphicon glyphicon-signal glyphsize green\"></span> <br/>Business<br />Reports </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                          <!-- mred -->\n");
      out.write("                          <a href=\"#\" class=\"btn btn-mred btn-lg\" role=\"button\"><span class=\"glyphicon glyphicon-envelope glyphsize\"></span> <br/>Postage<br />Manager</a>\n");
      out.write("                          <a href=\"#\" class=\"btn btn-mred btn-lg\" role=\"button\"><span class=\"glyphicon glyphicon-home glyphsize\"></span> <br/>Postcode<br />Setup</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                          <!-- orange -->\n");
      out.write("                          <a href=\"#\" class=\"btn btn-orange btn-lg\" role=\"button\"><span class=\"glyphicon glyphicon-bullhorn glyphsize\"></span> <br/>Announcement<br />Manager</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                          <!-- lblue -->\n");
      out.write("                          <a href=\"#\" class=\"btn btn-lblue btn-lg\" role=\"button\"><span class=\"glyphicon glyphicon-list glyphsize blue\"></span> <br /><span class=\"blue\">Category<br />Manager</span></a>\n");
      out.write("                          <a href=\"#\" class=\"btn btn-lblue btn-lg\" role=\"button\"><span class=\"glyphicon glyphicon-list-alt glyphsize blue\"></span> <br/><span class=\"blue\">SubCategory<br />Manager</span></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                          <!-- burnt -->\n");
      out.write("                          <a href=\"#\" class=\"btn btn-burnt btn-lg\" role=\"button\"><span class=\"glyphicon glyphicon-tint glyphsize yellow\"></span> <br/>Colour<br />Manager</a>\n");
      out.write("                          <a href=\"#\" class=\"btn btn-burnt btn-lg\" role=\"button\"><span class=\"glyphicon glyphicon-cog glyphsize yellow\"></span> <br/>Swatch<br />Setup</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                          <!-- green -->\n");
      out.write("                          <a href=\"#\" class=\"btn btn-green btn-lg\" role=\"button\"><span class=\"glyphicon glyphicon-dashboard glyphsize dgreen\"></span> <br /><br />Dashboard</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                          <!-- lime -->\n");
      out.write("                          <a href=\"#\" class=\"btn btn-lime btn-lg\" role=\"button\"><span class=\"glyphicon glyphicon-globe glyphsize dgreen\"></span> <span class=\"dgreen\"><br />Website<br />Manager</span></a>\n");
      out.write("                          <a href=\"#\" class=\"btn btn-lime btn-lg\" role=\"button\"><span class=\"glyphicon glyphicon-cog glyphsize dgreen\"></span> <span class=\"dgreen\"><br />SEO<br />Setup</span></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                          <!-- mokka -->\n");
      out.write("                          <a href=\"#\" class=\"btn btn-mokka btn-lg\" role=\"button\"><span class=\"glyphicon glyphicon-triangle-right glyphsize green\"></span><span class=\"glyphicon glyphicon-home glyphsize choc\"></span> <br />Delivery<br />Setup</a>\n");
      out.write("                          <a href=\"#\" class=\"btn btn-mokka btn-lg\" role=\"button\"><span class=\"glyphicon glyphicon-tasks glyphsize choc\"></span> <br />Departments<br />Setup</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                          <!-- dpurple -->\n");
      out.write("                          <a href=\"#\" class=\"btn btn-dpurple btn-lg\" role=\"button\"><span class=\"glyphicon glyphicon-gbp glyphsize lilac\"></span> <br/>Payments<br />Manager</a>\n");
      out.write("                          <a href=\"#\" class=\"btn btn-dpurple btn-lg\" role=\"button\"><span class=\"glyphicon glyphicon-piggy-bank glyphsize mblue\"></span> <br/>Paypal<br />System</a>\n");
      out.write("                          <a href=\"#\" class=\"btn btn-dpurple btn-lg\" role=\"button\"><span class=\"glyphicon glyphicon-user glyphsize\"></span> <br/>Insurance<br />Claims</a>\n");
      out.write("                          <a href=\"#\" class=\"btn btn-dpurple btn-lg\" role=\"button\"><span class=\"glyphicon glyphicon-check glyphsize green\"></span> <br/>Invoices<br />Paid</a>\n");
      out.write("                          <a href=\"#\" class=\"btn btn-dpurple btn-lg\" role=\"button\"><span class=\"glyphicon glyphicon-remove glyphsize red\"></span> <br/>Invoices<br />Canceled</a>\n");
      out.write("                          <a href=\"#\" class=\"btn btn-dpurple btn-lg\" role=\"button\"><span class=\"glyphicon glyphicon-saved glyphsize lilac\"></span> <br/>Invoices<br />Archived</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                          <!-- purple -->\n");
      out.write("                          <a href=\"#\" class=\"btn btn-purple btn-lg\" role=\"button\"><span class=\"glyphicon glyphicon-shopping-cart glyphsize black\"></span> <br/>Shopping<br />Cart</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                          <!-- lilac -->\n");
      out.write("                          <a href=\"#\" class=\"btn btn-lilac btn-lg\" role=\"button\"><span class=\"glyphicon glyphicon-file glyphsize purple\"></span> <br/>Product<br />Manager</a>\n");
      out.write("                          <a href=\"#\" class=\"btn btn-lilac btn-lg\" role=\"button\"><span class=\"glyphicon glyphicon-text-width glyphsize\"></span> <br/>Product<br />Sizes</a>\n");
      out.write("                          <a href=\"#\" class=\"btn btn-lilac btn-lg\" role=\"button\"><span class=\"glyphicon glyphicon-text-width glyphsize purple\"></span> <br/>Sizes<br />Manager</a>\n");
      out.write("                          <a href=\"#\" class=\"btn btn-lilac btn-lg\" role=\"button\"><span class=\"glyphicon glyphicon-th-large glyphsize\"></span> <br/>Stock<br />Manager</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                          <!-- yellow -->\n");
      out.write("                          <a href=\"#\" class=\"btn btn-yellow btn-lg\" role=\"button\"><span class=\"glyphicon glyphicon-user glyphsize orange\"></span> <br/><span class=\"orange\">User<br />Setup</span></a>\n");
      out.write("                          <a href=\"#\" class=\"btn btn-yellow btn-lg\" role=\"button\"><span class=\"glyphicon glyphicon-question-sign glyphsize orange\"></span> <br/><span class=\"orange\">Vaccination<br />Manager</span></a>\n");
      out.write("                \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"panel-footer\">\n");
      out.write("                \t<div class=\"pull-left\">Author: Dennis Pattison</div>\n");
      out.write("\t\t\t\t\t<div class=\"pull-right\"><a href=\"http://www.dinara.co.uk\" target=\"_blank\">Dinara Design</a></div>\n");
      out.write("                    <div class=\"clearfix\"></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
