package com.example.demo.entities;

import java.sql.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="booking")
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int booking_id;
	
	/*@OneToOne (fetch = FetchType.EAGER)
	@Column
	String driver_name;
	
	//@OneToOne (fetch = FetchType.EAGER)
	@Column
	String driver_contact;*/
	
	
	@OneToOne (cascade = CascadeType.ALL)
	@JsonIgnoreProperties("book")
	@JoinColumn(name="truck_id")
		TruckOwner truckowner;
	
	@OneToOne (cascade = CascadeType.ALL)
	@JsonIgnoreProperties("b")
	@JoinColumn(name="order_id")
	Order order;
	 
	

	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Booking(TruckOwner to, Order order) {
		this.truckowner=to;
		this.order = order;
	}



	public int getBooking_id() {
		return booking_id;
	}



	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}



	public TruckOwner getTruckowner() {
		return truckowner;
	}



	public void setTruckowner(TruckOwner truckowner) {
		this.truckowner = truckowner;
	}



	public Order getOrder() {
		return order;
	}



	public void setOrder(Order order) {
		this.order = order;
	}



	@Override
	public String toString() {
		return "Booking [booking_id=" + booking_id + ", truckowner=" + truckowner + ", order=" + order + "]";
	}



	

}
