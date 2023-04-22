package com.sf.srs.service;

import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sf.srs.bean.Passenger;
import com.sf.srs.bean.Profile;
import com.sf.srs.bean.Reservation;
import com.sf.srs.bean.Schedule;
import com.sf.srs.dao.Customerdao;

@Service
public   class Customerservice  {
	@Autowired
	private Customerdao cdao;
	public String addProfile(Profile profile)
	{
		return
	cdao.addProfile(profile);
	}
	public ArrayList<Profile>
	viewProfile()
	{
		return cdao.viewprofiles();
	}
	public String
	updateProfile(Profile Profile)
	{
		return
				cdao.updateprofile(Profile);
	}
	public Profile viewuserbyid(int userid) {
		return cdao.viewuserbyid(userid);
	}
	public String deleteProfile(int userid) {
		return cdao.deleteProfile(userid);
	}
	
	
	
	public String addReservation(Reservation reservation)
	{
		return
	cdao.addReservation(reservation);
	}
	public ArrayList<Reservation>
	viewReservation()
	{
		return cdao.viewReservations();
	}
	public String
	updateReservation(Reservation reservation)
	{
		return
				cdao.updateprofile(reservation);
	}
	public Reservation viewReservationbyid(int reservationid) {
		return cdao.viewReservationbyid(reservationid);
	}
	public String deleteReservation(int reservationid) {
		return cdao.deleteReservation(reservationid);
	}
	
	
	public String addPassenger(Passenger passenger)
	{
		return
	cdao.addPassenger(passenger);
	}
	public ArrayList<Passenger>
	viewPassenger()
	{
		return cdao.viewPassengers();
	}
}