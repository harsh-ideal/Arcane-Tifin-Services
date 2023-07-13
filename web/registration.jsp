<%-- 
    Document   : registration
    Created on : 13 Jun, 2023, 10:05:39 PM
    Author     : harsh
--%>

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
        <br><br><br>
        <div class="container-fluid">
        <div class="row">
            <div class="col-sm-12">
            <div class="col-sm-1"></div>
            <div class="col-sm-5" style="border-right:3px dashed black; height: 250px">
                <div class="text-center">
                    If You are Distributer,then register here<br> &nbsp;
                    
                    <form action="registration_dist.jsp"><input type="submit"  value="Registration" class="btn btn-success btn-lg"></form>
                </div>
            </div>
            <div class="col-sm-1"></div>
            <div class="col-sm-5">
                <div class="text-center">
                    If You are Costumer ,then register here<br>&nbsp; 
                    <form action="registration_cust.jsp" ><input type="submit" value="Registration" class="btn btn-success btn-lg"></form>
                </div>
            </div>
        </div>
        </div>
        </div>
        <div style="height: 200px;"></div>
        <div>
      <%@include file="Master_Page/footer.jsp" %>
      </div>
    </body>
</html>
