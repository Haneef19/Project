package com.example.demo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Booking;
import com.example.demo.entities.Customer;
import com.example.demo.entities.Login;
import com.example.demo.entities.Order;
import com.example.demo.entities.TruckOwner;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

	//Order getOrderNumber(int order_id);

	@Query("select o from Order o where o.status='pending' order by status")
	public Order getAll();
	
	
	
	
}
