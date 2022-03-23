package com.lti.booking.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="feedback12")
public class MyFeedback {
	
	@Id
	@Column(name="loginid")
	private String loginid;
	@Column(name="name")
	private String name;
	@Column(name="feedback")
	private String feedback;
	@Column(name="remarks")
	private String remarks;
	
	@Override
	public String toString() {
		return "MyFeedback [loginid=" + loginid + ", name=" + name + ", feedback=" + feedback + ", remarks=" + remarks
				+ "]";
	}
	public MyFeedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public MyFeedback(String loginid, String name, String feedback, String remarks) {
		super();
		this.loginid = loginid;
		this.name = name;
		this.feedback = feedback;
		this.remarks = remarks;
	}
	
	public String getLoginid() {
		return loginid;
	}
	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
}