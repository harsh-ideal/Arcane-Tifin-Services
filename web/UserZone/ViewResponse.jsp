<%@page import="java.sql.ResultSet"%>
<%@page import="myPack.DatabaseManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
if(session.getAttribute("uid")!=null && session.getAttribute("uid")!="")
{
    //out.print(session.getAttribute("uid"));
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <body>
        <div>
            <%@ include file="../UserZone/header.jsp" %>
        </div>
        <div class="container-fluid">
        <div class="row">
            <div class="col-sm-12">
                <div class="col-sm-2"></div>
                <div class="col-sm-8" style="margin-top: 3%">
                    <h3 class='text-center text-warning'>View Response Detail</h3>
                    <hr style="height: 2px;background: orangered;width:50%">
                    <table class='table table-responsive table-bordered' id="example">
                        <thead style="background: orangered;color: white">
                            <tr>
                                <th>SN.</th><th>Mobile</th>
                                <th>Complain</th><th>Date</th><th>Type</th><th>Response Status</th>
                            </tr>
                        </thead>
                        <tbody>
                    <%
                    String cmd="select * from tb_complain,tbl_response where tb_complain.mobile=tbl_response.user_id and tb_complain.sn=tbl_response.refer";
                    DatabaseManager db1=new DatabaseManager();
                    ResultSet rs1=db1.DisplayAllRecords(cmd);
                    while(rs1.next())
                    {
                        %>
                        <tr>
                            <td><%=rs1.getString("sn")%></td>
                            <td><%=rs1.getString("mobile")%></td>
                            <td><%=rs1.getString("complain")%></td>
                             <td><%=rs1.getString("response")%></td>
                            <td><%=rs1.getString("cdt")%></td>
                            <td><%=rs1.getString("type")%></td>
                        </tr>
                        <%
                    }
                        %>
                    </tbody>
                    </table>
                </div>
                <div class="col-sm-2"></div>
            </div>
        </div>
        </div>
          <div style="height: 240px"></div>
    </body>
   
</html>
<%
}
else
{
response.sendRedirect("../login.jsp");
}
%>
