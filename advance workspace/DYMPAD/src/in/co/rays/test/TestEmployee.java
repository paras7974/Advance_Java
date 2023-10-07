package in.co.rays.test;

import java.text.SimpleDateFormat;

import in.co.rays.bean.EmployeeBean;
import in.co.rays.model.EmployeeModel;

public class TestEmployee {

    public static void main(String[] args) throws Exception {
    	
         testAdd();
		
	}
    
    
	private static void testAdd()throws Exception {
		
	
    	String dob = "2011-11-11";
    	
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
         
    	EmployeeBean bean = new EmployeeBean();
    	
    	bean.setId(10);
    	bean.setFirstName("jatin");
    	bean.setLastName("bhai");
    	bean.setLoginId("jb@gmail.com");
    	bean.setPassword("jb123");
    	bean.setDob(sdf.parse(dob));
    	bean.setAddress("bhopal");
    	
    	EmployeeModel model = new EmployeeModel();
    	
    	model.add(bean);
    }
	
}

