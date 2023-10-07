package in.co.rays.util;

import java.net.PasswordAuthentication;
import java.util.Properties;
import java.util.ResourceBundle;

import com.mysql.cj.Session;



/**
 * Email Utility provides Email Service
 * @author paras mahajan
 *
 */
public class EmailUtility {

	/**
     * Create Resource Bundle to read properties file
     */
	static ResourceBundle rb = ResourceBundle.getBundle("system");
	
	private static final String SMPT_HOST_NAME = rb.getString("smpt.server");
	
	private static final String SMPT_PORT = rb.getString("smpt.port");
	
	private static final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
	
	private static final String emailFromAddress = rb.getString("email.login");
	
	private static final String emailPassword = rb.getString("email.pwd");

	private static Properties props = new Properties();
	
	static {
		props.put("mial.smtp.host", "SMPT_HOST_NAME");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.debug", "true");
		props.put("mail.smtp.port", "SMPT_PORT");
		props.put("mail.smtp.socketFactory.port", "SMTP_PORT");
		props.put("mail.smtp.socketFactory.class", "SSL_FACTORY");
		props.put("mail.smtp.socketFactory.fallback", "false");
		
	}
	
	public static void sendMail(EmailMessage emailMessageDTO)throws ApplicationException{
		try {
		
	           Session session = Session.getDefaultInstance(props, new javax.mail.Authenticaticator(){
	        	   
	        	  protected PasswordAuthentication getPasswordAuthentication() {
	        		  
	        		  return new PasswordAuthentication(emailFromAddress, emailPassword);
	        	  }
	           }); 	
	                 session.setDebug(true);       	   
	        	   
	                 Message msg = new MimeMessage(session);
	                 
	                 InternetAddress addressForm = new InternetAddress(emailFromAddress);
	                 msg.setForm(addressFrom);
	                 
	                 
	                 String[] emailIds = new String[0];
	                 
	                 if(emailMessageDTO.getTo() != null) {
	                	 emailIds = emailMessageDTO.getTo().split(",");
	                 }
	                 
	                 String[] emailIdsCc = new String[0];

	                 if (emailMessageDTO.getCc() != null) {
	                     emailIdsCc = emailMessageDTO.getCc().split(",");
	                 }
	                 
	                 String[] emailIdsBcc = new String[0];
	                 
	                 if(emailMessageDTO.getBcc() != null) {
	                	 emailIdsBcc = emailMessageDTO.getBcc().split(",");
	                	 
	                 }
	                 
	                 InternetAddress[] addressTo = new InternetAddress[emailIds.length];
	                 
	                 for (int i = 0; i < emailIds.length; i++) {
	                	addressTo[i] = new InternetAddress(emailIds[i]);
	                
	                 }
	                 InternetAddress[] addressCc = new InternetAddress[emailIdsCc.length];
	                 
	                 for (int i = 0; i < emailIdsCc.length; i++) {
	                	 addressCc[i] = new InternetAddres(emailIdsCc[i]);
	                	 
					}
	                 InternetAddress[] addressBcc = new InternetAddress[emailIdsBcc.length];
	                 
	                 for (int i = 0; i < emailIdsBcc.length; i++) {
	                	 addressBcc[i] = new InternetAddress(emailIdsBcc[i]);
	                	 
					}
	                 if (addressTo.length > 0) {
	                	 msg.setRecipients(Message.RecipientType.To, addressTo);
	                 }
	                 
	                 if (addressCc.length > 0) {
	                	 msg.setRecipient(Message.RecipientType.CC,addressCc);
	                 }
	                 if (addressBcc.length > 0) {
	                	 msg.setRecipients(Message.RecipientType.BCC, addressBcc);
	                 }
	                 
	                 msg.setSubject(emailMessageDTO.getSubject());
	                 
	                 switch (emailMessageDTO.getMessgaeType()) {
	                 case EmailMessage.HTML_MSG;
	                   msg.setContent(emailMessageDTO.getMessage(), "text/html");
	                   break;
	                 case EmailMessage.TEXT_MSG;
	                  msg.setContent(emailMessageDTO.getMessage(), "text/plain");
	                  break;
	                  
	}
	
	                   Transport.send(msg);
	                   
	}    catch(Exception ex) {
		ex.printStackTrace();
		throw new ApplicationException("Email " + ex.getMessage());
	}
	                   
}
}
