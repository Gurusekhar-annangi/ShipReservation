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
@Table(name="SRS_TBL_Route")
public class Route {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int routeid;
	@Column
	private String source;
	@Column
	private String destination;
	@Column
	
	private String travelDuration;
	@Column
	private String fare;
	@ManyToOne(cascade =CascadeType.ALL)
	@JoinColumn(name="shipid",referencedColumnName="shipid")
	private Ship Ship;
	public int getRouteid() {
		return routeid;
	}
	public void setRouteid(int routeid) {
		this.routeid = routeid;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getTravelDuration() {
		return travelDuration;
	}
	public void setTravelDuration(String travelDuration) {
		this.travelDuration = travelDuration;
	}
	public String getFare() {
		return fare;
	}
	public void setFare(String fare) {
		this.fare = fare;
	}
	public Ship getShip() {
		return Ship;
	}
	public void setShip(Ship ship) {
		Ship = ship;
	}
	}
