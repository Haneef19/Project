package com.example.demo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entities.Customer;
import com.example.demo.entities.CustomerRegister;
import com.example.demo.entities.Login;
import com.example.demo.entities.Order;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
	

	@Query("select c from Customer c where login_id = :l")
	public Optional<Customer> findByUser(List<Login> l);
	
	
	
}
