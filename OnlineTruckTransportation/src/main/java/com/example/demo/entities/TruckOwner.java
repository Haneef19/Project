package com.example.demo.entities;

import java.sql.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="truckowner")
public class TruckOwner 


{
 @Id
 @Column(length = 10)
 String truck_no;
	
 @Column(length = 20)
	String name;
	
 @Column(length = 20)
	String address;
	
 @Column(length = 20)
	String source;
	
 @Column(length = 20)
	String destination;
	
 @Column(length = 20)
	String contact;
	
 @Column(length = 10)
	String availability_status;
	
		
	@OneToOne (cascade=CascadeType.ALL)
	@JoinColumn(name="login_id")
	@JsonIgnoreProperties("truckOwner")
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	Login login;
	
	@OneToOne (mappedBy = "truckowner")
	@JsonIgnoreProperties("truckowner")
	Booking book;
	
	

	
	public TruckOwner() {
		super();
		// TODO Auto-generated constructor stub
	}

//	 @OneToOne(mappedBy = "truck_no")
//	    private Booking b;
	


	public TruckOwner(String truck_no, String name, String address, String source, String destination, String contact,
			String availability_status, Login login) {
		super();
		this.truck_no = truck_no;
		this.name = name;
		this.address = address;
		this.source = source;
		this.destination = destination;
		this.contact = contact;
		this.availability_status = availability_status;
		this.login = login;
	}




	public String getTruck_no() {
		return truck_no;
	}




	public void setTruck_no(String truck_no) {
		this.truck_no = truck_no;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}




	public String getSource() {
		return source;
	}




	public void setSource(String source) {
		this.source = source;
	}




	public String getDestination() {
		return destination;
	}




	public void setDestination(String destination) {
		this.destination = destination;
	}




	public String getContact() {
		return contact;
	}




	public void setContact(String contact) {
		this.contact = contact;
	}




	public String getAvailability_status() {
		return availability_status;
	}




	public void setAvailability_status(String availability_status) {
		this.availability_status = availability_status;
	}




	public Login getLogin() {
		return login;
	}




	public void setLogin(Login login) {
		this.login = login;
	}




	@Override
	public String toString() {
		return "TruckOwner [truck_no=" + truck_no + ", name=" + name + ", address=" + address + ", source=" + source
				+ ", destination=" + destination + ", contact=" + contact + ", availability_status="
				+ availability_status + ", login=" + login + "]";
	}

	

	
	
	

}
