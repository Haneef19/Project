package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Customer;
import com.example.demo.entities.Login;
import com.example.demo.entities.TruckOwner;
import com.example.demo.entities.TruckRegister;
import com.example.demo.services.LoginService;
import com.example.demo.services.TruckOwnerService;

@CrossOrigin(origins= "http://localhost:3000")
@RestController
public class TruckOwnerController {
	
	
	@Autowired
	TruckOwnerService tservice;
	
	@Autowired
	LoginService lservice;
	
	@PostMapping("/registert")
	public TruckOwner registerTruck (@RequestBody TruckRegister tr)
	{
		Login l=new Login(tr.getUid(),tr.getPwd(),tr.getReg_date(),tr.getReg_amt(),"truckowner");
		Login inserted=lservice.add(l);
		TruckOwner t=new TruckOwner(tr.getTruck_no(),tr.getName(),tr.getAddress(),tr.getSource(),tr.getDestination(),tr.getContact(),tr.getAvailability_status(),inserted);
		return tservice.add(t);
	}

	@GetMapping("/viewt")
	public List<TruckOwner> getAll()
	{
		
		
		return tservice.getAll();
		
	}
	
	
		
	

}
