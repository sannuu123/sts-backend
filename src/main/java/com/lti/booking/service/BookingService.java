package com.lti.booking.service;

import java.util.List;

import com.lti.booking.pojo.Booking;
import com.lti.booking.pojo.Bus;
import com.lti.booking.pojo.Busdetails;
import com.lti.booking.pojo.Busseats;
import com.lti.booking.pojo.Customer;
import com.lti.booking.pojo.MyFeedback;
import com.lti.booking.pojo.MyProfile;
import com.lti.booking.pojo.contactus;
import com.lti.booking.pojo.signup;

public interface BookingService {
	
	public boolean mysignup(signup signup);	//signup
	public boolean validateLogin(String logid,String pass);//Login
	public boolean adminvalidateLogin(String logid,String pass);//admin login
	public boolean mycontactus(contactus contactus);//contact-us
	
	public boolean addBus(Bus bus);
	public List<Bus> getBus();
	public List<Bus> searchBus(String ToFrom,String FromTo,String DateOfJourney);//SearchBus

	
	public boolean addCustomer(Customer customer);
	public List<Customer> getCustomer(); //customer details
	
	
	public Booking addBooking(Booking booking);
	public List<Booking> getBooking();  //reservation
	
	
	public boolean cancelreservation(String PnrNo);  //cancel

	
	public boolean addBusdetails(Busdetails busdetails);
	public List<Busdetails> getBusdetails();
	public List<Busdetails> searchBusdetails(String fcity,String tcity,String date);
	public Busdetails findBusdetails(String busid);//Bus Details
	
	
	public List<Busseats> findBusseats(String busid);
	public boolean addBusseats(Busseats busseats);
	public List<Busseats> getBusseats(); 
	public boolean updateBusseats(String bid,String sstatus,String sno); //seats
	
	
	public boolean addProfile(MyProfile profile);
	public List<MyProfile> getProfile();
	public boolean updateProfile(MyProfile profile);
	public MyProfile findProfile(String pid);        //Profile
	
	
	public boolean addFeedback(MyFeedback feedback);
	public List<MyFeedback> getFeedback(); //Feedback
	
	public List<signup> searchsignup(String email);

}
