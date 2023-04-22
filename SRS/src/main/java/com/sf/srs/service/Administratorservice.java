package com.sf.srs.service;

import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sf.srs.bean.Credentials;
import com.sf.srs.bean.Route;
import com.sf.srs.bean.Schedule;
import com.sf.srs.bean.Ship;
import com.sf.srs.dao.Administratordao;

@Service
public   class Administratorservice  {
	@Autowired
	private Administratordao adao;
	public boolean authenticate(Credentials user) 
	{
	return  adao.authenticate(user);
	}
	
	
	
	
	
	
	
	
	public String addShip(Ship ship)
	{
		return
	adao.addShip(ship);
	}
	public ArrayList<Ship>
	viewShip()
	{
		return adao.viewShips();
	}
	public String
	updateShip(Ship ship)
	{
		return
				adao.updateShip(ship);
	}
	
	
	public Ship viewShipbyid(int shipid) {
		return adao.viewshipbyid(shipid);
	}
	public String deleteShip(int shipid) {
		return adao.deleteship(shipid);
	}
	public Ship updateShipbyid(int shipid) {
		return adao.updateShipbyid(shipid);
	}
	
	
	
	
	
	public String addSchedule(Schedule schedule)
	{
		return
	adao.addSchedule(schedule);
	}
	public ArrayList<Schedule>
	viewSchedule()
	{
		return adao.viewSchedules();
	}
	public String
	updateSchedule(Schedule schedule)
	{
		return
				adao.updatedschedule(schedule);
	}
	public Schedule viewSchedulebyid(int scheduleid) {
		return adao.viewschedulebyid(scheduleid);
	}
	public String deleteSchedule(int scheduleid) {
		return adao.deleteschedule(scheduleid);
	}
	
	
	
	
	
	public String addRoute(Route route)
	{
		return
	adao.addRoute(route);
	}
	public ArrayList<Route>
	viewRoute()
	{
		return adao.viewRoutes();
	}
	public String
	updateRoute(Route route)
	{
		return
				adao.updateRoute(route);
	}
	public Route viewRoutebyid(int routeid) {
		return adao.viewroutebyid(routeid);
	}
	public String deleteRoute(int routeid) {
		return adao.deleteroute(routeid);
	}
	}