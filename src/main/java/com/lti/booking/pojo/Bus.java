package com.lti.booking.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bus01")
public class Bus 
{
	@Id
	@Column(name="busno")
	private String BusNo;
	@Column(name="tofrom")
	private String ToFrom;
	@Column(name="fromto")
	private String FromTo;
	@Column(name="journeydate")
	private String  DateOfJourney;
	
	public String getBusNo() {
		return BusNo;
	}
	public void setBusNo(String busNo) {
		BusNo = busNo;
	}
	public String getToFrom() {
		return ToFrom;
	}
	public void setToFrom(String toFrom) {
		ToFrom = toFrom;
	}
	public String getFromTo() {
		return FromTo;
	}
	public void setFromTo(String fromTo) {
		FromTo = fromTo;
	}
	public String getDateOfJourney() {
		return DateOfJourney;
	}
	public void setDateOfJourney(String dateOfJourney) {
		DateOfJourney = dateOfJourney;
	}
	public Bus(String busNo, String toFrom, String fromTo, String dateOfJourney) {
		super();
		BusNo = busNo;
		ToFrom = toFrom;
		FromTo = fromTo;
		DateOfJourney = dateOfJourney;
	}
	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Bus [BusNo=" + BusNo + ", ToFrom=" + ToFrom + ", FromTo=" + FromTo + ", DateOfJourney=" + DateOfJourney
				+ "]";
	}

}
