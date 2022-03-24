package com.lti.booking.controller;

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
import org.springframework.web.bind.annotation.RestController;

import com.lti.booking.pojo.Booking;
import com.lti.booking.pojo.Bus;
import com.lti.booking.pojo.Busdetails;
import com.lti.booking.pojo.Busseats;
import com.lti.booking.pojo.Customer;
import com.lti.booking.pojo.MyFeedback;
import com.lti.booking.pojo.MyProfile;
import com.lti.booking.pojo.contactus;
import com.lti.booking.pojo.signup;
import com.lti.booking.service.BookingService;


@RestController
@RequestMapping("/rest/api/")
//@CrossOrigin("http://localhost:4200")
public class BookingController {
	@Autowired
	BookingService aService;

///signup
	@PostMapping("/signup")
	public boolean mysignup(@RequestBody signup signup)
	{
		return aService.mysignup(signup);
	}
//login
	@GetMapping("/validatelogin/{logid}/{passwd}") 
	public boolean validateLogin(@PathVariable("logid") String id,@PathVariable("passwd") String pass)
	{
			return aService.validateLogin(id, pass);
	}
//admin login
		@GetMapping("/adminvalidatelogin/{logid}/{passwd}")
		public boolean adminvalidateLogin(@PathVariable("logid") String id,@PathVariable("passwd") String pass)
		{
		return aService.adminvalidateLogin(id, pass);
		}
//contact-us
		@PostMapping("/contactus")
		public boolean mycontactus(@RequestBody contactus contactus) 
		{
			return aService.mycontactus(contactus);
			
		}
		
//search Bus
	@GetMapping("/bus")
	public List<Bus> getBus()
	{
		return aService.getBus();
	}
	@PostMapping("/bus")
	public boolean addBus(@RequestBody Bus bus)
	{
		return aService.addBus(bus);
	}
	@GetMapping("/bus/{ToFrom}/{FromTo}/{DateOfJourney}")
	public List<Bus> searchBus(@PathVariable("ToFrom") String ToFrom,@PathVariable("FromTo")String FromTo,@PathVariable("DateOfJourney")String DateOfJourney)
	{
		return aService.searchBus( ToFrom, FromTo, DateOfJourney);
		
	}

//customer details
	@GetMapping("/customer")
	public List<Customer> getCustomer()
	{
		return aService.getCustomer();
	}
	@PostMapping("/customer")
	public boolean addCustomer(@RequestBody Customer customer)
	{
		return aService.addCustomer(customer);
	}
	
//reservation
	@GetMapping("/abus")
	public List<Booking> getBooking()
	{
		return aService.getBooking();
	}
	@PostMapping("/abus")
	public Booking addBooking(@RequestBody Booking booking)
	{
		return aService.addBooking(booking);
	}
	
//cancellation
	@DeleteMapping("/abus/{pnrno}")
	public boolean cancelreservation(@PathVariable ("pnrno") String PnrNo)
	{
		return aService.cancelreservation(PnrNo);
	}
	
// bus details
	@GetMapping("/busdetails")
	public List<Busdetails> getBusdetails()
	{
		return aService.getBusdetails();
	}
    
	@PostMapping("/busdetails")
	public boolean addVehicle(@RequestBody Busdetails busdetails)
	{
		return aService.addBusdetails(busdetails);
	}
	@GetMapping("/busdetails/{busid}")    // Passing Argument with URL and Finding the Object
	public Busdetails findBusdetails(@PathVariable("busid") String busid)
	{
			return aService.findBusdetails(busid);
	}
	@GetMapping("/busdetails/{fcity}/{tcity}/{date}")    // Passing Argument with URL and Finding the Object
	public List<Busdetails> findBusdetails(@PathVariable("fcity") String fcity,@PathVariable("tcity") String tcity,@PathVariable("date") String date)
	{
			return aService.searchBusdetails(fcity,tcity,date);
	}
	
//bus seats
	@GetMapping("/busseats")
	public List<Busseats> getAllBusseats()
	{
		return aService.getBusseats();
	}
    
	@PostMapping("/busseats")
	public boolean addSeats(@RequestBody Busseats busseats)
	{
		return aService.addBusseats(busseats);
	}
	@GetMapping("/busseats/{bid}")          // Passing Argument with URL and Finding the Object
	public List<Busseats> findBusseats(@PathVariable(name="bid") String busid)
	{
			return aService.findBusseats(busid);
	}
	@GetMapping("/updatebusseats/{bid}/{sstatus}/{sno}") 
	public boolean updatebusseats(@PathVariable("bid") String bid,@PathVariable("sstatus") String sstatus,@PathVariable("sno") String sno)
	{
			return aService.updateBusseats(bid, sstatus,sno);
	}
	
//Profile
	@GetMapping("/profile")
	public List<MyProfile> getProfile() {
		return aService.getProfile();
	}
	@PostMapping("/profile")
	public boolean addProfile(@RequestBody MyProfile profile) {
		return aService.addProfile(profile);
	}
	@GetMapping("/profile/{pid}") 
	public MyProfile findProfile(@PathVariable("pid") String pid)
	{
			return aService.findProfile(pid);
	}
	@PutMapping("/profile") //For Updating 
	public boolean updateProfile(@RequestBody MyProfile profile)
	{
		return aService.updateProfile(profile);
	}
	

//FEEDBACK	
	@GetMapping("/feedback")
	public List<MyFeedback> getFeedback() {
		return aService.getFeedback();
	}
	@PostMapping("/feedback")
	public boolean addFeedback(@RequestBody MyFeedback feedback) {
		return aService.addFeedback(feedback);
	}
/////
	@GetMapping("/custdetail/{email}")
	public List<signup> searchsignup(@PathVariable("email") String email){
		System.out.println(email);
		return aService.searchsignup(email);
		
	}
}

