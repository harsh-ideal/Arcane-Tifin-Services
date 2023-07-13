<%@page import="myPack.DatabaseManager"%>
<%
DatabaseManager db=new DatabaseManager();
out.print(db.getCon());
%>


