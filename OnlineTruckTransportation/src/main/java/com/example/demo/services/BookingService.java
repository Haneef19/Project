package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entities.Booking;
import com.example.demo.entities.Order;
import com.example.demo.entities.TruckOwner;
import com.example.demo.repositories.BookingRepository;
import com.example.demo.repositories.OrderRepository;
import com.example.demo.repositories.TruckOwnerRepository;

@Service
public class BookingService {
	
	@Autowired
	BookingRepository brepo;
	
	@Autowired
	OrderRepository orepo;

	@Autowired
 TruckOwnerRepository trepo;
	
	
	
	public Booking add(Booking b)
	{
		return brepo.save(b);
	}
	
	
	/*public Booking booking(Booking b,TruckOwner truck,Order oid)
	{
		TruckOwner t=trepo.get();
		Order o=orepo.get(oid);
		b.setTruck_no(t);
		b.setOid(o);
		return brepo.save(b);
		
	}*/
	
	
	public List<Booking> getAll()
	{
		return brepo.findAll();
	}

}
