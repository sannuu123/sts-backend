package com.lti.booking.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Busdetails")
public class Busdetails 
{
	@Id
	@Column(name="busid")
	private String bid;
	@Column(name="fromcity")
	private String fcity;
	@Column(name="tocity")
	private String tcity;
	@Column(name="driverid")
	private String did;
	@Column(name="busname")
	private String bname;
	@Column(name="noofseatsavailable")
	private String noseats;
	@Column(name="doj")
	private String djourn;
	@Column(name="ticketprice")
	private int tprice;
	public Busdetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Busdetails(String bid, String fcity, String tcity, String did, String bname, String noseats, String djourn,int tprice) {
		super();
		this.bid = bid;
		this.fcity = fcity;
		this.tcity = tcity;
		this.did = did;
		this.bname = bname;
		this.noseats = noseats;
		this.djourn = djourn;
		this.tprice=tprice;
	}
	@Override
	public String toString() {
		return "Busdetails [bid=" + bid + ", fcity=" + fcity + ", tcity=" + tcity + ", did=" + did + ", bname=" + bname
				+ ", noseats=" + noseats + ", djourn=" + djourn + ", tprice=" + tprice +"]";
	}
	public String getBid() {
		return bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}
	public String getFcity() {
		return fcity;
	}
	public void setFcity(String fcity) {
		this.fcity = fcity;
	}
	public String getTcity() {
		return tcity;
	}
	public void setTcity(String tcity) {
		this.tcity = tcity;
	}
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getNoseats() {
		return noseats;
	}
	public void setNoseats(String noseats) {
		this.noseats = noseats;
	}
	public String getDjourn() {
		return djourn;
	}
	public void setDjourn(String djourn) {
		this.djourn = djourn;
	}
	public int getTprice() {
		return tprice;
	}
	public void setTprice(int tprice) {
		this.tprice = tprice;
	}
	
	

}