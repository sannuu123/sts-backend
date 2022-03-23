package com.lti.booking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.booking.DAO.AdminBusDAO;
import com.lti.booking.pojo.AdminBus;



@Service
@Transactional
public class AdminBusServiceImpl implements AdminBusService  {

	@Autowired
	AdminBusDAO bdao;
	
	@Override
	public boolean addAdminBus(AdminBus addbus) {
		return bdao.addAdminBus(addbus);
	}

	@Override
	public List<AdminBus> getAdminBus() {
		return bdao.getAdminBus();
	}

	@Override
	public boolean deleteAdminBus(String BusId) {
		return bdao.deleteAdminBus(BusId);
	}

	
}