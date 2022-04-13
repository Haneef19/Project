package com.example.demo.services;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Booking;
import com.example.demo.entities.Customer;
import com.example.demo.entities.Order;
import com.example.demo.entities.TruckOwner;
import com.example.demo.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	OrderRepository orepo;
	
	public Order add(Order o)
	{
		
		
		return orepo.save(o);
	}

	public List<Order> getAll()
	{
		return orepo.findAll();
	}
	
	public Order getOrderNumber(int oid)
	{
		
		 Order oc=orepo.findById(oid).get();
	  /* Optional<Order> oc = orepo.findById(oid);
		Order t = null;
		 try
		 {
			 t = oc.get();
		 }
		 catch(NoSuchElementException e)
		 {
			 t=null;
		 }
		 
		 return t;*/
		 
		 return oc;
		 
	}
	
	
	public int getCustByOrder(int oid)
	
	{
		
		Customer customer=orepo.findById(oid).get().getCustomer();
		
		return customer.getCust_id();
	}
	
	
	
	
}
