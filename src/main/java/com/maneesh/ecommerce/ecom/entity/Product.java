package com.maneesh.ecommerce.ecom.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Product {

	@Id
	@GeneratedValue
	private int ProductId;
	private int CategoryId;
	private String ProductName;
	private String ProductDesc;
	private int Price;

	public Product() {
		super();
	}

	public Product(String productName, String productDesc, int price2) {
		super();
		ProductName = productName;
		ProductDesc = productDesc;
		Price = price2;
	}
//	private Category CategoryId;

//	@OneToMany
//	private Supplier SupplierId;

	public int getProductId() {
		return ProductId;
	}

	public int getCategoryId() {
		return CategoryId;
	}

	public void setCategoryId(int categoryId) {
		CategoryId = categoryId;
	}

	public void setProductId(int productId) {
		ProductId = productId;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public String getProductDesc() {
		return ProductDesc;
	}

	public void setProductDesc(String productDesc) {
		ProductDesc = productDesc;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}
//	public Category getCategoryId() {
//		return CategoryId;
//	}
//	public void setCategoryId(Category categoryId) {
//		CategoryId = categoryId;
//	}
//	public Supplier getSupplierId() {
//		return SupplierId;
//	}
//	public void setSupplierId(Supplier supplierId) {
//		SupplierId = supplierId;
//	}

}
