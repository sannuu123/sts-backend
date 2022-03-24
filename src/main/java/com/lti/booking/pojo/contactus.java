package com.lti.booking.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contactus")
public class contactus {
	
	
	@Column(name="fullname")
	private String fullname;
	@Id
	@Column(name="emailid")
	private String emailid;
	
	@Column(name="mobileno")
	private String mobileno;
	
	@Column(name="message")
	private String message;

	public contactus() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public contactus(String fullname, String emailid, String mobileno, String message) {
		super();
		this.fullname = fullname;
		this.emailid = emailid;
		this.mobileno = mobileno;
		this.message = message;
	}
	
	
	
	@Override
	public String toString() {
		return "contactus [fullname=" + fullname + ", emailid=" + emailid + ", mobileno=" + mobileno + ", message="
				+ message + "]";
	}



	public String getFullname() {
		return fullname;
	}



	public void setFullname(String fullname) {
		this.fullname = fullname;
	}



	public String getEmailid() {
		return emailid;
	}



	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}



	public String getMobileno() {
		return mobileno;
	}



	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}



	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}
	
	


}