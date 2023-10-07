package in.co.rays.util;

import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import in.co.rays.bean.DropdownListBean;


/**
 * @paras mahajan
 *
 */
public class HTMLUtility {
	
	public String getList(String name, String selectedVal, HashMap<String, String>map) {
		
		StringBuffer sb = new StringBuffer("select class='from-control' name='" + name + "'>");
		
		Set<String> keys = map.keySet();
		String val = null;
		for(String key : keys) {
			val = map.get(key);
			if (key.trim().equals(selectedVal)) {
				sb.append("<option selected value='" + key + "'>" + val + "</option>");
				
			} else {
				sb.append("<option value='" + key + "'>" + val + "</option>");
			}
			
			}sb.append("</select>");
		return sb.toString();
		
	}
	public static String getList(String name, String selectedVal, List list) {
		
		Collection.sort(list);
		
		List<DropdownListBean> dd = (List<DropdownListBean>)list;
		
		StringBuffer sb = new StringBuffer("<select class='form-control' name='" + name + "'>");
		
		String key = null;
		String val = null;
		
		sb.append("<option style='width: 250px;  height: 35px;' selected value=''>-------------Select-------------</option>");
		
		for (DropdownListBean obj : dd) {
			key = obj.getKey();
			val = obj.getValue();
			
			if(key.trim().equals(selectedVal)) {
				sb.append("<option selected value='" + key + "'>" + val + "</option>");
				
			}else {
				sb.append("<option value='" + key + "'>" + val + "</option>");
				
			}
		}
		sb.append("</select>");
		return sb.toString();
	}
	
	public static String getList(String name, String selectedVal, HashMap<String, String> map, boolean select) {
		StringBuffer sb = new StringBuffer("<select class='form-control' name='" + name + "'>");

		Set<String> keys = map.keySet();
		String val = null;

		if (select) {

			sb.append("<option selected value=''> --Select-- </option>");
		}

		for (String key : keys) {
			val = map.get(key);
			if (key.trim().equals(selectedVal)) {
				sb.append("<option selected value='" + key + "'>" + val + "</option>");
			} else {
				sb.append("<option value='" + key + "'>" + val + "</option>");
			}
		}
		sb.append("</select>");
		return sb.toString();
}
	public static String getInputErrorMessage(HttpServletRequest request) {
		
		Enumeration<String> e = request.getAttributeNames();
		
		StringBuffer sb = new StringBuffer("<UL>");
		String name = null;
		
		while(e.hasMoreElements()) {
			name = e.nextElement();
			if(name.startsWith("error.")) {
				sb.append("<LI class='error'>" +  request.getAttribute(name) + "</LI>");
				
			}
		}
		sb.append("</UL>");
		
		return sb.toString();
		
		
	}
	public static String getErrorMessage(HttpServletRequest request) {
		
		String msg = ServletUtility.getErrorMessage(request);
		if(!DataValidator.isNotNull(msg)) {
			msg = "<p class='st-success-header'>" + msg + "</p>";
			
		}
		
		return msg;
		
	}
	
	public static String getSubmitButten(String lable, boolean access, HttpServletRequest request) {
	
		String button = "";
		
		if(access) {
			button = "<intput type='submit' name='operation'  value='" + lable + "'>";
		}
		return button;
		
	}
	
	


}
