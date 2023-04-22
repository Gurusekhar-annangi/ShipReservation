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
@Table(name="SRS_TBL_Schedule")
public class Schedule {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int scheduleid;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="routeid",referencedColumnName="routeid")
	private Route route;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="shipid",referencedColumnName="shipid")
	private Ship ship;
	@Column
	private String startDate;
	
	
	public int getScheduleid() {
		return scheduleid;
	}
	public void setScheduleid(int scheduleid) {
		this.scheduleid = scheduleid;
	}
	public Route getRoute() {
		return route;
	}
	public void setRoute(Route route) {
		this.route = route;
	}
	public Ship getShip() {
		return ship;
	}
	public void setShip(Ship ship) {
		this.ship = ship;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	
	

}
