
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
if(session.getAttribute("did")!=null && session.getAttribute("did")!="")
{
    //out.print(session.getAttribute("did"));
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        <div>
            <%@ include file="header.jsp" %>
        </div>
        <br>
        <div class="container-fluid">
        <div class="row">
            <div id="myCarousel" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
    <li data-target="#myCarousel" data-slide-to="1"></li>
    <li data-target="#myCarousel" data-slide-to="2"></li>
  </ol>

  <!-- Wrapper for slides -->
  <div class="carousel-inner">
    <div class="item active">
        <img src="../img/pic0.jpg"  class="center-block img img-responsive" style="height: 450px;width:70%">
    </div>

    <div class="item">
        <img src="../img/pic3.jpg" alt="Chicago" class="center-block img img-responsive" style="height: 450px;width:70%">
    </div>

    <div class="item">
        <img src="../img/pic4.jpg" class="center-block img img-responsive" style="height: 450px;width:70%">
    </div>
  </div>

  <!-- Left and right controls -->
  <a class="left carousel-control" href="#myCarousel" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#myCarousel" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
            <br>
            <div class="col-sm-12">
            <div class="row text-center" style="color: red;font-size: 18px;padding: 2%;font-weight: bold;">
                <br><br><b><u><i style="font-size:35px">A</i>rcane <i style="font-size:35px">T</i>iffin <i style="font-size:35px">S</i>ervices<i class="fa fa-smile-o fa-spin"></i></u></b>
            </div>
            </div>
            <div class="col-sm-12">
                <div class="col-sm-1"></div>
                <div class="col-sm-4">
                    <br><br><br><br><br><p style="font-family: inherit; letter-spacing: 1px;line-height: 25px; font-size: 16px; text-align: justify"><u>
                         ATS help you to find a good and healthy food at your doorstep.If you are Distributor then we help you to expand your business.This is a platform where distributor and customer are connected.
                         <br>We must notice the service of all Distributer and We also Noticed the feedback of customer.</u>
                    </p>
                </div>
                <div class="col-sm-1"></div>
                <div class="col-sm-5"><br><br><br><img class="img img-thumbnail img-rounded" style=" height:360px; weidth:350px; border:1px solid red;" src="../img/tifin1.jpeg"></div>
                
                <div class="col-sm-1"></div>
            </div>
            
             <div class="col-sm-12">
                <div class="col-sm-1"></div>
                <div class="col-sm-5"><br><br><br><img class="img img-rounded img-thumbnail" style=" height:350px; weidth:350px; border:1px solid red;" src="../img/tifin3.jpeg"></div>
                
                <div class="col-sm-5">
                    <br><br><br><br><br><br><p style="font-family: inherit; letter-spacing: 1px;line-height: 25px; font-size: 16px; text-align: justify">
                        <u>Value for money wholesome meals start at Rs.70 with choices available for both vegetarians and non-vegetarians. Each meal consists of a protein which is either paneer or chicken depending on your preference. The tiffin meal consists of a dal, dry subzi, curried main course, raita, roti and rice.<br>
                         The mouth-watering menu ranges from paneer lababdar to palak paneer, kadhai chicken to chicken tikka masala, dal makhani to chole rasile, kukure aloo to mutter mushroom, you eat something new and hearty every day. The food is tasty and makes one feel full and happy.
                        </u></p>
                </div>
                    <div class="col-sm-1"></div>
            </div><br /><br />
            <div class="col-sm-12"><div class="col-sm-1"></div><div class="col-sm-10">
                <br><p style="font-family: inherit; letter-spacing: 1px;line-height: 25px; font-size: 16px; text-align: justify"><u>There are many tiffin service operators in the city, however hygiene & safety levels remain a challenge.
                    The sensitivities towards hygiene, safety & delivery has become crucial post-pandemic. Meals by 24Seven ticks on all these parameters.</u>
                
</p></div>
            </div>
        </div>
    </div>
        <div style="height: 250px;"></div>
        <div>
      <%@include file="footer.jsp" %>
      </div>
    </body>
</html>
<%
}
else
{
response.sendRedirect("../login.jsp");
}
%>
