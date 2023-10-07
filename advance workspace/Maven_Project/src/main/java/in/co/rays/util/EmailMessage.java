package in.co.rays.util;


/**
 * Contains Email Message
 * @author paras mahajan
 *
 */
public class EmailMessage {

	/**
     * Contains comma separated TO addresses
     */
	private String to = null;

    /**
     * Sender addresses
     */
	private String from = null;
	  /**
     * Contains comma separated CC addresses
     */
	private String bcc = null;
	  /**
     * Contains message subject
     */
	private String subject = null;
	  /**
     * Type of message whether it is Html or text, default is Text
     */
	private int messgaeType = TEXT_MSG;
	
	public static final int HTML_MSG = 1;
	
	public static final int TEXT_MSG = 2;

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getBcc() {
		return bcc;
	}

	public void setBcc(String bcc) {
		this.bcc = bcc;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getMessgaeType() {
		return messgaeType;
	}

	public void setMessgaeType(int messgaeType) {
		this.messgaeType = messgaeType;
	}

	public static int getHtmlMsg() {
		return HTML_MSG;
	}

	public static int getTextMsg() {
		return TEXT_MSG;
	}
	
	
	
	
	
	
}
