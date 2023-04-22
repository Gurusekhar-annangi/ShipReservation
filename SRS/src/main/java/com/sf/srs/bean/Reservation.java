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
@Table(name="SRS_TBL_Reservation")
public class Reservation {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int reservationId;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="scheduleid",referencedColumnName="scheduleid")
	private Schedule schedule;

	@ManyToOne (cascade = CascadeType.ALL)
	@JoinColumn(name="userid",referencedColumnName="userid")
	private Credentials credentials;
	@Column
	private String bookingDate;
	@Column
	private String journeyDate;
	@Column
	private String noOfSeats;
	@Column
	private String totalefare;
	@Column
	private String bookingStatus;
	
		
	public Schedule getSchedule() {
		return schedule;
	}
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	public Credentials getCredentials() {
		return credentials;
	}
	public void setCredentials(Credentials credentials) {
		this.credentials = credentials;
	}
	public int getReservationId() {
		return reservationId;
	}
	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
	}
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	public String getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(String journeyDate) {
		this.journeyDate = journeyDate;
	}
	public String getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(String noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public String getTotalefare() {
		return totalefare;
	}
	public void setTotalefare(String totalefare) {
		this.totalefare = totalefare;
	}
	public String getBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
	
	

}
