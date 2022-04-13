package com.example.demo.services;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Customer;
import com.example.demo.entities.Order;
import com.example.demo.entities.TruckOwner;
import com.example.demo.repositories.TruckOwnerRepository;

@Service
public class TruckOwnerService 

{
	@Autowired
	TruckOwnerRepository trepo;
	
	public TruckOwner add(TruckOwner t)
	{
		
		return trepo.save(t);
		
	}
	
	public List<TruckOwner> getAll()
	{
		return trepo.findAll();
	}
	
	
	public TruckOwner getTruckNumber(String truck_id)
	{
		
		TruckOwner tc=trepo.findById(truck_id).get();
		/* Optional<TruckOwner> tc = trepo.findById(truck);
		TruckOwner t = null;
		 try
		 {
			 t = tc.get();
		 }
		 catch(NoSuchElementException e)
		 {
			 t=null;
		 }
		 return t;*/
		return tc;
	}
	
	
	
	
	
}
