package com.lti.booking.service;

import java.util.List;

import com.lti.booking.pojo.AdminBus;



public interface AdminBusService {

	public boolean addAdminBus(AdminBus addbus);
	public List<AdminBus> getAdminBus();
	
	public boolean deleteAdminBus(String BusId);
}
