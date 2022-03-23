package com.lti.booking.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="busseats")
public class Busseats 
{
	@Id
	@Column(name="seatno")
	private String sno;
	@Column(name="busid")
	private String bid;
	@Column(name="seatstatus")
	private String sstatus;
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getBid() {
		return bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}
	public String getSstatus() {
		return sstatus;
	}
	public void setSstatus(String sstatus) {
		this.sstatus = sstatus;
	}
	public Busseats(String sno, String bid, String sstatus) {
		super();
		this.sno = sno;
		this.bid = bid;
		this.sstatus = sstatus;
	}
	public Busseats() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Busseats [sno=" + sno + ", bid=" + bid + ", sstatus=" + sstatus + "]";
	}
	
	

}