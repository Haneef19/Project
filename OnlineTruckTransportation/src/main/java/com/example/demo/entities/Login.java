package com.example.demo.entities;


import java.sql.Date;

import javax.persistence.*;

import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="login")

public class Login {
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	int login_id;
	
	@Column(length = 10)
	String uid;
	
	@Column(length = 10)
	String pwd;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(length = 10)
	Date reg_date;
	
	@Column(length = 10)
	String reg_amt;
	
	@Column(length = 10)
	String role;

	@OneToOne(mappedBy = "login")
	@JsonIgnoreProperties("login")
	private Customer customer;
	
	@OneToOne(mappedBy = "login")
	@JsonIgnoreProperties("login")
	private TruckOwner truckOwner;
	
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Login(String uid, String pwd, Date reg_date, String reg_amt, String role) {
		super();
		this.uid = uid;
		this.pwd = pwd;
		this.reg_date = reg_date;
		this.reg_amt = reg_amt;
		this.role = role;
	}


	public Login(String uid, String pwd) {
		super();
		this.uid = uid;
		this.pwd = pwd;
	
	}


	public int getLogin_id() {
		return login_id;
	}


	public void setLogin_id(int login_id) {
		this.login_id = login_id;
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


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	@Override
	public String toString() {
		return "Login [login_id=" + login_id + ", uid=" + uid + ", pwd=" + pwd + ", reg_date=" + reg_date + ", reg_amt="
				+ reg_amt + ", role=" + role + "]";
	}


	

	

}
