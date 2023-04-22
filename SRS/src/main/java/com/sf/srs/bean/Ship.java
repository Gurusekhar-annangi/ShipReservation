package com.sf.srs.bean;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="SRS_TBL_Ship")

public class Ship {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int shipid;
	@Column
	private String shipName;
	@Column
	private String seatingCapacity;
	@Column
	private String reservationCapacity;
	public int getShipid() {
		return shipid;
	}
	public void setShipid(int shipid) {
		this.shipid = shipid;
	}
	public String getShipName() {
		return shipName;
	}
	public void setShipName(String shipName) {
		this.shipName = shipName;
	}
	public String getSeatingCapacity() {
		return seatingCapacity;
	}
	public void setSeatingCapacity(String seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}
	public String getReservationCapacity() {
		return reservationCapacity;
	}
	public void setReservationCapacity(String reservationCapacity) {
		this.reservationCapacity = reservationCapacity;
	}

}
