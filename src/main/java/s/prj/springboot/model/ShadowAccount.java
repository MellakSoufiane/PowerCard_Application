package s.prj.springboot.model;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class ShadowAccount {
	
	  private String id;
	 
	  private String credit_limit;
	  private String cash_limit;
	  private String loan_limit;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getCredit_limit() {
		return credit_limit;
	}
	public void setCredit_limit(String credit_limit) {
		this.credit_limit = credit_limit;
	}
	public String getCash_limit() {
		return cash_limit;
	}
	public void setCash_limit(String cash_limit) {
		this.cash_limit = cash_limit;
	}
	public String getLoan_limit() {
		return loan_limit;
	}
	public void setLoan_limit(String loan_limit) {
		this.loan_limit = loan_limit;
	}
	public ShadowAccount( String credit_limit, String cash_limit, String loan_limit) {
		super();

		
		this.credit_limit = credit_limit;
		this.cash_limit = cash_limit;
		this.loan_limit = loan_limit;
	}



}