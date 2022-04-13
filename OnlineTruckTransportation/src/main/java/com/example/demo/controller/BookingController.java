package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Booking;
import com.example.demo.entities.Customer;
import com.example.demo.entities.Order;
import com.example.demo.entities.TruckOwner;
import com.example.demo.repositories.OrderRepository;
import com.example.demo.repositories.TruckOwnerRepository;
import com.example.demo.services.BookingService;
import com.example.demo.services.OrderService;
import com.example.demo.services.TruckOwnerService;
@CrossOrigin(origins= "http://localhost:3000")
@RestController
public class BookingController {
	
		@Autowired
		BookingService bservice;
		
		@Autowired
		OrderService oservice;
		
		@Autowired
		TruckOwnerService tservice;
		
		
		@GetMapping("/book")
		public Booking add(@RequestParam("oid") int oid,@RequestParam("tno") String tno )

		{		

			//Booking b = new Booking(tno,oid);
			//System.out.println("TRuck"+b.getTruck_no().getTruck_no());
			//System.out.println("Order"+b.getOid().getOrder_id());
			//TruckOwner t=tservice.getTruckNumber(b.getTruckowner().getTruck_no());
			TruckOwner t=tservice.getTruckNumber(tno);
			Order o=oservice.getOrderNumber(oid);
			//Order o=oservice.getOrderNumber(b.getOrder().getOrder_id());
		  	//b.setOrder(o);
		  	//b.setTruckowner(t);
			Booking b = new Booking(t,o);
			return bservice.add(b);
			
		}
		
		
		
		
		
		
		/*@GetMapping("/book")
		public Booking add(@RequestParam("oid") int oid,@RequestParam("tno") String tno )

		{		

			//Booking b = new Booking(tno,oid);
			//System.out.println("TRuck"+b.getTruck_no().getTruck_no());
			//System.out.println("Order"+b.getOid().getOrder_id());
			//TruckOwner t=tservice.getTruckNumber(b.getTruckowner().getTruck_no());
			TruckOwner t=tservice.getTruckNumber(tno);
			Order o=oservice.getOrderNumber(oid);
			//Order o=oservice.getOrderNumber(b.getOrder().getOrder_id());
		  	//b.setOrder(o);
		  	//b.setTruckowner(t);
			Booking b = new Booking(t,o);
			return bservice.add(b);
			
		}*/
		
		@GetMapping("/getbook")
		public List<Booking> getAll()
		{
			return bservice.getAll();
		}

	

}
