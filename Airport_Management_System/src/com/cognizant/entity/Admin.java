package com.cognizant.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
	@Table(name="Admin")
	public class Admin {
		@Id 
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name="Admin_id")
		private String id;
		@Column(name="Admin_first_name")
		private String fname;
		@Override
		public String toString() {
			return "Admin [id=" + id + ", fname=" + fname + ", lname=" + lname + ", age=" + age + ", gender=" + gender
					+ ", dob=" + dob + ", number=" + number + ", altnumber=" + altnumber + ", email=" + email
					+ ", password=" + password + "]";
		}

		@Column(name="Admin_last_name")
		private String lname;
		@Column(name="Admin_age")
		private int age;
		@Column(name="Admin_gender")
		private String gender;
		@Column(name="Admin_dob")
		private String dob;
		@Column(name="Admin_contact_no")
		private long number;
		@Column(name="Admin_alt_contact_no")
		private long altnumber;
		@Column(name="Admin_email_id")
		private String email;
		@Column(name="Admin_password")
		private String password;
		
		public Admin(){}

		

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getFname() {
			return fname;
		}

		public void setFname(String fname) {
			this.fname = fname;
		}

		public String getLname() {
			return lname;
		}

		public void setLname(String lname) {
			this.lname = lname;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getDob() {
			return dob;
		}

		public void setDob(String dob) {
			this.dob = dob;
		}

		public long getNumber() {
			return number;
		}

		public void setNumber(long number) {
			this.number = number;
		}

		public long getAltnumber() {
			return altnumber;
		}

		public void setAltnumber(long altnumber) {
			this.altnumber = altnumber;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
		
		
		

}
