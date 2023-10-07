<%@page import="in.co.rays.bean.RoleBean"%>
<%@page import="in.co.rays.ctl.ORSView"%>
<%@page import="in.co.rays.bean.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Header</title>
<!-- <link rel="stylesheet" href="/resources/demos/style.css"> -->
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script>
	$(function() {
		$("#datepicker").datepicker({
			changeMonth : true,
			changeYear : true,
		//	yearRange : '1970:2025'
			maxDate: '12/31/2004',
			minDate: '01/01/1981',
		});
	});
</script>

</head>
       <%
       UserBean userBean = (UserBean)seesion.getAttribute("user");
        boolean userLoggedIn = userBean!=null;
        String welcomeMsg = "Hi, ";

        if(userLoggedIn){
                  String role = (String)session.getAttribute("role");
                  welcomeMsg += userBean.getFirstName() + "("+ role +")";
        }
        else{
        	welcomeMsg +="Guest";
        	
        }
%>
       <table>width="100" border="0"

            <tr>  
                   <td width="80%"><a href="<%=ORSView.Welocome_CTL%>">Welocome</a>  |
                   <%if(userLoggedIn){ %> <a href="<%=ORSView.Login_Ctl%>?operation=<%=LoginCtl.OP_LOG_OUT%>">Logout</a>
                   <%}else{ %>
                   <a href="<%=ORSView.Login_Ctl%>">Login</a>
                   <%} %></td>
                   <td rowspan="2">
                                    <h1 align="right">
                                    <img alt="<%=ORSView.APP_CONTEXT%>/img/krishna.jpg" width="300" height="100">
                                    </h1>
                         </td>
                       </tr>
                       <tr>
                       <td>
                             <h3><%=welcomeMsg%></h3>
                       </td>
                       </tr>
                       
                       <%
                            if(userLoggedIn){
                          
                             %>
                             <tr>
                                  <td colspan="2">
                                        <a href="<%=ORSView.My_Profile_Ctl%>">My Profile</a> |
                                        <a href="<%=ORSView.Change_Password_Ctl%>">Change Password</a> |
                                        <a href="<%=ORSView.Get_Marksheet_Ctl%>">Get Marksheet</a> | 
                                        <a href="<%=ORSView.Marksheet_Merit_List_Ctl%>">Marksheet Merit List</a> |
                                        
                             <%
                           //if (userBean.getRoleId()==RoleBean.ADMIN)
                        	   if (userBean.getRoleId()==1){
                        		
                             %>    
                                   | <a href="<%=ORSView.Marksheet_Ctl%>">Add Marksheet</b></a> | 
		  <a href="<%=ORSView.Marksheet_List_Ctl%>">Marksheet List</b></a> |
		  <a href="<%=ORSView.User_Ctl%>">Add User</b></a> |
		  <a href="<%=ORSView.User_List_Ctl%>">User List</b></a> | 
		  <a href="<%=ORSView.College_Ctl%>">Add College</b></a> | 
		  <a href="<%=ORSView.COllege_List_Ctl%>">College List</b></a> | 
		  <a href="<%=ORSView.Studend_Ctl%>">Add Student</b></a> | 
		  <a href="<%=ORSView.Student_List_Ctl%>">Student List</b></a> | 
		  <a href="<%=ORSView.Role_Ctl%>">Add Role</b></a> | 
		  <a href="<%=ORSView.Role_List_Ctl%>">Role List</b></a> |
		  <a href="<%=ORSView.Course_Ctl%>">Add Course</b></a> | 
		  <a href="<%=ORSView.Course_List_Ctl%>">Course List</b></a> | 
		  <a href="<%=ORSView.Subject_Ctl%>">Add Subject</b></a> | 
		  <a href="<%=ORSView.Subject_List_Ctl%>">Subject List</b></a> | 
		  <a href="<%=ORSView.Timetable_Ctl%>">Add TimeTable</b></a> | 
		  <a href="<%=ORSView.Timetable_List_Ctl%>">TimeTable List</b></a>| 
		  <a href="<%=ORSView.Faculty_Ctl%>">Add Faculty</b></a>| 
		  <a href="<%=ORSView.Faculty_List_Ctl%>">Faculty List</b></a> | 
		  <a href="<%=ORSView.Java_Doc_View%>"  target="blank">Java Doc</b></a> | 
		  
		  <%
		      }
		   %>
		   
		   <%
		   if(userBean.getRoleId() == RoleBean.STUDENT){
			
		   %>
		   
		      <a href="<%=ORSView.College_List_Ctl%>">College List</b></a> |
        <a href="<%=ORSView.Student_List_Ctl%>">Student List</b></a> |
        <a href="<%=ORSView.Course_List_Ctl %>">Course List</b></a> |       
        <a href="<%=ORSView.Subject_List_Ctl %>">Subject List</b></a> |       
        <a href="<%=ORSView.Faculty_List_Ctl %>">Faculty List</b></a> |
        <a href="<%=ORSView.Timetable_List_Ctl %>">TimeTable List</b></a> |
		
        <%
             }
             %>
             
             <%
             if(userBean.getRoleId() == RoleBean.KIOSK){
            	 
             %>
              <a href="<%=ORSView.College_List_Ctl%>">College List</b></a> |
        <a href="<%=ORSView.Timetable_List_Ctl %>">TimeTable List</b></a> |
        <a href="<%=ORSView.Course_List_Ctl %>">Course List</b></a> |       
       <%
     		}
 		%>
 		   
 		   <%
 		   
 		   if(userBean.getRoleId() == RoleBean.COLLEGE_SCHOOL){
 			
 		   %>
 		   <a href="<%=ORSView.Marksheet_Ctl%>">Add Marksheet</b></a> |       
        <a href="<%=ORSView.Marksheet_List_Ctl%>">Marksheet List</b></a> |
        <a href="<%=ORSView.Student_Ctl%>">Add Student</b></a> |
        <a href="<%=ORSView.Student_List_Ctl%>">Student List</b></a> |
        <a href="<%=ORSView.Faculty_List_Ctl %>">Faculty List</b></a> |
        <a href="<%=ORSView.Timetable_List_Ctl %>">TimeTable List</b></a> |
        <a href="<%=ORSView.Course_List_Ctl %>">Course List</b></a> |  
 		 <%
 		      } 
 		      %>
 		      
 		          </td>
 		          
 		  </tr>
 		  
 		  <%
 		      }
 		  %>  
 		          
 		 
               </table>
            <hr>
<body>

</body>
</html>