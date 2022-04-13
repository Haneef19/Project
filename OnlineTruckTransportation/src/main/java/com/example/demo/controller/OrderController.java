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
import com.example.demo.entities.Order;
import com.example.demo.entities.TruckOwner;
import com.example.demo.services.CustomerService;
import com.example.demo.services.OrderService;
import com.example.demo.services.TruckOwnerService;
@CrossOrigin(origins= "http://localhost:3000")
@RestController
public class OrderController {
	
	@Autowired
	
OrderService oservice;
	
	@Autowired
	CustomerService cservice;
	
	@Autowired
	TruckOwnerService tservice;

	
	@PostMapping("/order")
	public Order add(@RequestBody Order o)
	{
		Customer c = cservice.getCustomer(o.getCustomer().getCust_id());
		o.setCustomer(c);
		
		return oservice.add(o);
	}
	
	@GetMapping("/getall")
	public List<Order> getAll()
	{
		return oservice.getAll();
	}
	
	@GetMapping("getbyid/{oid}")
public int getCustByOrder(@PathVariable int oid)
	
	{
		
		int cust_id=oservice.getCustByOrder(oid);
		
		return cust_id;
	}
	

}
