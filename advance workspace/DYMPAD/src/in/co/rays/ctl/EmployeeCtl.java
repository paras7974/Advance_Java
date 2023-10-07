package in.co.rays.ctl;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.bean.EmployeeBean;
import in.co.rays.model.EmployeeModel;


@WebServlet("/EmployeeCtl")
public class EmployeeCtl extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.sendRedirect("EmployeeRegistration.jsp");
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	    String firstName = req.getParameter("firstName");
	    
	    String lastname = req.getParameter("lastName");
	    String loginId = req.getParameter("loginId");
	    String password = req.getParameter("password");
	   String dob = req.getParameter("dob");
	    String address = req.getParameter("address");
	    
	   SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	  
	    
	    EmployeeBean bean = new EmployeeBean();
	    
	    bean.setFirstName(firstName);
	    bean.setLastName(lastname);
	    bean.setLoginId(loginId);
	    bean.setPassword(password);
	   try {
		bean.setDob(sdf.parse(dob));
	} catch (ParseException e) {
		e.printStackTrace();
	}
		
	    bean.setAddress(address);
	    
	    EmployeeModel model = new EmployeeModel();
	    
	    try {
			model.add(bean);
		} catch (Exception e) {
			e.printStackTrace();
		}
	   
		RequestDispatcher rd = req.getRequestDispatcher("EmployeeRegistration.jsp");
		
		rd.forward(req, resp);
	}
	
	  

}
