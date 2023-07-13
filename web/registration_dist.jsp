<%-- 
    Document   : registration_dil.jsp
    Created on : 14 Jun, 2023, 1:04:59 AM
    Author     : harsh
--%>

<%@page import="myPack.DatabaseManager"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat" %>
<%
    if(request.getParameter("submit1")!=null){
        String dil_name=request.getParameter("texttiffinname");
        String name=request.getParameter("textname");
        String email=request.getParameter("textemail");
        String mobile=request.getParameter("textmobile");
        String pin_code=request.getParameter("textpin");
        String add=request.getParameter("textadd");
        String discription=request.getParameter("textdesc");
        String password=request.getParameter("textpass");
        
        SimpleDateFormat sm=new SimpleDateFormat();
        String dt=sm.format(new Date());
        String cmd1="insert into tb_registration_dil(tiffin_name,name,mobile,email,pin_code,address,description,password,rdt) values('"+dil_name+"','"+name+"','"+mobile+"','"+email+"','"+pin_code+"','"+add+"','"+discription+"','"+password+"','"+dt+"')";
        String cmd2="insert into tbl_login values('"+mobile+"','"+password+"','dealer','"+dt+"')";
        out.print(cmd1);
        DatabaseManager db=new DatabaseManager();
        if(db.MyInsertUpdateDelete(cmd1) && db.MyInsertUpdateDelete(cmd2))
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
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <%@include file="Master_Page/header.jsp" %>
        </div>
        <div class="row">
             <div class="col-sm-12">
            <div class="col-sm-3">
                <h1 class="text-success">Hello! Distributer <span class="fa fa-smile-o"></span></h1>
            <br>
            <h4 class="text-danger">Are you ready for expand your business <span class="fa fa-question fa-spin"></span> </h4>
            <h5 class="text-success">~If Yes, then continue with us.<span class="fa fa-smile-o"></span></h5>
            </div>
            
        
        <div class="col-sm-9">
       
            <div class="row text-center" style="color: red;font-size: 25px;padding: 1%;font-weight: bold;">
                Register Here<i class="fa fa-smile-o fa-spin"></i>
            </div>
        <br><br><br><br><br>
        
            
                <form action="registration_dist.jsp" method="post">
                    <div class="col-sm-6">
                    
                    <div class="input-group">
                        <i class="input-group-addon"><span class="fa fa-user"></span></i>
                        <input type="text" placeholder="Enter name here" required pattern="[A-Za-z]{2,}" class="form-control" name="textname">
                    </div><br>
                    <div class="input-group">
                        <i class="input-group-addon"><span class="fa fa-phone fa-phone"></span></i>
                        <input type="tel" placeholder="Enter mobile numbere here" class="form-control" required pattern="[0-9]{10}" name="textmobile">
                    </div><br>
                    <div class="input-group">
                        <i class="input-group-addon"><span class="fa fa-envelope"></span></i>
                        <input type="email" placeholder="Enter email here" class="form-control" required name="textemail">
                    </div><br>
                    <div class="input-group">
                        <i class="input-group-addon"><span class="fa fa-location-arrow"></span></i>
                        <textarea placeholder="Enter Address here" rows="4" cols="40" class="form-control" name="textadd" required></textarea>
                    </div><br>
                    </div>
                    <div class="col-sm-6">
                    <div class="input-group">
                        <i class="input-group-addon"><span class="fa fa-code"></span></i>
                        <input type="text" placeholder="Enter pin code here" class="form-control" required pattern="[0-9]{6}" name="textpin">
                    </div><br>
                    <div class="input-group">
                        <i class="input-group-addon"><span class="fa fa-building"></span></i>
                        <input type="text" placeholder="Enter your Tifin Service's name here" required pattern="[A-Za-z]{2,}" class="form-control" name="texttiffinname">
                    </div>
                    <br>
                    <div class="input-group">
                        <i class="input-group-addon"><span class="fa fa-key fa-spin"></span></i>
                        <input type="password" placeholder="Enter password here" class="form-control" required pattern="{6,}" name="textpass">
                    </div><br>
                    <div class="input-group">
                        <i class="input-group-addon"><span class="fa fa-info"></span></i>
                        <textarea  placeholder="Write Description of your service" rows="4" cols="40" class="form-control" name="textdesc"></textarea>
                    </div><br>
                    </div>
                    <input type="submit" class="btn form-control btn-danger " value="Register" name="submit1">
                    <p>Are you already registered? Then Click on <a href="login.jsp">Login</a>
                        
                </form>
                
            </div>
        </div>
        </div>
               <div style="height: 250px;"></div>
        
        <div>
      <%@include file="Master_Page/footer.jsp" %>
      </div>

    </body>
</html>
