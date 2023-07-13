<%-- 
    Document   : header.jsp
    Created on : 12 Jun, 2023, 8:17:01 PM
    Author     : harsh
--%>
<%@page import="java.sql.ResultSet"%>
<%@page import="myPack.DatabaseManager"%>
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
   
 
    </head>
    <body>
        <div class="container-fluid">
        <div class="row" style="height:18px; background-color:red; color:white">
            <div class="col-sm-12">
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
            <div class="col-sm-1" style=" height:55px"></div>
            <div class="col-sm-2"style="box-shadow:5px  red;">
            <img src="../img/Logo.png" style="height:55px" class="img img-responsive">
            </div>
            <div class="col-sm-1"></div>
            <div class="col-sm-8">
                <nav class="navbar navbar-expand-sm " style="float:right">
 
    
      
      
    <ul class="nav navbar-nav nav-ifo leest">
        <li class="active" ><a href="myProfile.jsp" style="box-shadow:6px 8px pink;"><span class="fa fa-home"></span>My Profile</a></li>
       <li><a href="Dashboard.jsp" style="box-shadow:6px 8px pink;"><span class="fa fa-inf"></span> Dashboard</a></li>
       <li><a href="viewfeedback" style="box-shadow:6px 8px pink;"><span class="fa fa-phone-square"></span>View Feedback</a></li>
       <li><a href="complain.jsp" style="box-shadow:6px 8px pink;"><span class="fa fa-long-arrow-down"></span>Complain</a></li>
      <li><a href="AchangePassword.jsp" style="box-shadow:6px 8px pink;"><span class="fa fa-credit-card"></span>Change password</a></li>
      <li><a href="../index.jsp" style="box-shadow:5px 8px pink;"><span class="fa fa-list"></span> Logout</a></li>
    </ul>
                    </nav>
  </div>
  </div>
            

                </div>
            </div>
   
        
    </body>
</html>
