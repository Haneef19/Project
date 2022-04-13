package com.example.demo.services;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Customer;
import com.example.demo.entities.Login;
import com.example.demo.repositories.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository crepo;
	
	public Customer add(Customer c)
	{
		
		return crepo.save(c);
	}
	
	public Customer getCustomer(int cid)
	{
		 Optional<Customer> oc = crepo.findById(cid);
		 Customer c = null;
		 try
		 {
			 c = oc.get();
		 }
		 catch(NoSuchElementException e)
		 {
			 c=null;
		 }
		 return c;
	}
	
	
	
	
	
	
}
