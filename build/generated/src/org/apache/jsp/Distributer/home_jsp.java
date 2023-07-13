package org.apache.jsp.Distributer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import myPack.DatabaseManager;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Distributer/header.jsp");
    _jspx_dependants.add("/Distributer/footer.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("            ");
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
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("  <!-- Indicators -->\n");
      out.write("  <ol class=\"carousel-indicators\">\n");
      out.write("    <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("    <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("    <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("  </ol>\n");
      out.write("\n");
      out.write("  <!-- Wrapper for slides -->\n");
      out.write("  <div class=\"carousel-inner\">\n");
      out.write("    <div class=\"item active\">\n");
      out.write("        <img src=\"../img/pic0.jpg\"  class=\"center-block img img-responsive\" style=\"height: 450px;width:70%\">\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"item\">\n");
      out.write("        <img src=\"../img/pic3.jpg\" alt=\"Chicago\" class=\"center-block img img-responsive\" style=\"height: 450px;width:70%\">\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"item\">\n");
      out.write("        <img src=\"../img/pic4.jpg\" class=\"center-block img img-responsive\" style=\"height: 450px;width:70%\">\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <!-- Left and right controls -->\n");
      out.write("  <a class=\"left carousel-control\" href=\"#myCarousel\" data-slide=\"prev\">\n");
      out.write("    <span class=\"glyphicon glyphicon-chevron-left\"></span>\n");
      out.write("    <span class=\"sr-only\">Previous</span>\n");
      out.write("  </a>\n");
      out.write("  <a class=\"right carousel-control\" href=\"#myCarousel\" data-slide=\"next\">\n");
      out.write("    <span class=\"glyphicon glyphicon-chevron-right\"></span>\n");
      out.write("    <span class=\"sr-only\">Next</span>\n");
      out.write("  </a>\n");
      out.write("</div>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"col-sm-12\">\n");
      out.write("            <div class=\"row text-center\" style=\"color: red;font-size: 18px;padding: 2%;font-weight: bold;\">\n");
      out.write("                <br><br><b><u><i style=\"font-size:35px\">A</i>rcane <i style=\"font-size:35px\">T</i>iffin <i style=\"font-size:35px\">S</i>ervices<i class=\"fa fa-smile-o fa-spin\"></i></u></b>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-12\">\n");
      out.write("                <div class=\"col-sm-1\"></div>\n");
      out.write("                <div class=\"col-sm-4\">\n");
      out.write("                    <br><br><br><br><br><p style=\"font-family: inherit; letter-spacing: 1px;line-height: 25px; font-size: 16px; text-align: justify\"><u>\n");
      out.write("                         ATS help you to find a good and healthy food at your doorstep.If you are Distributor then we help you to expand your business.This is a platform where distributor and customer are connected.\n");
      out.write("                         <br>We must notice the service of all Distributer and We also Noticed the feedback of customer.</u>\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-1\"></div>\n");
      out.write("                <div class=\"col-sm-5\"><br><br><br><img class=\"img img-thumbnail img-rounded\" style=\" height:360px; weidth:350px; border:1px solid red;\" src=\"img/tifin1.jpeg\"></div>\n");
      out.write("                \n");
      out.write("                <div class=\"col-sm-1\"></div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("             <div class=\"col-sm-12\">\n");
      out.write("                <div class=\"col-sm-1\"></div>\n");
      out.write("                <div class=\"col-sm-5\"><br><br><br><img class=\"img img-rounded img-thumbnail\" style=\" height:350px; weidth:350px; border:1px solid red;\" src=\"img/tifin3.jpeg\"></div>\n");
      out.write("                \n");
      out.write("                <div class=\"col-sm-5\">\n");
      out.write("                    <br><br><br><br><br><br><p style=\"font-family: inherit; letter-spacing: 1px;line-height: 25px; font-size: 16px; text-align: justify\">\n");
      out.write("                        <u>Value for money wholesome meals start at Rs.70 with choices available for both vegetarians and non-vegetarians. Each meal consists of a protein which is either paneer or chicken depending on your preference. The tiffin meal consists of a dal, dry subzi, curried main course, raita, roti and rice.<br>\n");
      out.write("                         The mouth-watering menu ranges from paneer lababdar to palak paneer, kadhai chicken to chicken tikka masala, dal makhani to chole rasile, kukure aloo to mutter mushroom, you eat something new and hearty every day. The food is tasty and makes one feel full and happy.\n");
      out.write("                        </u></p>\n");
      out.write("                </div>\n");
      out.write("                    <div class=\"col-sm-1\"></div>\n");
      out.write("            </div><br /><br />\n");
      out.write("            <div class=\"col-sm-12\"><div class=\"col-sm-1\"></div><div class=\"col-sm-10\">\n");
      out.write("                <br><p style=\"font-family: inherit; letter-spacing: 1px;line-height: 25px; font-size: 16px; text-align: justify\"><u>There are many tiffin service operators in the city, however hygiene & safety levels remain a challenge.\n");
      out.write("                    The sensitivities towards hygiene, safety & delivery has become crucial post-pandemic. Meals by 24Seven ticks on all these parameters.</u>\n");
      out.write("                \n");
      out.write("</p></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("        <div style=\"height: 250px;\"></div>\n");
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
