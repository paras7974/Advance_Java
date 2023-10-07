package in.co.rays.ctl;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

/**
 * * User functionality Controller. Performs operation for add, update and get
 * User
 *
 * @author Paras Mahajan
 * 
 */

public class UserCtl extends BaseCtl {
      
	  private static final long serialVersionUID = 1L;
	  
	  private static final Logger log = Logger.getLogger(UserCtl.class);
	  
	  @Override
		protected void preload(HttpServletRequest request) {
			
		  RoleModel model = new RoleModel();
		  
		  try {
			  
		  }
		}

}
