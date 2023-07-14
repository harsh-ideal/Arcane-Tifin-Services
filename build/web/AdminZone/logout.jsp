<%
String id=session.getAttribute("aid")+"";
if(id!=null && id!="")
{
    session.invalidate();
    response.sendRedirect("../login.jsp");
}
else
{
    response.sendRedirect("../login.jsp");
}
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <h1></h1>
    </body>
</html>
