<%@page import="myPack.DatabaseManager"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat" %>
<%
if(session.getAttribute("uid")!=null && session.getAttribute("uid")!="")
{
    //out.print(session.getAttribute("uid"));
%>
<%
    String id=session.getAttribute("uid")+"";
    if(id!=null)
      {
        if(request.getParameter("complain")!=null)
       {
        String msg=request.getParameter("textmsg");
        SimpleDateFormat sm=new SimpleDateFormat();
        String dt=sm.format(new Date());
        String cmd="insert into tb_complain(mobile,complain,cdt,type) values('"+ id +"','"+msg+"','"+dt+"','user')";
        
        DatabaseManager db1=new DatabaseManager();
        if(db1.MyInsertUpdateDelete(cmd))
        {
            out.print("<script>alert('Complain save succesfuly')</script>");
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
        <div class="container-fluid">
         <div class="row">
            <%@include file="header.jsp" %>
        </div>
         <div class="col-sm-12">
            <div class="row text-center" style="color: red;font-size: 25px;padding: 1%;font-weight: bold;">
                Complain<i class="fa fa-smile-o fa-spin"></i>
            </div>
        </div><br><br><br><br><br>
        <div class="row">
            <div class="col-sm-3"></div>
            <div class="col-sm-6">
                <form action="complain.jsp" method="post">
                    <div class="input-group">
                        <i class="input-group-addon"><span class="fa fa-info"></span></i>
                        <textarea placeholder="Write Your complain here" rows="3" cols="24" class="form-control" name="textmsg"></textarea>
                    </div><br>
                    <input type="submit" class="btn form-control btn-danger " value="Submit Complain" name="complain">
                </form>
            </div>
        </div>
        </div>
         <div style="height: 250px;"></div>
        <div>
       <%@include file="footer.jsp" %>
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
    <%
}
else
{
response.sendRedirect("../login.jsp");
}
%>