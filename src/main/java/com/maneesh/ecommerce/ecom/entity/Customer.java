package com.maneesh.ecommerce.ecom.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Customer {
	
	@Id
	private String username;
	private String password;
	private String custName;
	private String email;
	private String mobile;
	private String address;
	

	
	public Customer() {
		super();
	}

	public Customer(String username, String password, String custName, String email, String mobile, String address) {
		super();
		
		this.username = username;
		this.password = password;
		this.custName = custName;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
