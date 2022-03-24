package com.lti.booking.DAO;

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

public interface BookingDAO {
	
	public boolean mysignup(signup signup);//Signup
	public boolean validateLogin(String logid,String pass);//Login
	public boolean adminvalidateLogin(String logid,String pass);//Admin login
	public boolean mycontactus(contactus contactus); //contactus
	
	public boolean addBus(Bus bus);
	public List<Bus> getBus();
	public List<Bus> searchBus(String ToFrom,String FromTo,String DateOfJourney);//Search Bus
	
	
	public boolean addCustomer(Customer customer);
	public List<Customer> getCustomer();  //customer details

	public Booking addBooking(Booking booking);
	public List<Booking> getBooking();  //reservation
	
	public boolean cancelreservation(String PnrNo);   //cancel

	public boolean addBusdetails(Busdetails busdetails);
	public List<Busdetails> getBusdetails();
	public Busdetails findBusdetails(String busid);      //bud details
	
	public boolean addBusseats(Busseats busseats);
	public List<Busseats> getBusseats();
	public List<Busseats> findBusseats(String busid);
	public List<Busdetails> searchBusdetails(String fcity,String tcity,String date);
	public boolean updateBusseats(String bid,String sstatus,String sno);         //seats
	
	public boolean addProfile(MyProfile profile);
	public List<MyProfile> getProfile(); 
	public boolean updateProfile(MyProfile profile);
	public MyProfile findProfile(String pid);  //profile
	
	public boolean addFeedback(MyFeedback feedback);
	public List<MyFeedback> getFeedback(); //feedback
	
	public List<signup> searchsignup(String email);
}
