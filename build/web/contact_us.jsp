
<%@page import="myPack.DatabaseManager"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat" %>
<%
    if(request.getParameter("submit")!=null){
        String name=request.getParameter("textname");
        String email=request.getParameter("textemail");
        String mobile=request.getParameter("textmobile");
        String msg=request.getParameter("textmsg");
        
        SimpleDateFormat sm=new SimpleDateFormat();
        String dt=sm.format(new Date());
        String cmd="insert into tb_contact(name,email,mobile,massage,cdt)values('"+name+"','"+email+"','"+mobile+"','"+msg+"','"+dt+"')";
        //out.print(cmd);
        DatabaseManager db=new DatabaseManager();
        if(db.MyInsertUpdateDelete(cmd))
        {
            out.print("<script>alert('Enquiry save succesfuly')</script>");
        }
        else
        {
            out.print("<script>alert('Unable to save')</script>");
        }
    }
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact Us</title>
       <!-- <script>
            var stopauto;
            $(document).ready(fuction(){
                fuction showWindow(){
                    $('#main').show();
                    $('html body').css("overflow",hidden);
                    stopauto=setTimeout(hideWindow,5000);
                }
             $(document).hideWindow(){
                 $('main').show();
                 $('html body').css('overflow','hidden');
           
             setTimeout(showWindow,10000);
             
             $("#close-btn").click(function(){
                 hideWindow();
                 cleartimeout(stopauto);
             })
               }
            })
        </script>-->
        <style>
            #pop-up{
                width:300px; height: 300px; background: red; box-sizing: border-box; padding:20px;
                position: absolute; top:50%; left:50%; transform:translate(-50%,-50%);
            }
        </style>
    </head>
    <body>
        <div id="main">
        <div id="pop-up" style="display:none">
            <button id="close-btn">X</button>
            <h1>Advice</h1>
            <h3>I advice you to first register your self then fill the form of contact us.Thanks You</h3>
        </div>
        <div class="container-fluid">
         <div class="row">
            <%@include file="Master_Page/header.jsp" %>
        </div>
         <div class="col-sm-12" style="padding:4%;">
            <div class="row text-center" style="color: red;font-size: 25px;padding: 1%;font-weight: bold;">
                Contact Us<i class="fa fa-smile-o fa-spin"></i>
            </div>
        </div><br><br><br><br><br>
        <div class="row" style="padding:1%;">
            <div class="col-sm-3"></div>
            <div class="col-sm-6">
                <form action="contact_us.jsp" method="post">
                    <div class="input-group">
                        <i class="input-group-addon"><span class="fa fa-user"></span></i>
                        <input type="text" placeholder="Enter name here" class="form-control" name="textname">
                    </div><br>
                    <div class="input-group">
                        <i class="input-group-addon"><span class="fa fa-phone fa-phone"></span></i>
                        <input type="email" placeholder="Enter email here" class="form-control" name="textemail">
                    </div><br>
                    <div class="input-group">
                        <i class="input-group-addon"><span class="fa fa-phone fa-phone"></span></i>
                        <input type="tel" placeholder="Enter mobile numbere here" class="form-control" name="textmobile">
                    </div><br>
                    <div class="input-group">
                        <i class="input-group-addon"><span class="fa fa-info"></span></i>
                        <textarea placeholder="Massage" rows="3" cols="24" class="form-control" name="textmsg"></textarea>      
                    </div><br>
                    <input type="submit" class="btn form-control btn-danger " value="Submit" name="submit">
                </form>
            </div>
        </div>
        </div>
         <div style="height: 250px;"></div>
        <div>
      <%@include file="Master_Page/footer.jsp" %>
      </div>
      </div>
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    </body>
</html>
