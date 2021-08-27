package com.maneesh.ecommerce.ecom.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.maneesh.ecommerce.ecom.daointerface.CategoryDAO;
import com.maneesh.ecommerce.ecom.entity.Category;
import com.maneesh.ecommerce.ecom.repository.CategoryRepository;

@Component
public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	CategoryRepository repo;
	
	@Override
	public void create(Category category) {
		repo.save(category);
	}

	@Override
	public void getCategory(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Category> getAllCategory() {
		// TODO Auto-generated method stub
		return (List<Category>) repo.findAll();
	}

}
