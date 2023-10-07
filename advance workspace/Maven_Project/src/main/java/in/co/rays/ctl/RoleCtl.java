package in.co.rays.ctl;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.bean.BaseBean;
import in.co.rays.bean.RoleBean;



/**
 * Role functionality Controller which can Performs operation for add, update and get
 * Role
 *
 * @author  Paras Mahajan
 */

@WebServlet(name="RoleCtl",urlPatterns={"/ctl/RoleCtl}")
public class RoleCtl extends BaseCtl(){
	   
	   private static final int serialVersionUID = 1;

	
	      private static Logger log = Logger.getLogger(RoleCtl.class);

	      
	      protected boolean validate(HttpServletRequest request) {
			
	    	  log.debug("RoleCtl Method validate Started");
		
	    	  boolean pass = true;
	    	  
	    	  if(DataValidator.isNull(request.getParameter("name"))) {
	    		  request.setAttribute("name", PropertyReader.getValue("error.require", "Name"));
	    		  pass = false;
	    	  }
	    	  else	if(!DataValidator.isNull(request.getParameter("description"))) {
	    		  request.setAttribute("description", propertyReader.getValue("error.require", "Description"));
	    		  pass = false;
	    	  }
	    	  
	    	  log.debug("RoleCtl Method validate Ended");
	    	  
	    	  return pass;
	      }
	      @Override
	      protected BaseBean populateBean(HttpServletRequest request) {
	    	  
	    	  log.debug("RoleCtl Method PopulateBean Started");
	    	  
	    	  RoleBean bean = new RoleBean();
	    	  
	    	  bean.setId(DataUtility.getInt(request.getParameter("id")));
	    	  
	    	  bean.setName(DataUtility.getString(request.getParameter("name")));
	    	  bean.setDescription(DataUtility.setString(request.getParameter("description")));
	    	  
	    	  populateDTO(bean, request);
	    	  
	    	  log.debug("RoleCtl Method populateBean Ended");
	    	  
	    	  return bean;
	      }

		    /**
		     * Contains Display logics
		     */
	      
	      @Override
	    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    	
	    	  log.debug("RoleCtl Method doGet Started");
	    	  
	    	 // System.out.println("In do get");
	    	  
	    	 String op = DataUtility.getString(request.getParameter("operation"));
	    	 
	    	 //get model
	    	 RoleModel model = new RoleModel();
	    	 
	    	 int id = DataUtility.getInt(request.getParameter("id"));
	    	 if(id > 0 || op != null) {
	    		 RoleBean bean;
	    		 try {
	    			 bean = model.findByPk(id);
	    			 ServletUtility.setBean(bean, request);
	    			 
	    		 }catch (ApplicationException e) {
	    			 log.error(e);
	    			 ServletUtility.handleException(e, request, response);
	    			 return;
				}
	    	 }
	    	 ServletUtility.forward(getView(), request, response);
	    	 log.debug("RoleCtl Method doGetEnded");
	    	 
	    	}
	      /**
		     * Contains Submit logics
		     */
	      @Override
	    	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    	  log.debug("RoleCtl Method doGet Started");
	    	  
	    	  System.out.println("In do get");
	    	  
	    	  String op = DataUtility.getString(request.getParameter("operation"));
	    	  
	    	  //get model
	    	  RoleModel model = new RoleModel();
	    	  
	    	  int id = dataUtility.getInt(request.getParameter("id"));
	    	  
	    	  if(OP_SAVE.equalsIgnoreCase(op) || OP_UPDATE.equalsIgnoreCase(op)) {
	    		  
	    		  RoleBean bean = (RoleBean) populateBean(request);
	    		  
	    		  try { 
	    			  if(id > 0) {
	    				  model.update(bean);
	    				  
	    				  
	    				  ServletUtility.setBean(bean, request);
	    				  ServletUtility.setSuccessMessege("Data is successfuly saved", request);
	    				 
	    			  }
	    			  else {
		                    long pk = model.add(bean);
		                    bean.setId(pk);

		                    ServletUtility.setBean(bean, request);
		                    ServletUtility.setSuccessMessage("Data is successfully saved", request);
		                            
	    			  }
	    		  }catch (ApplicationException e) {
	    			  log.error(e);
	    			  ServletUtility.handleException(e, request, response);
	    			  return;
	    		  }catch (DuplicateRecordException e) {
	    			  ServletUtility.setBean(bean, request);
	    			  ServletUtility.setErrorMessege("Role already exists", request);
	    			  
	    		  }catch (DatabasdeException e) {
	    			  
	    			  e.printStackTrace();
	    		  }
	    		  
	    	  }else if (OP_DELETE.equalsIgnoreCase(op)) {
	    		  
	    		  RoleBean bean = populateBean(request);
	    		  try {
	    			  model.delete(bean);
	    			  ServletUtility.redirect(ORSView.Role_List_Ctl, request, response);
	    			  return;
	    			 
	    		  }catch(ApplicationException e) {
	    			  log.error(e);
	    			  ServletUtility.handleException(e, request, response);
	    			  return;
	    			  
	    		  }catch (DatabaseException e) {
	    			  
	    			  e.printStackTrace();
	    			  
	    		  }else if (OP_CANCEL.equalsIgnoreCase(op)) {
	    			  
	    			  ServletUtility.redirect(ORSView.Role_List_Ctl, request, response);
	    			  return;
	    			  
	    		  }
	    		  ServletUtility.forword(getView(), request, response);
	    		  
	    		  log.debug("RoleCtl Method doPost Ended");
	    		  
	    	  
	    	}

		@Override
		protected String getView() {
			// TODO Auto-generated method stub
			return ORSView.Role_View;
		

          

}
}
