<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
       <%
		String msg = (String) request.getAttribute("msg");
	%>
         <form action="UserCtl" method="post">
         <%@ include file="Header.jsp"%>
		<br> <br>
		<div align="center">
			<h1 align="center" style="margin-bottom: -15; color: navy">Add User</h1>
<table>
     <tr>
				<%
					if (msg != null) {
				%>
				<%=msg%>
				<%
					}
				%>
			</tr>
  			<tr>
				<th>First_Name :</th>
				<td><input type="text" name="firstName"></td>
			</tr>
			<tr>
			<th>Last_Name :</th>
			<td><input type ="text" name="lastName"></td>
			</tr>
			<tr>
			<th>Login_Id :</th>
			<td><input type="text" name="loginId"></td>
			</tr>
			<tr>
			<th>Password :</th>
			<td><input type="password" name="password"></td>
			</tr>
			
			<tr>
				<th>Address :</th>
				<td><input type="text" name="address"></td>
			</tr>
			<tr>
				<th>Dob :</th>
				<td><input type="date" name="dob"></td>
			</tr>
			
			<tr>
				<th></th>
				<td><input type="Submit" name="operation" value="SignUp">
			   <!--  <input type="Submit" name="operation" value="Reset"></td> -->	
			</tr>
		
		</table>
		</div>
		
		<br> <br> <br> <br> <br> <br> <br>
		<br> <br> <br> <br>
	
</form>

      <%@ include file="Footer.jsp"%>

</body>
</html>