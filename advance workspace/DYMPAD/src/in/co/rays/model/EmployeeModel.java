package in.co.rays.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import in.co.rays.bean.EmployeeBean;


public class EmployeeModel {
	
	public Integer nextPk()throws Exception{
		
		int Pk = 0;
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava","root","root");
		
		PreparedStatement ps = conn.prepareStatement("select max(id) from Employee");
		
	ResultSet rs =	ps.executeQuery();
	
	while(rs.next()) {
		
		Pk = rs.getInt(1);
	}
	return Pk + 1;
		
		
		
	}
     	
	   public void add(EmployeeBean bean)throws Exception{
		   
		   Class.forName("com.mysql.cj.jdbc.Driver");
		   Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava","root","root");
		   
		    PreparedStatement ps = conn.prepareStatement("insert into Employee values (?,?,?,?,?,?,?)");
		    
		    ps.setInt(1, nextPk());
		   // ps.setInt(1, bean.getId());
		    ps.setString(2, bean.getFirstName());
		    ps.setString(3, bean.getLastName());
	        ps.setString(4, bean.getLoginId());
	        ps.setString(5, bean.getPassword());
	        ps.setDate(6, new java.sql.Date(bean.getDob().getTime()));
	        ps.setString(7, bean.getAddress());
	        
	    int i = ps.executeUpdate();
	     System.out.println("Data Inserted =" + i);
	   
	  }
	   
	   public void Update (EmployeeBean bean)throws Exception {
		   
		 Class.forName("com.mysql.cj.jdbc.Driver");
         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava","root","root");
        PreparedStatement ps = conn.prepareStatement("Update Employee set FirstName=?,LastName=?,loginId=?,Password=?,Dob=?,Address=? where id = ?");
		   
        ps.setString(1, bean.getFirstName());
		ps.setString(2, bean.getLastName());   
		ps.setString(3, bean.getLoginId());  
		ps.setString(4, bean.getPassword());
		ps.setDate(5, new java.sql.Date(bean.getDob().getTime()));
		ps.setString(6, bean.getAddress());
		ps.setInt(7, bean.getId());
	   
	   int i = ps.executeUpdate();
	   
	   System.err.println("Data Updated =" + i);
	   
	   
	   }
	   
	   public void Delete(int id)throws Exception {
		   
		   Class.forName("com.mysql.cj.jdbc.Driver");
		   Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava","root","root");
		   
		   PreparedStatement ps = conn.prepareStatement("Delete from Employee where id = ?");
		   
		   ps.setInt(1, id);
		   
		  int i = ps.executeUpdate();
		  
		  System.out.println("Data Deleted =" + i);
		   


	   }
	   
	  
	   
	   
	   
}
