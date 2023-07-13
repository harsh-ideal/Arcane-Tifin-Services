<%-- 
    Document   : header.jsp
    Created on : 12 Jun, 2023, 8:17:01 PM
    Author     : harsh
--%>

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
        body{
            font-family: 'Titillium Web', sans-serif;
        }
    </style>
    <link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Titillium+Web:wght@200&display=swap" rel="stylesheet">
    <link href="../css/bootstrap.min.css" rel="stylesheet">
    <link href="../css/bootstrap-theme.min.css" rel="stylesheet">
    <link href="../css/font-awesome.min.css" rel="stylesheet">
    <link href="../css/hover.css">
    <script src="../js/jquery-3.3.1.min.js"></script>
    <script  src="../js/bootstrap.min.js"></script>
    <link href="../js/akash.css" rel="stylesheet" type="text/css"/>
    <script src="../js/akash.js" type="text/javascript"></script>
    </head>
    <body>
        <div class="container-fluid">
            <div class="col-sm-12">
                <div class="col-sm-9"></div>
                <div class="col-sm-3">
                     <a href="Dashboard.jsp" class="btn btn-dblue btn-lg" role="button"><span class="glyphicon glyphicon-user glyphsize"></span> <br /><span class="glyphicon glyphicon-list green"></span>Dashboard</a>
                </div>
            </div>
        </div>   
    </body>
</html>
