<%@page import="myPack.DatabaseManager"%>
<%
if(session.getAttribute("did")!=null && session.getAttribute("did")!="")
{
    out.print(session.getAttribute("uid"));
%>
<%
    if(request.getParameter("submit")!=null)
    {
String id=session.getAttribute("did")+"";
String oldpass=request.getParameter("txtoldpass");
String newpass=request.getParameter("txtnewpassword");
String cpass=request.getParameter("txtconfirmpassword");
if(newpass.equals(cpass))
{
    String cmd="update tbl_login set password='"+newpass+"' where userid='"+id+"' and password='"+oldpass+"'";
    DatabaseManager db=new DatabaseManager();
    if(db.MyInsertUpdateDelete(cmd))
           out.print("<script>alert('password change successfully')</script>"); 
    else
        out.print("<script>alert('Invalid password')</script>");
}
else
   out.print("<script>alert('Newpassword and confirm password not match')</script>"); 
    }
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Change Password</title>
    </head>
    <body>
        <div>
            <%@include file="header.jsp" %>
        </div>
        <div class="row">
            <div class="col-sm-12">
                <div class="col-sm-4"></div>
                <div class="col-sm-4">
                    <form action="AChangePassword.jsp" method="post">
                        Enter Old Password
                        <input type="password" name="txtoldpass" class="form-control">
                        Enter New Password
                        <input type="password" name="txtnewpassword" class="form-control">
                        ENter Confirm Password
                        <input type="password" name="txtconfirmpassword" class="form-control">
                        <br>
                        <input type="submit" class="form-control btn-info" name="submit" value="Change Password">
                    </form>
                </div>
                  <div class="col-sm-4"></div>
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
