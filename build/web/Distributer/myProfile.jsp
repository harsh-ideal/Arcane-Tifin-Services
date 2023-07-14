
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="myPack.DatabaseManager"%>
<%@page import="java.sql.ResultSet"%>
<%
if(session.getAttribute("did")!=null && session.getAttribute("did")!="")
{
    //out.print(session.getAttribute("did"));
%>
<% 
    if(request.getParameter("submit")!=null){
        String tiffin_name=request.getParameter("text_tiffin_name");
        String name=request.getParameter("textname");
        String email=request.getParameter("textemail");
        String mobile=request.getParameter("textmobile");
        String pin_code=request.getParameter("textpin");
        String msg=request.getParameter("textmsg");
        String upid=request.getParameter("textaddr");
        SimpleDateFormat sm=new SimpleDateFormat();
        String dt=sm.format(new Date());
        String cmd="update tb_registration_cust set tiffin_name='"+tiffin_name+"',name='"+name+"',mobile='"+mobile+"',email='"+email+"',massage='"+msg+"',cdt='"+dt+"' where cid='"+upid+"'";
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
        <script src="../js/jquery-2.1.0.min.js" type="text/javascript"></script>
        <script>
            $(document).ready(function(){
                $(".form-control").attr("Disabled",true);
                $(".btn-success").hide();
                $(".btn-danger").click(function(){
                    $(".btn-danger").hide();$(".btn-success").show();
                     $(".form-control").attr("Disabled",false);
                })
            })
            </script>
    </head>
    <body>
        <div>
            <%@include file="header.jsp" %>
        </div>
        
              
                    
                    <div class="col-sm-12">
            <div class="row text-center" style="color: red;font-size: 25px;padding: 1%;font-weight: bold;">
                My Profile<i class="fa fa-smile-o fa-spin"></i>
            </div>
        </div><br><br><br><br><br>
        <div class="row">
            <div class="col-sm-3"></div>
            <div class="col-sm-6">
                
                            <% 
                                String upid=request.getParameter("up");
                    String cmd1="select * from tb_registration_cust where mobile='"+upid+"'";
                     DatabaseManager db=new DatabaseManager();
                    ResultSet rs1=db.DisplayAllRecords(cmd1);
                                 while(rs1.next())
                            {
                            %>
                             <form action="contact_us.jsp" method="post">
                                 <div class="input-group">
                        <label for="na" class="form-control">Tiffin Service Name:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   </label>
                        <i class="input-group-addon"><span class="fa fa-user"></span></i>
                        <input type="text" id="na" value="<%=rs1.getString("tiffin_name")%>" class="form-control"  name="text_tiffin_name">
                    </div><br>
                    <div class="input-group">
                        <label for="na" class="form-control">Name:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   </label>
                        <i class="input-group-addon"><span class="fa fa-user"></span></i>
                        <input type="text" id="na" value="<%=rs1.getString("name")%>" class="form-control"  name="textname">
                    </div><br>
                    <div class="input-group">
                       <label for="em" class="form-control">Email:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
                        <i class="input-group-addon"><span class="fa fa-phone fa-phone"></span></i>
                        <input type="email" id="em" value="<%=rs1.getString("email")%>" class="form-control"  name="textemail">
                    </div><br>
                    <div class="input-group">
                        <label for="mo" class="form-control">Mobile:&nbsp;&nbsp;&nbsp; </label>
                        <i class="input-group-addon"><span class="fa fa-phone fa-phone"></span></i>
                        <input type="tel" id="mo" value="<%=rs1.getString("mobile")%>" class="form-control"  name="textmobile">
                    </div><br>
                    <div class="input-group">
                        <label for="sms" class="form-control">Pin:</label>
                        <i class="input-group-addon"><span class="fa fa-info"></span></i>
                        <input id="sms" value="<%=rs1.getString("pin_code")%>" class="form-control"  name="textmsg">      
                    </div><br>
                    <div class="input-group">
                        <label for="adr" class="form-control">Address:</label>
                        <i class="input-group-addon"><span class="fa fa-info"></span></i>
                        <input id="adr" value="<%=rs1.getString("address")%>" class="form-control"  name="textaddr">      
                    </div><br>
                    <div class="input-group">
                        <label for="adr" class="form-control">Address:</label>
                        <i class="input-group-addon"><span class="fa fa-info"></span></i>
                        <input id="adr" value="<%=rs1.getString("description")%>" class="form-control"  name="textaddr">      
                    </div><br>
                    <input type="button" class="btn  btn-danger " value="Edit" name="edit">
                    <input type="submit" class="btn  btn-success " value="Update" name="submit">
                </form>
                            <%
                            }
                            %>
                    
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
