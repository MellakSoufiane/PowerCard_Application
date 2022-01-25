package s.prj.springboot.model;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Corporate {
	
	private String id;
	private String corporate_name;
	private String corporate_account;
	
	public String getCorporate_name() {
		return corporate_name;
	}
	public void setCorporate_name(String corporate_name) {
		this.corporate_name = corporate_name;
	}
	public String getCorporate_account() {
		return corporate_account;
	}
	public void setCorporate_account(String corporate_account) {
		this.corporate_account = corporate_account;
	}
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Corporate(String id,String corporate_name, String corporate_account) {
		super();
		this.id = id;
		this.corporate_name = corporate_name;
		this.corporate_account = corporate_account;
	}
}
