package s.prj.springboot.model;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Card {
	
	 
	  private int id;
	
	private String bank;
	private String branch;
	private String card_product_code;
	private String basic_card;
	private ShadowAccount shadowaccount;
	private BillingAccount billingaccount;
	private Corporate corporate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getCard_product_code() {
		return card_product_code;
	}
	public void setCard_product_code(String card_product_code) {
		this.card_product_code = card_product_code;
	}
	public String getBasic_card() {
		return basic_card;
	}
	public void setBasic_card(String basic_card) {
		this.basic_card = basic_card;
	}
	public ShadowAccount getShadowaccount() {
		return shadowaccount;
	}
	public void setShadowaccount(ShadowAccount shadowaccount) {
		this.shadowaccount = shadowaccount;
	}
	public BillingAccount getBillingaccount() {
		return billingaccount;
	}
	public void setBillingaccount(BillingAccount billingaccount) {
		this.billingaccount = billingaccount;
	}
	public Corporate getCorporate() {
		return corporate;
	}
	public void setCorporate(Corporate corporate) {
		this.corporate = corporate;
	}
	public Card(int id, String bank, String branch, String card_product_code, String basic_card,
			ShadowAccount shadowaccount, BillingAccount billingaccount, Corporate corporate) {
		super();
		this.id = id;
		this.bank = bank;
		this.branch = branch;
		this.card_product_code = card_product_code;
		this.basic_card = basic_card;
		this.shadowaccount = shadowaccount;
		this.billingaccount = billingaccount;
		this.corporate = corporate;
	}
	
	
	
	
	
}
