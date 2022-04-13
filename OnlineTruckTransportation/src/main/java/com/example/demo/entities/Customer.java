package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="customer")
public class Customer {
	@Id
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	int cust_id;

	@Column
	String name;
	@Column
	String address;

	@Column
	String contact;
	@Column
	String gstin;

	@OneToOne (cascade=CascadeType.ALL)
	@JoinColumn(name="login_id")
	//@JsonIgnoreProperties("customer")
	Login login;

	//	@OneToMany(mappedBy ="cust")
	//	private List<Order> orders;
	
	@OneToMany(mappedBy ="customer" ,cascade=CascadeType.ALL,orphanRemoval = true,fetch = FetchType.EAGER )
	
	private List<Order> orders=new ArrayList<>();
	

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Customer(String name, String address, String contact, String gstin, Login login, List<Order> orders) {
		super();
		this.name = name;
		this.address = address;
		this.contact = contact;
		this.gstin = gstin;
		this.login = login;
		this.orders = orders;
	}
	
	


	public Customer(String name, String address, String contact, String gstin, Login login) {
		super();
		this.name = name;
		this.address = address;
		this.contact = contact;
		this.gstin = gstin;
		this.login = login;
	}


	public int getCust_id() {
		return cust_id;
	}


	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
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


	public String getContact() {
		return contact;
	}


	public void setContact(String contact) {
		this.contact = contact;
	}


	public String getGstin() {
		return gstin;
	}


	public void setGstin(String gstin) {
		this.gstin = gstin;
	}


	public Login getLogin() {
		return login;
	}


	public void setLogin(Login login) {
		this.login = login;
	}


	public List<Order> getOrders() {
		return orders;
	}


	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}


	@Override
	public String toString() {
		return "Customer [cust_id=" + cust_id + ", name=" + name + ", address=" + address + ", contact=" + contact
				+ ", gstin=" + gstin + ", login=" + login + ", orders=" + orders + "]";
	}


}
