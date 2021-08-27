package com.maneesh.ecommerce.ecom.daointerface;

import java.util.List;

import com.maneesh.ecommerce.ecom.entity.Category;

public interface CategoryDAO {
	
	public void create(Category category);
	public void getCategory(int id);
	public List<Category> getAllCategory();
	

}
