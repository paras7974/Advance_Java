package in.co.rays.bean;

import java.io.Serializable;
import java.sql.Timestamp;

public abstract class BaseBean implements Comparable<BaseBean>, Serializable, DropdownListBean {
	
	protected long id;
	protected String createdby;
	protected String modifiedBy;
	protected Timestamp created_DateTime;
	protected Timestamp modified_DateTime;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCreatedby() {
		return createdby;
	}
	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public Timestamp getCreated_DateTime() {
		return getCreated_DateTime();
	}
	public void setCreate_DateTime(Timestamp createDateBy) {
		this.created_DateTime = created_DateTime;
	}
	public Timestamp getModified_DateTime() {
		return created_DateTime;
	}
	public void setModified_DateTime(Timestamp modifiedDateBy) {
		this.created_DateTime = modified_DateTime;
	}
	

}
