<%-- 
    Document   : Dashboard
    Created on : 19 Jun, 2023, 12:40:55 PM
    Author     : harsh
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="myPack.DatabaseManager"%>
<%
if(session.getAttribute("uid")!=null && session.getAttribute("uid")!="")
{
   out.print(session.getAttribute("uid"));
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title> Header</title>
    <style>
        .leest li a{
            color: red;
            font-size: 16px;
        }
    </style>
    <link href="../css/bootstrap.min.css" rel="stylesheet">
    <link href="../css/bootstrap-theme.min.css" rel="stylesheet">
    <link href="../css/font-awesome.min.css" rel="stylesheet">
    <link href="../css/hover.css">
      <script src="../js/jquery-3.3.1.min.js"></script>
    <script  src="../js/bootstrap.min.js"></script>
        <link href="Dashboard.css" rel="stylesheet" type="text/css"/>
     
    </head>
    <body>
        <div class="container-fluid">
        <div class="row" >
            <div class="col-sm-12" style="height:18px; background-color:red; color:black">
            <div class="col-sm-1"></div>
            <div class="col-sm-2">
                <i class="fa fa-facebook"><b>Facebook:</b>Harsh Srivastva</i>
             
            </div>
            <div class="col-sm-3">
                <i class="fa fa-envelope"><b>Email:</b>harshideal2002@gmail.com</i>
            
            </div>
            <div class="col-sm-2">
                <i class="fa fa-instagram"><b>Instagram:</b>@harsh_ideal</i>
            
            </div>
            <div class="col-sm-1"></div>
            <div class="col-sm-3">
                <b>Our Website Work 24*7</b>
            </div>
            </div>
            
        
       
        <div class="col-sm-12">
            
            <div class="col-sm-2" style="box-shadow:5px  red;">
            <img src="../img/Logo.png" style="height:55px" class="img img-responsive">
            </div>
            <div class="col-sm-1"></div>
            <div class="col-sm-9">
                <nav class="navbar navbar-expand-sm " style="float:right">
 
    
      
      
    <ul class="nav navbar-nav nav-ifo leest">
        <li class="active" ><%
                    String id=session.getAttribute("uid")+"";
                    
                    String cmd="select * from tb_registration_cust where mobile='"+id+"'";
                    DatabaseManager db=new DatabaseManager();
                    ResultSet rs=db.DisplayAllRecords(cmd);
                    while(rs.next())
                    {
                        %><a href="myProfile.jsp?up=<%=rs.getString("mobile")%>" style="box-shadow:6px 8px pink;"> <span class="fa fa-home"></span>My Profile</a></li>
                          <%}%>
       <li><a href="Dashboard.jsp" style="box-shadow:6px 8px pink;"><span class="fa fa-inf"></span> Dashboard</a></li>
       <li><a href="Listofdistributer.jsp" style="box-shadow:6px 8px pink;"><span class="fa fa-shopping-cart"></span> Distributer</a></li>
       <li><a href="feedback.jsp" style="box-shadow:6px 8px pink;"><span class="fa fa-phone-square"></span>Feedback</a></li>
       <li><a href="complain.jsp" style="box-shadow:6px 8px pink;"><span class="fa fa-long-arrow-down"></span>Complain</a></li>
      <li><a href="AChangePassword.jsp" style="box-shadow:6px 8px pink;"><span class="fa fa-credit-card"></span>Change password</a></li>
      <li><a href="../index.jsp" style="box-shadow:5px 8px pink;"><span class="fa fa-list"></span> Logout</a></li>
    </ul>
                    </nav>
  </div>
  </div>
            

                </div>
       <div>
           <%@include file="footer.jsp" %>
       </div>
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