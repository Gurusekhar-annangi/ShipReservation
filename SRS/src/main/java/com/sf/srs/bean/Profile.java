package com.sf.srs.bean;



import jakarta.persistence.CascadeType;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="SRS_TBL_User_Profile")

public class Profile {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="userId",referencedColumnName="userId")
	private Credentials credentials;
	@Column
	private String firstname;
	@Column
	private String lasrtname;
	@Column
	private String dateOfBirth;
	@Column
	private String gender;
	@Column
	private String street;
	@Column
	private String location;
	@Column
	private String city;
	@Column
	private String  state;
	@Column
	private String pincode;
	@Column
	private String mobileNo;
	@Column
	private String emailId;
	
	public Credentials getCredentials() {
		return credentials;
	}
	public void setCredentials(Credentials credentials) {
		this.credentials = credentials;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLasrtname() {
		return lasrtname;
	}
	public void setLasrtname(String lasrtname) {
		this.lasrtname = lasrtname;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	

}
