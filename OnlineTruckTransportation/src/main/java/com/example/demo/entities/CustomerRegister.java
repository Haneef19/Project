package com.example.demo.entities;

import java.sql.Date;

public class CustomerRegister {
	
	String uid;
	String pwd;
	Date reg_date;
	String reg_amt;
    String name;
    String address;
	String contact;
	String gstin;
	
	
	public CustomerRegister() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CustomerRegister(String uid, String pwd, Date reg_date, String reg_amt, String name, String address,
			String contact, String gstin) {
		super();
		this.uid = uid;
		this.pwd = pwd;
		this.reg_date = reg_date;
		this.reg_amt = reg_amt;
		this.name = name;
		this.address = address;
		this.contact = contact;
		this.gstin = gstin;
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


	@Override
	public String toString() {
		return "CustomerRegister [uid=" + uid + ", pwd=" + pwd + ", reg_date=" + reg_date + ", reg_amt=" + reg_amt
				+ ", name=" + name + ", address=" + address + ", contact=" + contact + ", gstin=" + gstin + "]";
	}


	
	
}
