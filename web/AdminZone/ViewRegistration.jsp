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
        <script src="../js/jquery-3.3.1.min.js" type="text/javascript"></script>
        <script src="../js/bootstrap.min.js" type="text/javascript"></script>
        <link href="../js/akash.css" rel="stylesheet" type="text/css"/>
       
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
                    <h3 class='text-center text-warning'>View Contact Details</h3>
                    <hr style="height: 2px;background: orangered;width:50%">
                    <table class='table table-responsive table-bordered' id="example">
                        <thead style="background: orangered;color: white">
                            <tr>
                                <th>SN.</th><th>Name</th><th>Email</th><th>Mobile</th>
                                <th>Message</th><th>Date</th><th>Delete</th><th>EDIT</th>
                            </tr>
                        </thead>
                        <tbody>
                    <%
                    String cmd="select * from tb_contact";
                    DatabaseManager db=new DatabaseManager();
                    ResultSet rs=db.DisplayAllRecords(cmd);
                    while(rs.next())
                    {
                        %>
                        <tr>
                            <td><%=rs.getString("cid")%></td>
                            <td><%=rs.getString("name")%></td>
                            <td><%=rs.getString("email")%></td>
                            <td><%=rs.getString("mobile")%></td>
                            <td><%=rs.getString("massage")%></td>
                            <td><%=rs.getString("cdt")%></td>
                            <td>
    <a href="Enquirydelete.jsp?del=<%=rs.getString("cid")%>"> 
        <span class='fa fa-trash-o'></span>
    </a>
                            </td>
                            <td>
                                <a href="Enquiryupdate.jsp?up=<%=rs.getString("cid")%>">
                                <span class='fa fa-edit'></span>
                                </a>
                            </td>
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
                    
                    <div>
            <%@ include file="Footer.jsp" %>
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
