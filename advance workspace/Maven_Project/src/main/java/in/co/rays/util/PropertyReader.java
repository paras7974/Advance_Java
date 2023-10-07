package in.co.rays.util;

import java.util.ResourceBundle;

/**
 * @author paras mahajan
 *
 */
public class PropertyReader {

	private static ResourceBundle rb = ResourceBundle.getBundle("system");
	
	public static String getValue(String key) {
		
		String val = null;
		
		try {
			
		
		val = rb.getString(key);
		
		val = key;
		
		}catch (Exception e) {
			val = key;
		}
		return val;
		
	}
	
	public static String getValue(String key, String param) {
	
		String msg = getValue(key);
		msg = msg.replace("{0}", param);
		
		return msg;
		
	}
	
	public static String getValue(String key, String[] param) {
		
		String msg = getValue(key);
		
		for (int i = 0; i < param.length; i++) {
			msg = msg.replace("{" + i + "}", param[i]);
			
			
		}
		
		return msg;
		
	}
	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("system");
		System.out.println(rb.getString("url"));
	}
	
	
}
