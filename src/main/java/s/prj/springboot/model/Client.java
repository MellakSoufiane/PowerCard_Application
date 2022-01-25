package s.prj.springboot.model;

import java.util.Date;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Client {
	@Id
	private int id;
	private String gender;
	private String title;
	private String family_status;
	private String first_name;
	private String family_name;
	private String maiden_name;	
	private Date date_birth;
	private String document;
	private String legal_identification;
	private String language_code;
	private String nationality;
	private String vip;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFamily_status() {
		return family_status;
	}
	public void setFamily_status(String family_status) {
		this.family_status = family_status;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getFamily_name() {
		return family_name;
	}
	public void setFamily_name(String family_name) {
		this.family_name = family_name;
	}
	public String getMaiden_name() {
		return maiden_name;
	}
	public void setMaiden_name(String maiden_name) {
		this.maiden_name = maiden_name;
	}
	public Date getDate_birth() {
		return date_birth;
	}
	public void setDate_birth(Date date_birth) {
		this.date_birth = date_birth;
	}
	public String getDocument() {
		return document;
	}
	public void setDocument(String document) {
		this.document = document;
	}
	public String getLegal_identification() {
		return legal_identification;
	}
	public void setLegal_identification(String legal_identification) {
		this.legal_identification = legal_identification;
	}
	public String getLanguage_code() {
		return language_code;
	}
	public void setLanguage_code(String language_code) {
		this.language_code = language_code;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getVip() {
		return vip;
	}
	public void setVip(String vip) {
		this.vip = vip;
	}
	public Client(int id, String gender, String title, String family_status, String first_name, String family_name,
			String maiden_name, Date date_birth, String document, String legal_identification, String language_code,
			String nationality, String vip) {
		super();
		this.id = id;
		this.gender = gender;
		this.title = title;
		this.family_status = family_status;
		this.first_name = first_name;
		this.family_name = family_name;
		this.maiden_name = maiden_name;
		this.date_birth = date_birth;
		this.document = document;
		this.legal_identification = legal_identification;
		this.language_code = language_code;
		this.nationality = nationality;
		this.vip = vip;
	}
	
	
		
	
	
	
}
