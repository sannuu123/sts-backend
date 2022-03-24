package com.lti.booking.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.booking.pojo.Booking;
import com.lti.booking.pojo.Bus;
import com.lti.booking.pojo.Busdetails;
import com.lti.booking.pojo.Busseats;
import com.lti.booking.pojo.Customer;
import com.lti.booking.pojo.Login;
import com.lti.booking.pojo.MyFeedback;
import com.lti.booking.pojo.MyProfile;
import com.lti.booking.pojo.contactus;
import com.lti.booking.pojo.signup;


@Repository
public class BookingDAOImpl implements BookingDAO{

	@Autowired
	EntityManager eMan;
//signup
	@Override
	public boolean mysignup(signup signup) 
	{
		eMan.persist(signup);
		Login obj=new Login();
		obj.setLoginid(signup.getEmail());
		obj.setPasswd(signup.getPassword());
		obj.setRole("user");
		eMan.persist(obj);
		return true;
	}

	
//Login	
	@Override
	public boolean validateLogin(String logid, String pass) 
	{
		Query qry2=eMan.createQuery("from Login log where log.loginid =?1 and log.passwd=?2 and log.role='user'");
		qry2.setParameter(1,logid);
		qry2.setParameter(2, pass);		
		
		List<Login> users=qry2.getResultList();		
			if(users.size()>0)
					return true;
			else
					return false;
	}
	@Override
	public boolean adminvalidateLogin(String logid, String pass)
	{
	Query qry2=eMan.createQuery("from Login log where log.loginid =?1 and log.passwd=?2 and log.role='admin'" );
	qry2.setParameter(1,logid);
	qry2.setParameter(2, pass);

	List<Login> users=qry2.getResultList();
	if(users.size()>0)
	return true;
	else
	return false;

	}
//contact-us
	@Override
	public boolean mycontactus(contactus contactus) 
	{
		eMan.persist(contactus);
		return true;
	}
	
//Search Bus
	@Override
	public boolean addBus(Bus bus) {
		eMan.persist(bus);
		return true;
	}
	@Override
	public List<Bus> getBus() {
		return eMan.createQuery("from Bus").getResultList();
	}
	@Override
	public List<Bus> searchBus( String ToFrom, String FromTo, String DateOfJourney) {
		Query qry2=eMan.createQuery("from Bus b where  b.ToFrom=?1 and b.FromTo=?2 and b.DateOfJourney=?3");
		
		qry2.setParameter(1,ToFrom);
		qry2.setParameter(2,FromTo);
		qry2.setParameter(3,DateOfJourney);
		List<Bus>res=qry2.getResultList();
		return res ;	
	}
	
//customer details
	@Override
	public boolean addCustomer(Customer customer) {
		eMan.persist(customer);
		return true;
	}
	@Override
	public List<Customer> getCustomer() {
		return eMan.createQuery("from Customer").getResultList();	
		}
	
//Reservation
	@Override
	public Booking addBooking(Booking booking) {
		eMan.persist(booking);
		Booking obj=eMan.find(Booking.class,booking.getPnrNo());
		System.out.println(obj);
		return obj;
	}
	@Override
	public List<Booking> getBooking() {
		return eMan.createQuery("from Booking").getResultList();	
	}
	
//Cancellation
	@Override
	public boolean cancelreservation(String PnrNo) {
		Booking obj=eMan.find(Booking.class,PnrNo);
		eMan.remove(obj);
		return true;
	}
	
//Bus Details
	@Override
	public boolean addBusdetails(Busdetails busdetails) {
	eMan.persist(busdetails);
	return true;
	}
	@Override
	public List<Busdetails> getBusdetails(){
		return eMan.createQuery("from Busdetails").getResultList();
	}
	@Override
	public List<Busdetails> searchBusdetails(String fcity,String tcity,String date){
		Query qry2= eMan.createQuery("from Busdetails b where b.fcity = ?1 and b.tcity =?2 and b.djourn=?3");
        qry2.setParameter(1,fcity);
        qry2.setParameter(2, tcity);
        qry2.setParameter(3, date);
		List<Busdetails> res=qry2.getResultList();
		return res;
	}
	@Override
	public Busdetails findBusdetails(String busid) {
				Busdetails obj=eMan.find(Busdetails.class,busid);
		return obj;
	}
	
//Busseats
	@Override
	public boolean addBusseats(Busseats busseats) {
	eMan.persist(busseats);
	return true;
	}
	@Override
	public List<Busseats> getBusseats(){
		return eMan.createQuery("from Busseats").getResultList();
	}
	@Override
	public List<Busseats> findBusseats(String busid) {
       Query qry2= eMan.createQuery("from Busseats b where b.bid = ?1");
        qry2.setParameter(1,busid);
		List<Busseats> res=qry2.getResultList();
		return res;
	}
	@Override
	public boolean updateBusseats(String bid,String sstatus,String sno) {
		  Query qry2= eMan.createQuery("update Busseats  b set   b.sstatus=?1 where  b.bid = ?2 and b.sno=?3");
	        qry2.setParameter(1,sstatus);
	        qry2.setParameter(2,bid);
	        qry2.setParameter(3,sno);
			int count=qry2.executeUpdate();
			if(count>0)
				return true;
		    else
				return false;

	}
	
//Profile
	@Override
	public boolean addProfile(MyProfile profile) {
		eMan.persist(profile);
		return true;
	}
	@Override
	public List<MyProfile> getProfile() {
		
		return eMan.createQuery("from MyProfile").getResultList();
	}
	@Override
	public boolean updateProfile(MyProfile profile) {	
		eMan.merge(profile);
		   return true;
		}
	@Override
	public MyProfile findProfile(String pid) {
		MyProfile obj=eMan.find(MyProfile.class, pid);
		return obj;
	}

//Feedback
	@Override
	public boolean addFeedback(MyFeedback feedback) {
		// TODO Auto-generated method stub
		eMan.persist(feedback);
		return true;
	}
	@Override
	public List<MyFeedback> getFeedback() {
		// TODO Auto-generated method stub
		return eMan.createQuery("from MyFeedback").getResultList();
	}


	@Override
	public List<signup> searchsignup(String email) {
		Query qry1=eMan.createQuery("from signup logs where logs.email =?1");
		qry1.setParameter(1,email);
		List<signup> user=qry1.getResultList();
		return user;
	}


	
	}
	

	


