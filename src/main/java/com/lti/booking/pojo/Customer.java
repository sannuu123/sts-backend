package com.lti.booking.pojo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="customer00")
public class Customer 
{
	@Id
	@Column(name="customerid")
	private String CustId;
	@Column(name="name")
	private String CustName;
	@Column(name="gender")
	private String Gender;
	@Column(name="age")
	private String Age;
	@Column(name="phoneno")
	private String PhNo;
	
	public String getCustId() {
		return CustId;
	}
	public void setCustId(String custId) {
		CustId = custId;
	}
	public String getCustName() {
		return CustName;
	}
	public void setCustName(String custName) {
		CustName = custName;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getAge() {
		return Age;
	}
	public void setAge(String age) {
		Age = age;
	}
	public String getPhNo() {
		return PhNo;
	}
	public void setPhNo(String phNo) {
		PhNo = phNo;
	}
	public Customer(String custId, String custName, String gender, String age, String phNo) {
		super();
		CustId = custId;
		CustName = custName;
		Gender = gender;
		Age = age;
		PhNo = phNo;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [CustId=" + CustId + ", CustName=" + CustName + ", Gender=" + Gender + ", Age=" + Age + "]";
	}
	
	
	
	
	
}
