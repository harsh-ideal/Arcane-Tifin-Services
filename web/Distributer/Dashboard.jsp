<%-- 
    Document   : Dashboard
    Created on : 19 Jun, 2023, 12:53:02 PM
    Author     : harsh
--%>
<%
if(session.getAttribute("did")!=null && session.getAttribute("did")!="")
{
    out.print(session.getAttribute("uid"));
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
            <%@include file="header.jsp" %>
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
