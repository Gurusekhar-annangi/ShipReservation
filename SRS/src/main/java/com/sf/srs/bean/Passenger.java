package com.sf.srs.bean;

import jakarta.persistence.CascadeType;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="SRS_TBL-Passenger")

public class Passenger {
	@Id
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="reservationid",referencedColumnName="reservationid")
	private Reservation reservation;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name= "scheduleid",referencedColumnName="scheduleid")
	private Schedule schedule;
	
	@Column
	private String name;
	@Column
	private String age;
	@Column
	private String gender;
	
	
	public Reservation getReservation() {
		return reservation;
	}
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	public Schedule getSchedule() {
		return schedule;
	}
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	

}
