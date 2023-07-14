<%@page import="java.sql.ResultSet"%>
<%@page import="myPack.DatabaseManager"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%
if(session.getAttribute("aid")!=null && session.getAttribute("aid")!="")
{
  // out.print(session.getAttribute("uid"));
%>
<% 
    if(request.getParameter("submit")!=null){
        String refer=request.getParameter("txtrefer");
        String comp=request.getParameter("txtmobile");
        String resp=request.getParameter("txtresponse");
        String type=request.getParameter("txttype");
        SimpleDateFormat sm=new SimpleDateFormat();
        String dt=sm.format(new Date());
        String cmd="insert into tbl_response(response,user_id,type,refer,rdt) values('"+resp+"','"+comp+"','"+type+"','"+refer+"','"+dt+"')";
        DatabaseManager db=new DatabaseManager();
        if(db.MyInsertUpdateDelete(cmd))
        {
            out.print("<script>alert('Send Response');window.location='ViewComplain.jsp'</script>");
        }
        else
        {
            out.print("<script>alert('Unable to Send');window.location='ViewComplain.jsp'</script>");
        }
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
        <div >
            <%@include file="header.jsp" %>
        </div>
         <%
                    String id=request.getParameter("up");
                    String cmd2="select * from tb_complain where sn='"+id+"'";
                     DatabaseManager db=new DatabaseManager();
                    ResultSet rs2=db.DisplayAllRecords(cmd2);
                    %>
                    <div class="container-fluid">
        <div class="row">
            <div class="col-sm-12">
                <div class="col-sm-4"></div>
                <div class="col-sm-4">
                    <form action="response.jsp" method="post">
                         <% 
                    while(rs2.next())
{%>  <input type="hidden" name="txttype" value="<%=rs2.getString("type")%>">
<input type="hidden" name="txtrefer" value="<%=rs2.getString("SN")%>">
                        S.No.:
                        <input readonly type="text" value="<%=rs2.getString("Sn")%>" name="txtno" class="form-control">
                        This is Complain Id
                        <input  Readonly type="text" value="<%=rs2.getString("mobile")%>" name="txtmobile" class="form-control">
                        <%}%>
                        Give a response:
                        <textarea cols="24" rows="2"  name="txtresponse" class="form-control"></textarea>
                        <br>
                      
                        <input type="submit" class="form-control btn-info" name="submit" value="Send Response">
                    </form>
                </div>
                  <div class="col-sm-4"></div>
            </div>
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
