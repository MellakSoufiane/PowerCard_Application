package s.prj.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Adress {
	public Adress(String type, String send_mode, String line1, String line2, String line3, String line4,
			String phone_type, String phone, String country, String state, String city, String zip_code) {
		super();
		this.type = type;
		this.send_mode = send_mode;
		this.line1 = line1;
		
		this.phone_type = phone_type;
		this.phone = phone;
		this.country = country;
		this.state = state;
		this.city = city;
		this.zip_code = zip_code;
	}
	
	public String getSend_mode() {
		return send_mode;
	}
	public void setSend_mode(String send_mode) {
		this.send_mode = send_mode;
	}
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	public String getLine3() {
		return line3;
	}
	public void setLine3(String line3) {
		this.line3 = line3;
	}
	public String getLine4() {
		return line4;
	}
	public void setLine4(String line4) {
		this.line4 = line4;
	}
	public String getPhone_type() {
		return phone_type;
	}
	public void setPhone_type(String phone_type) {
		this.phone_type = phone_type;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZip_code() {
		return zip_code;
	}
	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}
	public String getType_adress() {
		return type;
	}
	public void setType_adress(String type_adress) {
		this.type = type_adress;
	}
	private String type;
	private String send_mode;
	private String line1;
	private String line2;
	private String line3;
	private String line4;
	private String phone_type;
	private String phone;
	private String country;
	private String state;
	private String city;
	private String zip_code;
	
}
