package com.sf.srs.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="SRS_TBL-CreditCard")
public class CreditCard {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int CreditCardNumber;
	@Column
	private String ValidForm;
	@Column
	private String ValidTo;
	@Column
	private String Balance;
	@Column
	private String Userid;
	public int getCreditCardNumber() {
		return CreditCardNumber;
	}
	public void setCreditCardNumber(int creditCardNumber) {
		CreditCardNumber = creditCardNumber;
	}
	public String getValidForm() {
		return ValidForm;
	}
	public void setValidForm(String validForm) {
		ValidForm = validForm;
	}
	public String getValidTo() {
		return ValidTo;
	}
	public void setValidTo(String validTo) {
		ValidTo = validTo;
	}
	public String getBalance() {
		return Balance;
	}
	public void setBalance(String balance) {
		Balance = balance;
	}
	public String getUserid() {
		return Userid;
	}
	public void setUserid(String userid) {
		Userid = userid;
	}
	

}
