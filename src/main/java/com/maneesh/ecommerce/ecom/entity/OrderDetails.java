package com.maneesh.ecommerce.ecom.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class OrderDetails {
	
	@Id
	@GeneratedValue
	private int orderId;
	private String productName;
	private int price;
	
	public OrderDetails() {
		super();
	}
	
	public OrderDetails(String name, int price) {
		super();
		this.productName = name;
		this.price = price;
		
	}

	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
