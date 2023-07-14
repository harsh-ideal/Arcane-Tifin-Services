<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%
if(session.getAttribute("uid")!=null && session.getAttribute("uid")!="")
{
   // out.print(session.getAttribute("uid"));
%>
<%
if(request.getParameter("submit")!=null){
    DatabaseManager db1=new DatabaseManager();
    String id=session.getAttribute("uid")+"";
    String rate=request.getParameter("txtrate");
    String feod=request.getParameter("txtreview");
    SimpleDateFormat sm=new SimpleDateFormat();
        String dt=sm.format(new Date());
        String cmd="insert into tb_feed(id,rate,feed,rdt) values('"+id+"','"+rate+"','"+feod+"','"+dt+"')";
       // out.print(cmd);
        
         if(db1.MyInsertUpdateDelete(cmd))
        {
            out.print("<script>alert('Feedback succesfuly')</script>");
        }
        else
        {
            out.print("<script>alert('Unable')</script>");
        }
}
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="../js/jquery-2.1.0.min.js" type="text/javascript"></script>
        <script>
            $(document).ready(function(){
                var total="";
              $(".fa-star").css({"color":"red","fontSize":"50px","cursor":"pointer"}) 
              $("#sp1,#sp2,#sp3,#sp4,#sp5").hide();
              $("#s1").click(function(){
                 total=$("#sp1").text();
                 $("#s1").css("color","teal")
                 $("#s2,#s3,#s4,#s5").css("color","red")
                 $("input[name='txtrate']").val(total);
              })
              $("#s2").click(function(){
                 total=$("#sp2").text();
                 $("#s1,#s2").css("color","teal")
                 $("#s3,#s4,#s5").css("color","red")
                  $("input[name='txtrate']").val(total);
              })
              $("#s3").click(function(){
                 total=$("#sp3").text();
                 $("#s1,#s2,#s3").css("color","teal")
                 $("#s4,#s5").css("color","red")
                  $("input[name='txtrate']").val(total);
              })
              $("#s4").click(function(){
                 total=$("#sp4").text();
                 $("#s1,#s2,#s3,#s4").css("color","teal")
                 $("#s5").css("color","red")
                  $("input[name='txtrate']").val(total);
              })
              $("#s5").click(function(){
                 total=$("#sp5").text();
                 $("#s1,#s2,#s3,#s4,#s5").css("color","teal")
                  $("input[name='txtrate']").val(total);
              })
            })
        </script>
    </head>
    <body>
      
            <%@include  file="header.jsp" %>
            <div class="col-sm-12">
                <div class="col-sm-4"></div>
                <div class="col-sm-4 panel panel-body">
                    Rating Now
                    <br>
                      <span class="fa fa-star" id="s1"></span>
                      <span class="fa fa-star" id="s2"></span>
                      <span class="fa fa-star" id="s3"></span>
                      <span class="fa fa-star" id="s4"></span>
                      <span class="fa fa-star" id="s5"></span>
                            
                      <span class="fa fa-star" id="sp1">1</span>
                      <span class="fa fa-star" id="sp2">2</span>
                      <span class="fa fa-star" id="sp3">3</span>
                      <span class="fa fa-star" id="sp4">4</span>
                      <span class="fa fa-star" id="sp5">5</span>
                      <br>
                      <form action="feedback.jsp" method="post">
                      <input type="hidden" name="txtrate">
                      Write Your Review
                      <textarea class="form-control" placeholder="Review Here" rows="3" cols="24"  name="txtreview"></textarea>
                      <br>
                      <input type="submit" value="Review Now" class="btn-info form-control" name="submit">
                      </form>
                </div>
                  <div class="col-sm-4"></div>
            </div>
     
        
         <div class="col-sm-12"><%@include file="footer.jsp" %></div>
    </body>
</html>
<%
}
else
{
response.sendRedirect("../login.jsp");
}
%>
