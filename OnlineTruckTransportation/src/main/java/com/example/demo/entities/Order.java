package com.example.demo.entities;

import java.sql.Date;
import java.util.List;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="order_table")
public class Order {
	
	@Id
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	int order_id;
	
	@Column(length = 10)
	String source_add;
	
	@Column(length = 10)
	String dest_add;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(length = 10)
	Date start_date;
	

	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(length = 10)
	Date end_date;
	
	@Column(length = 10)
	String m_weight;
	
	@Column(length = 10)
	String m_qty;
	
	@Column(length = 10)
	String m_price;

	@Column
	String status;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="cust_id")
	@JsonIgnoreProperties("orders")
	private Customer customer;
	
	@OneToOne(mappedBy = "order")
	@JsonIgnoreProperties("order")
	private Booking b;

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(String source_add, String dest_add, Date start_date, Date end_date, String m_weight, String m_qty,
			String m_price, String status, Customer customer, Booking b) {
		super();
		this.source_add = source_add;
		this.dest_add = dest_add;
		this.start_date = start_date;
		this.end_date = end_date;
		this.m_weight = m_weight;
		this.m_qty = m_qty;
		this.m_price = m_price;
		this.status = status;
		this.customer = customer;
		this.b = b;
	}
	
	
	
	public Order(String source_add, String dest_add, Date start_date, Date end_date, String m_weight, String m_qty,
			String m_price, String status, Customer customer) {
		super();
		this.source_add = source_add;
		this.dest_add = dest_add;
		this.start_date = start_date;
		this.end_date = end_date;
		this.m_weight = m_weight;
		this.m_qty = m_qty;
		this.m_price = m_price;
		this.status = status;
		this.customer = customer;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public String getSource_add() {
		return source_add;
	}

	public void setSource_add(String source_add) {
		this.source_add = source_add;
	}

	public String getDest_add() {
		return dest_add;
	}

	public void setDest_add(String dest_add) {
		this.dest_add = dest_add;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	public String getM_weight() {
		return m_weight;
	}

	public void setM_weight(String m_weight) {
		this.m_weight = m_weight;
	}

	public String getM_qty() {
		return m_qty;
	}

	public void setM_qty(String m_qty) {
		this.m_qty = m_qty;
	}

	public String getM_price() {
		return m_price;
	}

	public void setM_price(String m_price) {
		this.m_price = m_price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Booking getB() {
		return b;
	}

	public void setB(Booking b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "Order [order_id=" + order_id + ", source_add=" + source_add + ", dest_add=" + dest_add + ", start_date="
				+ start_date + ", end_date=" + end_date + ", m_weight=" + m_weight + ", m_qty=" + m_qty + ", m_price="
				+ m_price + ", status=" + status + ", customer=" + customer + ", b=" + b + "]";
	}



}
