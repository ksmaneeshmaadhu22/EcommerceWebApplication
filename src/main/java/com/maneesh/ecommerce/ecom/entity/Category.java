package com.maneesh.ecommerce.ecom.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Category {
	
	@Id
	@GeneratedValue
	private int CategoryId;
	private String CategoryName;
	private String CategoryDesc;
	
	public Category() {
		
	}
	
	public Category(String categoryName, String categoryDesc) {
		super();
		CategoryName = categoryName;
		CategoryDesc = categoryDesc;
	}

	public int getCategoryId() {
		return CategoryId;
	}
	public void setCategoryId(int categoryId) {
		CategoryId = categoryId;
	}
	public String getCategoryName() {
		return CategoryName;
	}
	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}
	public String getCategoryDesc() {
		return CategoryDesc;
	}
	public void setCategoryDesc(String categoryDesc) {
		CategoryDesc = categoryDesc;
	}

}
