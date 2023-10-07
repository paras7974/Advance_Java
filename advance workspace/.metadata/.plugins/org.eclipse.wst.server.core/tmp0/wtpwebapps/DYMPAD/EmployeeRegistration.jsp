<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


   <form action="EmployeeCtl" method="post">
   
     <div align="center">
   <table>
         <tr>
             <th>FirstName :</th>
             <td><input type="text" name="firstName"></td>
             </tr>
             
             <tr>
                   <th>LastName :</th>
                   <td><input type="text" name="lastName"></td>
             </tr>
             
             <tr>
             <th>loginId :</th>
             <td><input type="text" name="loginId"></td>
             
             </tr>
             
             <tr>
             <th>Password :</th>
             <td><input type="text" name="password"></td>
             
             </tr>
             
             <tr>
             <th>Dob :</th>
             <td><input type="date" name="dob"></td>
             
             </tr>
             
             <tr>
             <th>Address :</th>
             <td><input type="text" name="address"></td>
             
             </tr>
             
             <tr>
             <th></th>
             <td><input type="submit" value="Signin">
             <td><input type="submit" value="Reset"></td>
             </tr>
   
   
   </table>
   </div>
   
   
   
   
   
   
   
   </form>
</body>
</html>