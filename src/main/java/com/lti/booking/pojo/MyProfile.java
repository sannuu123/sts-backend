package com.lti.booking.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="myprofile18")
public class MyProfile {
	
	@Id
	@Column(name="pid")
	private String pid;
	@Column(name="name")
	private String name;
	@Column(name="dob")
	private String dob;
	@Column(name="gender")
	private String gender;
	@Column(name="mobile")
	private long mobile;
	@Column(name="email")
	private String email;
	@Column(name="address")
	private String address;
	
	
	@Override
	public String toString() {
		return "MyProfile [pid=" + pid + ", name=" + name + ", dob=" + dob + ", gender=" + gender + ", mobile=" + mobile
				+ ", email=" + email + ", address=" + address + "]";
	}
	public MyProfile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MyProfile(String pid, String name, String dob, String gender, long mobile, String email, String address) {
		super();
		this.pid = pid;
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.mobile = mobile;
		this.email = email;
		this.address = address;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}