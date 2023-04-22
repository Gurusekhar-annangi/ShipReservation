package com.sf.srs.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sf.srs.bean.Credentials;
import com.sf.srs.bean.Route;
import com.sf.srs.bean.Schedule;
import com.sf.srs.bean.Ship;
import com.sf.srs.service.Administratorservice;



@RestController
@CrossOrigin(origins = "http://localhost:3000/")
@RequestMapping("/admin")
public class Administratorcontroller {
	@Autowired
	private Administratorservice adserv;
	@GetMapping("/selectuser/{userid}/{password}")
	@ResponseBody
	public boolean auth(@PathVariable String userid,@PathVariable String password)
{
	
		Credentials cb=new Credentials();
		cb.setUserid(userid);
		cb.setPassword(password);
		System.out.println(adserv.authenticate(cb));;
		return adserv.authenticate(cb);
	}
	
	
	
	
	
	
	
@PostMapping("/addship")
public String add(@RequestBody Ship eb)
{
	adserv.addShip(eb);
	return "<h1>Ship Added Successfully</h1>";
}
@GetMapping("/viewship")
public List<Ship> viewall()
{
	
	return adserv.viewShip();
}
@PutMapping("/updateship")
public String update(@RequestBody Ship eb)
{
	adserv.updateShip(eb);
	return "<h1>Ship Updated successfully</h1>";
}
@GetMapping("/Ship/{id}")
public Ship method(@PathVariable("id")int shipid) {
	return adserv.viewShipbyid(shipid);
}
@DeleteMapping("/delete/{id}")
public String meth2(@PathVariable("id")int shipid) {
	return adserv.deleteShip(shipid);
}
@PutMapping("/updateship/{id}")
public Ship method8(@PathVariable("id")int shipid) {
	return adserv.viewShipbyid(shipid);
	
}






@PostMapping("/addSchedule")
public String add(@RequestBody Schedule eb)
{
	adserv.addSchedule(eb);
	return "<h1>Schedule Added Successfully</h1>";
}
@GetMapping("/AllSchedule")
public List<Schedule> viewallschedule()
{
	
	return adserv.viewSchedule();
}
@PutMapping("/updateSchedule")
public String update(@RequestBody Schedule eb)
{
	adserv.updateSchedule(eb);
	return "<h1>Schedule Updated successfully</h1>";
}
@GetMapping("/Schedule/{id}")
public Schedule method1(@PathVariable("id")int scheduleid) {
	return adserv.viewSchedulebyid(scheduleid);
}
@DeleteMapping("/deletes/{id}")
public String meth3(@PathVariable("id")int scheduleid) {
	return adserv.deleteSchedule(scheduleid);
}




@PostMapping("/addRoute")
public String add(@RequestBody Route eb)
{
	adserv.addRoute(eb);
	return "<h1>Route Added Successfully</h1>";
}
@GetMapping("/AllRoute")
public List<Route> viewallRoutes()
{
	
	return adserv.viewRoute();
}
@PutMapping("/updateRoute")
public String update(@RequestBody Route eb)
{
	adserv.updateRoute(eb);
	return "<h1>Route Updated successfully</h1>";
}
@GetMapping("/Route/{id}")
public Route method2(@PathVariable("id")int routeid) {
	return adserv.viewRoutebyid(routeid);
}
@DeleteMapping("/deleter/{id}")
public String meth4(@PathVariable("id")int routeid) {
	return adserv.deleteRoute(routeid);
}
}

