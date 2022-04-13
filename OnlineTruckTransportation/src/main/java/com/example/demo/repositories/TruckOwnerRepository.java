package com.example.demo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Booking;
import com.example.demo.entities.Customer;
import com.example.demo.entities.Login;
import com.example.demo.entities.TruckOwner;

@Repository
public interface TruckOwnerRepository extends JpaRepository<TruckOwner, String> {

	
	@Query("select t from TruckOwner t where login_id = :l")
	public Optional<TruckOwner> findByUser(List<Login> l);
	
	@Query("select t from TruckOwner t where t.availability_status='yes' order by t.availability_status")
	public List<TruckOwner> getAll();
	
	
}
