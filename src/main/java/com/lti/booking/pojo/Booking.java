package com.lti.booking.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="booking")
public class Booking {
@Id
@GeneratedValue(strategy =GenerationType.AUTO)
@Column(name="pnrno")
	private  int PnrNo;
@Column(name="bid")
	private String bid;
@Column(name="email")
	private String email;
@Column(name="seatno")
	private String seatno;
public int getPnrNo() {
	return PnrNo;
}
public void setPnrNo(int pnrNo) {
	PnrNo = pnrNo;
}
public String getBid() {
	return bid;
}
public void setBid(String bid) {
	this.bid = bid;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getSeatno() {
	return seatno;
}
public void setSeatno(String seatno) {
	this.seatno = seatno;
}
public Booking(int pnrNo, String bid, String email, String seatno) {
	super();
	PnrNo = pnrNo;
	this.bid = bid;
	this.email = email;
	this.seatno = seatno;
}
public Booking() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Booking [PnrNo=" + PnrNo + ", bid=" + bid + ", email=" + email + ", seatno=" + seatno + "]";
}



	
}
