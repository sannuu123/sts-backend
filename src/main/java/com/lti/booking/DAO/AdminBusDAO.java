package com.lti.booking.DAO;

import java.util.List;

import com.lti.booking.pojo.AdminBus;


public interface AdminBusDAO {
	
	public boolean addAdminBus(AdminBus addbus);
	public List<AdminBus> getAdminBus();
	
	public boolean deleteAdminBus(String BusId);
}
