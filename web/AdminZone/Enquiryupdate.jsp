

<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="myPack.DatabaseManager"%>
<%@page import="java.sql.ResultSet"%>
<%
if(session.getAttribute("aid")!=null && session.getAttribute("aid")!="")
{
   //out.print(session.getAttribute("uid"));
%>
<% 
    if(request.getParameter("submit")!=null){
        String name=request.getParameter("textname");
        String email=request.getParameter("textemail");
        String mobile=request.getParameter("textmobile");
        String msg=request.getParameter("textmsg");
        String upid=request.getParameter("up");
        SimpleDateFormat sm=new SimpleDateFormat();
        String dt=sm.format(new Date());
        String cmd="update tb_contact set name='"+name+"',email='"+email+"',mobile='"+mobile+"',massage='"+msg+"',cdt='"+dt+"' where cid='"+upid+"'";
        DatabaseManager db=new DatabaseManager();
        if(db.MyInsertUpdateDelete(cmd))
        {
            out.print("<script>alert('Update succesfuly');window.location='ViewRegistration.jsp'</script>");
        }
        else
        {
            out.print("<script>alert('Unable to update')</script>");
        }
    }
%>
<html>
    <head>
        
    </head>
    <body>
        <div>
            <%@include file="header.jsp" %>
        </div>
        <%
                    String upid=request.getParameter("up");
                    String cmd1="select * from tb_contact where cid='"+upid+"'";
                     DatabaseManager db=new DatabaseManager();
                    ResultSet rs1=db.DisplayAllRecords(cmd1);
                    %>
              
                    
                    <div class="col-sm-12">
            <div class="row text-center" style="color: red;font-size: 25px;padding: 1%;font-weight: bold;">
                Edit Contact Info<i class="fa fa-smile-o fa-spin"></i>
            </div>
        </div><br><br><br><br><br>
        <div class="row">
            <div class="col-sm-3"></div>
            <div class="col-sm-6">
                            <% while(rs1.next()){%>
                            <form action="#" method="post">
                    <div class="input-group">
                        <label for="na" class="form-control">Name:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   </label>
                        <i class="input-group-addon"><span class="fa fa-user"></span></i>
                        <input type="text" id="na" value="<%=rs1.getString("name")%>" class="form-control" name="textname">
                    </div><br>
                    <div class="input-group">
                       <label for="em" class="form-control">Email:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
                        <i class="input-group-addon"><span class="fa fa-phone fa-phone"></span></i>
                        <input type="email" id="em" value="<%=rs1.getString("email")%>" class="form-control" name="textemail">
                    </div><br>
                    <div class="input-group">
                        <label for="mo" class="form-control">Mobile:&nbsp;&nbsp;&nbsp; </label>
                        <i class="input-group-addon"><span class="fa fa-phone fa-phone"></span></i>
                        <input type="tel" id="mo" value="<%=rs1.getString("mobile")%>" class="form-control" name="textmobile">
                    </div><br>
                    <div class="input-group">
                        <label for="sms" class="form-control">Message:</label>
                        <i class="input-group-addon"><span class="fa fa-info"></span></i>
                        <input id="sms" value="<%=rs1.getString("massage")%>" class="form-control" name="textmsg">      
                    </div><br>
                    <input type="submit" class="btn form-control btn-danger " value="Update" name="submit">
                </form>
                            <%}%>
                    
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