package com.cognizant.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Manager {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="MANAGER_ID")
	private String manager_id;
	@Column(name="MANAGER_FIRST_NAME")
	private String manager_first_name;
	@Column(name="MANANGER_LAST_NAME")
	private String manager_last_name;
	@Column(name="MANAGER_AGE")
	private int manager_age;
	@Column(name="MANAGER_GENDER")
	private String manager_gender;
	@Column(name="MANAGER_DOB")
	private String manager_dob;
	@Column(name="MANAGER_CONTACT_NO")
	private String manager_contact_no;
	@Column(name="MANAGER_ALT_CONTACT_NO")
	private String manager_alt_contact_no;
	
	@Column(name="MANAGER_EMAIL_ID")
	private String manager_email_id;
	@Column(name="MANAGER_PASSWORD")
	private String manager_password;
	
	public String getManager_id() {
		return manager_id;
	}
	public void setManager_id(String manager_id) {
		this.manager_id = manager_id;
	}
	public String getManager_first_name() {
		return manager_first_name;
	}
	public void setManager_first_name(String manager_first_name) {
		this.manager_first_name = manager_first_name;
	}
	public String getManager_last_name() {
		return manager_last_name;
	}
	public void setManager_last_name(String manager_last_name) {
		this.manager_last_name = manager_last_name;
	}
	public int getManager_age() {
		return manager_age;
	}
	public void setManager_age(int manager_age) {
		this.manager_age = manager_age;
	}
	public String getManager_gender() {
		return manager_gender;
	}
	public void setManager_gender(String manager_gender) {
		this.manager_gender = manager_gender;
	}
	public String getManager_dob() {
		return manager_dob;
	}
	public void setManager_dob(String manager_dob) {
		this.manager_dob = manager_dob;
	}
	public String getManager_contact_no() {
		return manager_contact_no;
	}
	public void setManager_contact_no(String manager_contact_no) {
		this.manager_contact_no = manager_contact_no;
	}
	public String getManager_alt_contact_no() {
		return manager_alt_contact_no;
	}
	public void setManager_alt_contact_no(String manager_alt_contact_no) {
		this.manager_alt_contact_no = manager_alt_contact_no;
	}
	public String getManager_email_id() {
		return manager_email_id;
	}
	public void setManager_email_id(String manager_email_id) {
		this.manager_email_id = manager_email_id;
	}
	public String getManager_password() {
		return manager_password;
	}
	public void setManager_password(String manager_password) {
		this.manager_password = manager_password;
	}
	@Override
	public String toString() {
		return "Manager [manager_id=" + manager_id + ", manager_first_name=" + manager_first_name
				+ ", manager_last_name=" + manager_last_name + ", manager_age=" + manager_age + ", manager_gender="
				+ manager_gender + ", manager_dob=" + manager_dob + ", manager_contact_no=" + manager_contact_no
				+ ", manager_alt_contact_no=" + manager_alt_contact_no + ", manager_email_id=" + manager_email_id
				+ ", manager_password=" + manager_password + "]";
	}
	
	
}
