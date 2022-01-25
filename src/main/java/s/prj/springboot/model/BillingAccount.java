package s.prj.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BillingAccount {
	private String Debit_number;
	private String Debit_curency;
	private String Debit_code;
	public BillingAccount(String Debit_number, String Debit_curency, String Debit_code) {
		super();
		this.Debit_number = Debit_number;
		this.Debit_curency = Debit_curency;
		this.Debit_code = Debit_code;
	}
	public String getDebit_number() {
		return Debit_number;
	}
	public void setDebit_number(String Debit_number) {
		this.Debit_number = Debit_number;
	}
	public String getDebit_curency() {
		return Debit_curency;
	}
	public void setDebit_curency(String Debit_curency) {
		this.Debit_curency = Debit_curency;
	}
	public String getDebit_code() {
		return Debit_code;
	}
	public void setDebit_code(String Debit_code) {
		this.Debit_code = Debit_code;
	}
}
