package com.lti.booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.booking.pojo.AdminBus;
import com.lti.booking.service.AdminBusService;

@RestController
@RequestMapping("/rest/api/")
//@CrossOrigin("http://localhost:4200")
public class AdminBusController {

	@Autowired
	AdminBusService aService;
	
	@GetMapping("/aabus")
	public List<AdminBus> getAdminBus()
	{
		return aService.getAdminBus();
	}
	@PostMapping("/aabus")
	public boolean addAdminBus(@RequestBody AdminBus addbus)
	{
		return aService.addAdminBus(addbus);
	}
	@DeleteMapping("/aabus/{busId}")
	public boolean deleteAdminBus(@PathVariable ("busId")String BusId)
	{
		return aService.deleteAdminBus(BusId);
	}
}
