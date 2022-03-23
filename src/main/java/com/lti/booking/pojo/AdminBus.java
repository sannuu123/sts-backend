package com.lti.booking.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="adminbus0")
public class AdminBus {
	@Id
	@Column(name="busid")
	private String BusId;
	@Column(name="tofrom")
	private String ToFrom;
	@Column(name="fromto")
	private String FromTo;
	@Column(name="driverid")
	private String DriverId;
	
	@Override
	public String toString() {
		return "AdminBus [BusId=" + BusId + ", ToFrom=" + ToFrom + ", FromTo=" + FromTo + ", DriverId=" + DriverId
				+ "]";
	}
	public AdminBus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AdminBus(String busId, String toFrom, String fromTo, String driverId) {
		super();
		BusId = busId;
		ToFrom = toFrom;
		FromTo = fromTo;
		DriverId = driverId;
	}
	public String getBusId() {
		return BusId;
	}
	public void setBusId(String busId) {
		BusId = busId;
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
	public String getDriverId() {
		return DriverId;
	}
	public void setDriverId(String driverId) {
		DriverId = driverId;
	}
	

}
