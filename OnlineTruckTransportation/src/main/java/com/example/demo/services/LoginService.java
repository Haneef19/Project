package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Customer;
import com.example.demo.entities.Login;
import com.example.demo.entities.TruckOwner;
import com.example.demo.repositories.CustomerRepository;
import com.example.demo.repositories.LoginRepository;
import com.example.demo.repositories.TruckOwnerRepository;

@Service
public class LoginService {
	
	@Autowired
	LoginRepository lrepo;

	@Autowired
	CustomerRepository crepo;
	
	@Autowired
	TruckOwnerRepository trepo;
	
	
public Login add(Login l)
	{
	return lrepo.save(l);	
		
	}
	
	/*public String checklogin(String uid,String pwd)
	{
		
		return lrepo.checklogin(uid,pwd);
	}*/

	
public Object checkLogin(String uid, String pwd)
{
	List<Login> l= lrepo.checkLogin(uid, pwd);
	
	if(l.size()==1)
	{
		System.out.println(l.get(0).getRole());
		System.out.println(l.get(0).getLogin_id());
		
		Customer c = null;
		                   TruckOwner t=null;
		boolean flag = false;
		
		
		if(l.get(0).getRole().equals("customer"))
		{
			flag =  true;
			System.out.println("in");
			Optional<Customer> cp = crepo.findByUser(l);
			System.out.println(cp.isEmpty());
			try
			{
				c = cp.get();
			}
			catch(Exception e)
			{
				c = null;
			}
			
		}
		else if(l.get(0).getRole().equals("truckowner"))
		{
			System.out.println("in");
			
			Optional<TruckOwner> tp = trepo.findByUser(l);
			try
			{
				t = tp.get();
							
			}
			catch(Exception e)
			{
				t = null;
			}
		}
		if(flag)
		{
			return c;
		}
		else
			return t;
		
	}
	else
	{
		return null;
	}
}
	
}
