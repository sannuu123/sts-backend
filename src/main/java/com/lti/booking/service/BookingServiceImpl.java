package com.lti.booking.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.booking.DAO.BookingDAO;
import com.lti.booking.pojo.Booking;
import com.lti.booking.pojo.Bus;
import com.lti.booking.pojo.Busdetails;
import com.lti.booking.pojo.Busseats;
import com.lti.booking.pojo.Customer;
import com.lti.booking.pojo.MyFeedback;
import com.lti.booking.pojo.MyProfile;
import com.lti.booking.pojo.contactus;
import com.lti.booking.pojo.signup;


@Service
@Transactional
public class BookingServiceImpl implements BookingService {
@Autowired
BookingDAO bdao;

//signup
@Override
public boolean mysignup(signup signup) 
{
	return bdao.mysignup(signup);
}
//login
@Override
public boolean validateLogin(String logid, String pass)
{
	return bdao.validateLogin(logid, pass);
}
@Override
public boolean adminvalidateLogin(String logid, String pass) {
return bdao.adminvalidateLogin(logid, pass);
}
//contact-us
@Override
public boolean mycontactus(contactus contactus) {
	
	return bdao.mycontactus(contactus);
}

//Search Bus
@Override
public boolean addBus(Bus bus) {
	return bdao.addBus(bus);
}
@Override
public List<Bus> getBus() {
	return bdao.getBus();
}
@Override
public List<Bus> searchBus( String ToFrom, String FromTo, String DateOfJourney) {
	return bdao.searchBus( ToFrom, FromTo, DateOfJourney);
}

//Customer details
     @Override
     public boolean addCustomer(Customer customer) {
	 return bdao.addCustomer(customer);
}
@Override
public List<Customer> getCustomer() {
	return bdao.getCustomer();
}

//reservation
	@Override
	public Booking addBooking(Booking booking) {
		return bdao.addBooking(booking);
	}
	@Override
	public List<Booking> getBooking() {
		return bdao.getBooking();
	}
	
//cancel
	@Override
	public boolean cancelreservation(String PnrNo) {
		return bdao.cancelreservation(PnrNo);
	}

//bus details
	@Override
	public boolean addBusdetails(Busdetails busdetails)
	{
		return  bdao.addBusdetails(busdetails);
	}
	@Override
	public List<Busdetails> getBusdetails()
	{
		return bdao.getBusdetails();
	}
	@Override
	public List<Busdetails> searchBusdetails(String fcity,String tcity,String date){
		return bdao.searchBusdetails(fcity,tcity,date);
	}
	@Override
	public Busdetails findBusdetails(String busid) 
	{
		return bdao.findBusdetails(busid);
	}
//bus seats
	@Override
	public List<Busseats> findBusseats(String busid) 
	{
		return bdao.findBusseats(busid);
	}
	@Override
	public boolean addBusseats(Busseats busseats)
	{
		return  bdao.addBusseats(busseats);
	}
	@Override
	public List<Busseats> getBusseats()
	{
		return bdao.getBusseats();
	}
	@Override
	public boolean updateBusseats(String bid, String sstatus,String sno) {
		
		return bdao.updateBusseats(bid, sstatus,sno);
	}
	
//Profile
	@Override
	public boolean addProfile(MyProfile profile) {
		return bdao.addProfile(profile);
	}
	@Override
	public List<MyProfile> getProfile() {
		return bdao.getProfile();
	}
	@Override
	public boolean updateProfile(MyProfile profile) {
		return bdao.updateProfile(profile);
	}
	@Override
	public MyProfile findProfile(String pid) {
		return bdao.findProfile(pid);
	}

//Seats
	@Override
	public boolean addFeedback(MyFeedback feedback) {
		return bdao.addFeedback(feedback);
	}

	@Override
	public List<MyFeedback> getFeedback() {
		return bdao.getFeedback();
	}
///
	@Override
	public List<signup> searchsignup(String email) {
		return bdao.searchsignup(email);
	}
	

	
	
}


