package com.sf.srs.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sf.srs.bean.Passenger;
import com.sf.srs.bean.Profile;
import com.sf.srs.bean.Reservation;
import com.sf.srs.bean.Route;






@Repository
public class Customerdao {
	@Autowired
	private SessionFactory sessionFactory;
	private Session session;
	private Transaction transaction;
	private Query<Profile>q4;
	private Query<Reservation>q5;
	private Query<Passenger>q6;
	
	public String addProfile(Profile profile) 
	{
		if(profile!=null)
		{
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			session.save(profile);
			transaction.commit();
			session.close();
			return "SUCCESS";
		}
		else if(profile==null)
		{
			return "ERROR";
		}
		else
		{
			return "FAIL";
		}
	}
	
	public String updateprofile(Profile profile)
	{
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		if(profile!=null)
		{
		session.update(profile);

		transaction.commit();

		session.close();
		return "SUCCESS";
		}
		else if(profile==null)
		{
			return "FAIL";
		}
		else
		{
			return "ERROR";
		}
	}
	
	public ArrayList<Profile> viewprofiles()
	{
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		q4=session.createQuery("from Profile");
		return (ArrayList<Profile>) q4.list();
	}
	public String deleteProfile(int userid) {
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
	System.out.println(userid);
		if(userid>=0){
		 q4 =session.createQuery("delete from Profile where userid=:uid");
			q4.setParameter("uid", userid);
			q4.executeUpdate();
			transaction.commit();
			session.close();
			return "Deleted successfully";
		}
		else {
			return "Fail";
		}
	}
	public Profile viewuserbyid(int userid) {
		System.out.println(userid);
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		Query<Profile>q1=session.createQuery("from Profile where userid=:uid");
		q4.setParameter("uid",userid);
		Profile s1=new Profile();
		
List<Profile> all= q4.getResultList();
for(Profile sp:all)
{
	s1=sp;
}
return s1;
	}

	
	
	
	
	
	public String addReservation(Reservation reservation) 
	{
		if(reservation!=null)
		{
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			session.save(reservation);
			transaction.commit();
			session.close();
			return "SUCCESS";
		}
		else if(reservation==null)
		{
			return "ERROR";
		}
		else
		{
			return "FAIL";
		}
	}
	
	public String updateprofile(Reservation reservation)
	{
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		if(reservation!=null)
		{
		session.update(reservation);

		transaction.commit();

		session.close();
		return "SUCCESS";
		}
		else if(reservation==null)
		{
			return "FAIL";
		}
		else
		{
			return "ERROR";
		}
	}
	
	public ArrayList<Reservation> viewReservations()
	{
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		q5=session.createQuery("from Reservation");
		return (ArrayList<Reservation>) q5.list();
	}
	
	public String deleteReservation(int reservationid) {
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
	System.out.println(reservationid);
		if(reservationid>=0){
		 q5 =session.createQuery("delete from Reservation where reservationid=:rid");
			q5.setParameter("rid", reservationid);
			q5.executeUpdate();
			transaction.commit();
			session.close();
			return "Deleted successfully";
		}
		else {
			return "Fail";
		}
	}
	public Reservation viewReservationbyid(int reservationid) {
		System.out.println(reservationid);
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		Query<Reservation>q1=session.createQuery("from Reservation where reservationid=:rid");
		q5.setParameter("rid",reservationid);
		Reservation s1=new Reservation();
		
List<Reservation> all= q5.getResultList();
for(Reservation sp:all)
{
	s1=sp;
}
return s1;
	}

	

	public String addPassenger(Passenger passenger) 
	{
		if(passenger!=null)
		{
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			session.save(passenger);
			transaction.commit();
			session.close();
			return "SUCCESS";
		}
		else if(passenger==null)
		{
			return "ERROR";
		}
		else
		{
			return "FAIL";
		}
	}
	public ArrayList<Passenger> viewPassengers()
	{
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		q6=session.createQuery("from Passenger");
		return (ArrayList<Passenger>) q6.list();
	}
	
	
}
	