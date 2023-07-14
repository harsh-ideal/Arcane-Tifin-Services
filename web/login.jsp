<%@page import="java.sql.ResultSet"%>
<%@page import="myPack.DatabaseManager"%>
<%
    try
    {
    if(request.getParameter("login")!=null)
    {
        String mobile=request.getParameter("txtmobile");
        String pass=request.getParameter("txtpass");
        String cmd="select * from tbl_login where userid='"+mobile+"' and password='"+pass+"'"; 
        //out.print(cmd);
        DatabaseManager db=new DatabaseManager();
        ResultSet rs=db.DisplayAllRecords(cmd);
        if(rs.next())
        {
         String type=rs.getString("type");//user
         if(type.equals("user"))
         {
             session.setAttribute("uid",mobile);
             response.sendRedirect("UserZone/Dashboard.jsp");
         }
         else if(type.equals("admin"))
         {
             session.setAttribute("aid",mobile);
             response.sendRedirect("AdminZone/Dashboard.jsp");
         }
         else if(type.equals("dealer"))
         {
             session.setAttribute("did",mobile);
             response.sendRedirect("Distributer/Dashboard.jsp");
         }
         else
         {
              out.print("<script>alert('Invalid User TYpe')</script>");
         }
        }
        else
        {
        out.print("<script>alert('Invalid UserId and password')</script>");
        }
            
    }
    }
    catch(Exception ex)
    {
        
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
        <div class="container-fluid">
        <div class="row">
        <div class="col-sm-12">
            <div class="row text-center" style="color: red;font-size: 25px;padding: 1%;font-weight: bold;">
                Login Here<i class="fa fa-smile-o fa-spin"></i>
            </div>
        </div><br><br><br><br><br>
        
            <div class="col-sm-4"></div>
            <div class="col-sm-4">
                <form action="login.jsp" method="post">
                    
                    <div class="input-group">
                        <i class="input-group-addon"><span class="fa fa-phone fa-phone"></span></i>
                        <input type="text" pattern="[0-9]{10}" placeholder="Enter mobile numbere here" class="form-control" name="txtmobile">
                    </div><br>
                    <div class="input-group">
                        <i class="input-group-addon"><span class="fa fa-key fa-spin"></span></i>
                        <input type="password" placeholder="Enter password here" class="form-control" name="txtpass">
                    </div><br>
                    <input type="submit" class="btn form-control btn-danger " value="Login" name="login">
                    <p>Are you new user?,Click on <a href="registration.jsp">Registration</a>
                </form>
            </div>
            <div class="col-sm-4"></div>
        </div>
        </div>
         <div style="height: 250px;"></div>
            <div>
      <%@include file="Master_Page/footer.jsp" %>
      </div> 
    </body>
</html>
