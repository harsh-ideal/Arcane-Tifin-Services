<%-- 
    Document   : registration_cust.jsp
    Created on : 14 Jun, 2023, 1:06:05 AM
    Author     : harsh
--%>

<%@page import="myPack.DatabaseManager"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat" %>
<%
    if(request.getParameter("submit")!=null){
        String name=request.getParameter("textname");
        String email=request.getParameter("textemail");
        String mobile=request.getParameter("textmobile");
        String pin_code=request.getParameter("textpin");
        String add=request.getParameter("textadd");
        String password=request.getParameter("textpass");
        
        SimpleDateFormat sm=new SimpleDateFormat();
        String dt=sm.format(new Date());
        String cmd1="insert into tb_registration_cust(name,mobile,email,pin,addr,pass,dt) values('"+name+"','"+mobile+"','"+email+"','"+pin_code+"','"+add+"','"+password+"','"+dt+"')";
        String cmd2="insert into tbl_login values('"+mobile+"','"+password+"','user','"+dt+"')";
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
        <br><div class="container-fluid">
            <div class="row">
                <div class="col-sm-12">
           
        </div>
                <div class="col-sm-12">
           
            <div class="col-sm-3">
                <h1 class="text-success">Hello! <span class="fa fa-smile-o"></span></h1>
            <br>
            <h4 class="text-danger">Are you searching<span class="fa fa-search"></span> for Lunch/Dinner? <span class="fa fa-question fa-spin"></span> </h4>
            <h5 class="text-success">~Don't worry, We will provide you list of best tiffin distributer near you .<br> And they serve you a best meal<span class="fa fa-smile-o"></span></h5>
            </div>
                    <div class="col-sm-9">
                         <div class="row text-center" style="color: red;font-size: 30px;padding: 2%;font-weight: bold;">
                Register Here<i class="fa fa-smile-o fa-spin"></i>
                         </div><br><br><br>
               <form action="registration_cust.jsp" method="post">     
                   
            <div class="col-sm-6">
                
                    <div class="input-group">
                        <i class="input-group-addon"><span class="fa fa-user"></span></i>
                        <input type="text" placeholder="Enter name here" required class="form-control" name="textname">
                    </div><br>
                    <div class="input-group">
                        <i class="input-group-addon"><span class="fa fa-phone fa-phone"></span></i>
                        <input type="tel" placeholder="Enter mobile numbere here" pattern="[0-9]{10}" title="Fill correct Number" required class="form-control" name="textmobile">
                    </div><br>
                    <div class="input-group">
                        <i class="input-group-addon"><span class="fa fa-envelope"></span></i>
                        <input type="email" placeholder="Enter email here(optional)" title="Fill correct email" class="form-control" name="textemail">
                    </div>
            </div>
                    <div class="col-sm-6">
                    <div class="input-group">
                        <i class="input-group-addon"><span class="fa fa-code"></span></i>
                        <input type="text" placeholder="Enter pin code here" required class="form-control" pattern="[0-9]{6}" title="Fill correct pin" name="textpin">
                    </div><br>
                    
                    <div class="input-group">
                        <i class="input-group-addon"><span class="fa fa-location-arrow"></span></i>
                        <textarea   placeholder="Enter Address here" required rows="1" cols="40" class="form-control" name="textadd"></textarea>
                    </div><br>
                    <div class="input-group">
                        <i class="input-group-addon"><span class="fa fa-key fa-spin"></span></i>
                        <input type="password" placeholder="Enter password here" required class="form-control" name="textpass" title="Set password more than 5 charecter" pattern=".{6,}">
                    </div><br>
                    </div>
                    <input type="submit" class="btn form-control btn-danger " value="Register" name="submit">
                    <p>Are you already registered? Then Click on <a href="login.jsp">Login</a>
                   
            
                   </form>
                        </div>
            
        </div>
            </div> 
            
     
        
        <div class="col-sm-12">
           
            </div>
        </div>
        <div style="height: 250px;"></div>
        <div>
      <%@include file="Master_Page/footer.jsp" %>
      </div>
    </body>
</html>
