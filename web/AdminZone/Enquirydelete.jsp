<%@page import="java.sql.ResultSet"%>
<%@page import="myPack.DatabaseManager"%>
<%
    String id=request.getParameter("del");
    String cmd="delete from tb_contact where cid='"+id+"'";
    DatabaseManager db=new DatabaseManager();
    if(db.MyInsertUpdateDelete(cmd))
        out.print("<script>alert('Enquiry Deleted');window.location.href='ViewRegistration.jsp';</script>");
    else
       out.print("<script>alert('server error');window.location.href='ViewRegistration.jsp';</script>"); 
    
%>

