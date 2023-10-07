<%@page import="com.mysql.cj.conf.DatabaseUrlContainer"%>
<%@page import="in.co.rays.ctl.ORSView"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Role - Add</title>
</head>
<body>
      <form action="<%=ORSView.Role_Ctl%>" method="post">
      
       <title> Add Role</title>
          
          <%@ include file="Header.jsp"%>
          <jsp:useBean id="bean" class="in.co.rays.bean.RoleBean" scope="request"></jsp:useBean>
          
          <center>
             
              <h1>
                <%
                    if( bean != null && bean.getId()>0){
                 %>  
                 	<tr><th><font>Update Role</font></th></tr>
                 	<% } %>
                 	
                </h1>
                   <H2>
                     <font color="green"> <%=ServletUtility.getSuccessMessage(request)%>
                     </font>
                   
                   </H2>
                   <H2>
                     <font color="green"> <%= ServletUtility.getErrorMessege(request)%>
                     
                     </font>
                   </H2>
                   
                     <input type="hidden" name="id" value="<%=bean.getId()%>">
                     <input type="hidden" name="createdBy" value="<%=bean.getCreatedby()%>">
                     <input type="hidden" name="modifiedBy" value="<%=bean.getModifiedBy()%>">
                     <input type="hidden" name="createdDatetime" value="<%=DataUtillity.getTimestamp(bean.getCreated_DateTime())%>">
                     <input type="hidden" name="modifiedDatetime" value="<%=DateUtility.getTimestamp(bean.getModified_DateTime()) %>">
                     
                     <table>
                          <tr>
                              <th align = "left">Name <font color="red" >*</th>
                              <td><input type="text" name="name" placeholder="Enter_Name" value="<%=DataUtility.getStringData(bean.getName())%>"></td>
                             <td style="position: fixed"><font color="red"> <%=ServletUtility.getErrorMessege("name", request)%></font></td>
                             </tr>
                             <tr>
                             <th align = "left">Description <font color="red" >*</th>
                             <td><input type="text" name="description" placeholder="Enter_Description" value="<%=DataUtility.getStringData(bean.getDescription())%>"></td>
                             <td style="position: fixed"><font color="red"> <%=ServletUtililty.getErrorMessege("description", request)%></font></td>
                              </tr>
                              
                              <tr>
                                              <th></th>
                                              <%
                                   if(bean.getId()> 0){
                              %><td colspan="2"><input type="submit" name="operation" value="<%=RoleCtl.OP_UPDATE%>">&nbsp;
                              <input type="submit" name="operation" value="<%=RoleCtl.OP_CANCEL%>"></td>
                              
                              <%
                              }else{
                              %>
                              
                              <td colspan="2">
                              <input type="submit" name="operation" value="<%=RoleCtl.OP_SAVE%>">&nbps; &nbps;
                              <input type="submit" name="operation" value="<%=RoleCtl.OP_RESET%>"></td>
                              
                                  <%
                                  }
                                  %>
                                 </tr>
                 
                     </table>
         
           
      </form>
     </center>
     <%@ include file="Footer.jsp"%>

</body>
</html>