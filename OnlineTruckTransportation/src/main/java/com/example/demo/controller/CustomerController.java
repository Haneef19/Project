package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Customer;
import com.example.demo.entities.CustomerRegister;
import com.example.demo.entities.Login;
import com.example.demo.services.CustomerService;
import com.example.demo.services.LoginService;
@CrossOrigin(origins= "http://localhost:3000")
@RestController
public class CustomerController {
	
	@Autowired
	CustomerService cservice;
	
	@Autowired
	LoginService lservice;
	
	@PostMapping("/registerc")
	public Customer registerCustomer(@RequestBody CustomerRegister cr)
	{
		Login l=new Login(cr.getUid(),cr.getPwd(),cr.getReg_date(),cr.getReg_amt(),"customer");
		Login inserted=lservice.add(l);
		Customer c=new Customer(cr.getName(),cr.getAddress(),cr.getContact(),cr.getGstin(),inserted);
		return cservice.add(c);
	}
	
	
	
	

}
