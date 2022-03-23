package com.lti.booking.DAO;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.booking.pojo.AdminBus;

@Repository
public class AdminBusDAOImpl implements AdminBusDAO {

	@Autowired
	EntityManager eMan;
	
	@Override
	public boolean addAdminBus(AdminBus addbus) {
		eMan.persist(addbus);
		return true;
	}

	@Override
	public List<AdminBus> getAdminBus() {
		return eMan.createQuery("from AdminBus").getResultList();	
		}

	@Override
	public boolean deleteAdminBus(String BusId) {
		AdminBus obj=eMan.find(AdminBus.class,BusId);
		eMan.remove(obj);
		return true;
	}	
	}


