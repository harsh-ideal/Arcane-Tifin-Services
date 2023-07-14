<%@page import="java.sql.ResultSet"%>
<%@page import="myPack.DatabaseManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
if(session.getAttribute("aid")!=null && session.getAttribute("aid")!="")
{
   //out.print(session.getAttribute("uid"));
%>
<!DOCTYPE html>
<html>
    <head>
        <link href="../css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="../css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="../js/jquery-2.1.0.min.js" type="text/javascript"></script>
        <script>
            $(document).ready(function(){
                $("#example").DataTable();
                
            })
            </script>
    </head>
    <body>
        <div>
            <%@ include file="header.jsp" %>
        </div>
        <div class="container-fluid">
        <div class="row">
            <div class="col-sm-12">
                <div class="col-sm-2"></div>
                <div class="col-sm-8" style="margin-top: 3%">
                    <h3 class='text-center text-warning'>View Complain Detail</h3>
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
                    String cmd="select * from tb_complain";
                    DatabaseManager db=new DatabaseManager();
                    ResultSet rs=db.DisplayAllRecords(cmd);
                    while(rs.next())
                    {
                        %>
                        <tr>
                            <td><%=rs.getString("sn")%></td>
                            <td><%=rs.getString("mobile")%></td>
                            <td><%=rs.getString("complain")%></td>
                            <td><%=rs.getString("cdt")%></td>
                            <td><%=rs.getString("type")%></td>
                            <%
                            String sn=rs.getString("sn");
                            String cmd1="select * from tbl_response where refer='"+sn+"'";
                            ResultSet rs1=db.DisplayAllRecords(cmd1);
                            if(rs1.next()){
                            %>
                            <td>Responsed</td>
                            <%
                            } 
                            else{
                                %>
                            <td><a href="response.jsp?up=<%=rs.getString("sn")%>"><span class="glyphicon glyphicon-cloud-upload"></span>Response Pending</a></td>
                            
                        </tr>
                        <% }
                    
                    }%>
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
