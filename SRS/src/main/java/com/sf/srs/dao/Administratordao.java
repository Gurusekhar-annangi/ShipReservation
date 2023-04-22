package com.sf.srs.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sf.srs.bean.Credentials;
import com.sf.srs.bean.Route;
import com.sf.srs.bean.Schedule;
import com.sf.srs.bean.Ship;




@Repository
public class Administratordao {
	@Autowired
	private SessionFactory sessionFactory;
	private Session session;
	private Transaction transaction;
	private Query<Ship>q;
	private Query<Schedule>q1;
	private Query<Route>q2;
	 
	
	
	public boolean authenticate(Credentials user) 
	{
		System.out.println("Under Dao "+user.getUserid()+" "+user.getPassword());
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		Query q7=session.createQuery("from Credentials where userid=:uid and password=:pss");
		q7.setParameter("uid", user.getUserid());
		q7.setParameter("pss", user.getPassword());
		ArrayList<Credentials> al=(ArrayList<Credentials>) q7.getResultList();
		int count=0;
		for(Credentials cb:al)
		{
			
			if((cb.getUserid().equals(user.getUserid()))&&(cb.getPassword().equals(user.getPassword())))
			{
				System.out.println("Record is  present"+cb.getUserid()+" "+cb.getPassword());
				count++;
				if(count>0)
				{
		return true;
				}
				else
				{
					return false;
				}
			}
		}
		return false;
		
	}
	
	
	
	
	public String addShip(Ship ship) 
	{
		if(ship!=null)
		{
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			session.save(ship);
			transaction.commit();
			session.close();
			return "SUCCESS";
		}
		else if(ship==null)
		{
			return "ERROR";
		}
		else
		{
			return "FAIL";
		}
	}
	
	public String updateShip(Ship ship)
	{
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		if(ship!=null)
		{
		session.update(ship);

		transaction.commit();

		session.close();
		return "SUCCESS";
		}
		else if(ship==null)
		{
			return "FAIL";
		}
		else
		{
			return "ERROR";
		}
	}
	
	public ArrayList<Ship> viewShips()
	{
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		q=session.createQuery("from Ship");
		return (ArrayList<Ship>) q.list();
	}
	public String deleteship(int shipid) {
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
	System.out.println(shipid);
		if(shipid>=0){
		 q =session.createQuery("delete from Ship where shipid=:sid");
			q.setParameter("sid", shipid);
			q.executeUpdate();
			transaction.commit();
			session.close();
			return "Deleted successfully";
		}
		else {
			return "Fail";
		}
	}
	public Ship viewshipbyid(int shipid) {
		System.out.println(shipid);
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		Query<Ship>q=session.createQuery("from Ship where shipid=:sid");
		q.setParameter("sid",shipid);
		Ship s1=new Ship();
		
List<Ship> all= q.getResultList();
for(Ship sp:all)
{
	s1=sp;
}
return s1;
	}
	public Ship updateShipbyid(int shipid) {
		System.out.println(shipid);
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		Query<Ship>q=session.createQuery("from Ship where shipid=:sid");
		q.setParameter("sid",shipid);
		Ship s1=new Ship();
		
List<Ship> all= q.getResultList();
for(Ship sp:all)
{
	s1=sp;
}
return s1;
	}
	
	
	
	
	
	
	public String addSchedule(Schedule schedule) 
	{
		if(schedule!=null)
		{
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			session.save(schedule);
			transaction.commit();
			session.close();
			return "SUCCESS";
		}
		else if(schedule==null)
		{
			return "ERROR";
		}
		else
		{
			return "FAIL";
		}
	}
	
	public String updatedschedule(Schedule schedule) {
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		if(schedule!=null) {
			session.update(schedule);
			transaction.commit();
			session.close();
			return "updated succesfully";
		}
		else if(schedule==null) {
			return "Fail";
		}
		else {
			return "Error";
		}
	}
	public ArrayList<Schedule> viewSchedules()
	{
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		q1=session.createQuery("from Schedule");
		return (ArrayList<Schedule>) q1.list();
	}
	public String deleteschedule(int scheduleid) {
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
	System.out.println(scheduleid);
		if(scheduleid>=0){
		 q1 =session.createQuery("delete from Schedule where scheduleid=:sid");
			q1.setParameter("sid", scheduleid);
			q1.executeUpdate();
			transaction.commit();
			session.close();
			return "Deleted successfully";
		}
		else {
			return "Fail";
		}
	}
	public Schedule viewschedulebyid(int scheduleid) {
		System.out.println(scheduleid);
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		Query<Schedule>q1=session.createQuery("from Schedule where scheduleid=:sid");
		q1.setParameter("sid",scheduleid);
		Schedule s1=new Schedule();
		
List<Schedule> all= q1.getResultList();
for(Schedule sp:all)
{
	s1=sp;
}
return s1;
	}
	
	
	
	
	
	
	
	
	
	public String addRoute(Route route) 
	{
		if(route!=null)
		{
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			session.save(route);
			transaction.commit();
			session.close();
			return "SUCCESS";
		}
		else if(route==null)
		{
			return "ERROR";
		}
		else
		{
			return "FAIL";
		}
	}
	
	public String updateRoute(Route route)
	{
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		if(route!=null)
		{
		session.update(route);

		transaction.commit();

		session.close();
		return "SUCCESS";
		}
		else if(route==null)
		{
			return "FAIL";
		}
		else
		{
			return "ERROR";
		}
	}
	
	public ArrayList<Route> viewRoutes()
	{
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		q2=session.createQuery("from Route");
		return (ArrayList<Route>) q2.list();
	}
	public String deleteroute(int routeid) {
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
	System.out.println(routeid);
		if(routeid>=0){
		 q2 =session.createQuery("delete from Route where routeid=:sid");
			q2.setParameter("sid", routeid);
			q2.executeUpdate();
			transaction.commit();
			session.close();
			return "Deleted successfully";
		}
		else {
			return "Fail";
		}
	}
	public Route viewroutebyid(int routeid) {
		System.out.println(routeid);
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		Query<Route>q1=session.createQuery("from Route where routeid=:rid");
		q2.setParameter("rid",routeid);
		Route s1=new Route();
		
List<Route> all= q2.getResultList();
for(Route sp:all)
{
	s1=sp;
}
return s1;
	}
}
	
	


