package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Login;
import com.example.demo.services.LoginService;

@CrossOrigin(origins= "http://localhost:3000")
@RestController
public class LoginController {
	
	@Autowired
	LoginService lservice;
	
	
	@PostMapping("/Login")
	public Object checkLogin (@RequestBody Login l) {
		return lservice.checkLogin(l.getUid(), l.getPwd());
	}
	
	@PostMapping("/save")
	public Login add(@RequestBody Login l)
	{
		
		return lservice.add(l);
	}

}
