package org.apache.jsp.AdminZone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                <div class=\"col-sm-5\"><br><br><br><img class=\"img img-circle img-thumbnail\" style=\"border:1px solid red;\" src=\"../img/tifin1.jpeg\"></div>\n");
      out.write("                <div class=\"col-sm-1\"></div>\n");
      out.write("                \n");
      out.write("                <div class=\"col-sm-4\">\n");
      out.write("                    <br><br><br><br><br><p style=\"font-family:New Time roman; font-size: 16px; text-align: justify\">\n");
      out.write("                         ATS help you to find a good and healthy food at your doorstep.If you are Distributor then we help you to expand your business.This is a platform where distributor and customer are connected.\n");
      out.write("                         <br>We must notice the service of all Distributer and We also Noticed the feedback of customer.\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("                    <div class=\"col-sm-1\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-12\">\n");
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
      out.write("            \n");
      out.write("    </div>\n");
      out.write("        <div style=\"height: 250px;\"></div>\n");
      out.write("        \n");
      out.write("         <div>\n");
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
