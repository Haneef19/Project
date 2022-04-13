package com.example.demo.entities;

import java.sql.Date;

public class TruckRegister {
	
	String uid;
	String pwd;
	Date reg_date;
	String reg_amt;
	String truck_no;
    String name;
    String address;
	String source;
	String destination;
	String contact;
	String availability_status;
	public TruckRegister() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TruckRegister(String uid, String pwd, Date reg_date, String reg_amt, String truck_no, String name,
			String address, String source, String destination, String contact, String availability_status) {
		super();
		this.uid = uid;
		this.pwd = pwd;
		this.reg_date = reg_date;
		this.reg_amt = reg_amt;
		this.truck_no = truck_no;
		this.name = name;
		this.address = address;
		this.source = source;
		this.destination = destination;
		this.contact = contact;
		this.availability_status = availability_status;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Date getReg_date() {
		return reg_date;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
	public String getReg_amt() {
		return reg_amt;
	}
	public void setReg_amt(String reg_amt) {
		this.reg_amt = reg_amt;
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
	@Override
	public String toString() {
		return "TruckRegister [uid=" + uid + ", pwd=" + pwd + ", reg_date=" + reg_date + ", reg_amt=" + reg_amt
				+ ", truck_no=" + truck_no + ", name=" + name + ", address=" + address + ", source=" + source
				+ ", destination=" + destination + ", contact=" + contact + ", availability_status="
				+ availability_status + "]";
	}
	
	
	
	

}
